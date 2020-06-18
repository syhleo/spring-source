package com.tuling.testconfiuration;

import com.tuling.testconfiuration.config.MainConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(MainConfig.class);
        //System.out.println(ctx.getBean("person"));//会报错，因为是按照方法名来的。。。
        System.out.println(ctx.getBean("person"));//正确   com.tuling.testconfiuration.compent.Person@b3d7190
    }
}
