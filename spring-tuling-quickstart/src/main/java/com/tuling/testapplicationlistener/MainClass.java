package com.tuling.testapplicationlistener;

import com.tuling.testapplicationlistener.config.MainConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass{

	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(MainConfig.class);

		//手动发布一个事件
//		ctx.publishEvent(new ApplicationEvent("我手动发布了一个事件") {
//			@Override
//			public Object getSource() {
//				return super.getSource();
//			}
//		});


		//容器关闭也会发布事件（ContextClosedEvent）
		ctx.close();
	}
}
