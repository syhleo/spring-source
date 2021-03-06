package com.tuling.testspringiocstarter;

import com.tuling.testspringiocstarter.service.impl.BasicUnitConvertServiceImpl;
import com.tuling.testspringiocstarter.service.impl.DataDictRedisServiceImpl;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.HashMap;

/**
 * Created by smlz on 2019/6/12.
 */
public class MainClass {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(MainConfig.class);
        System.out.println(ctx.getBean("baseLabelServiceImpl"));
		System.out.println(ctx.getBean(BasicUnitConvertServiceImpl.class));
		System.out.println(ctx.getBean(DataDictRedisServiceImpl.class));
		System.out.println(ctx.getBean("tulingDao"));
       // System.out.println(ctx.getBean(TulingDao.class));
		HashMap<String,String> personMap=new HashMap<>();
		personMap.put("1","person1");
		personMap.get("k");
    }
}
