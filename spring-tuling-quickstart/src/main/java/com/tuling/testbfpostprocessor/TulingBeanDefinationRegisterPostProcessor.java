package com.tuling.testbfpostprocessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.stereotype.Component;

/**
 * Created by smlz on 2019/5/26.
 */
@Component
public class TulingBeanDefinationRegisterPostProcessor implements BeanDefinitionRegistryPostProcessor {

	/*
	 BeanDefinitionRegistryPostProcessor的执行时机：
	 所有的bean定义信息将要被加载到容器中，Bean实例还没有被初始化。

	 BeanFactoryPostProcessor的执行时机：
	 所有的Bean定义信息已经加载到容器中，但是Bean实例还没有被初始化.
	 */

    @Override
    public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {
        System.out.println("TulingBeanDefinationRegisterPostProcessor的postProcessBeanDefinitionRegistry方法");
        System.out.println("bean定义的数据量:"+registry.getBeanDefinitionCount());
        RootBeanDefinition rootBeanDefinition = new RootBeanDefinition(TulingLog.class);
        registry.registerBeanDefinition("tulingLog",rootBeanDefinition);
    }

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        System.out.println("TulingBeanDefinationRegisterPostProcessor的postProcessBeanFactory方法");
        System.out.println(beanFactory.getBeanDefinitionCount());
    }
}
