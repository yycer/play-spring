//package com.frankie.demo.circleDependency;
//
//import org.springframework.web.context.ConfigurableWebApplicationContext;
//import org.springframework.web.context.ContextLoaderListener;
//import org.springframework.web.context.support.XmlWebApplicationContext;
//
///**
// * @author: Yao Frankie
// * @date: 2020/4/12 15:50
// */
//public class SpringContextLoaderListener extends ContextLoaderListener {
//
//    @Override
//    protected void customizeContext(ServletContext servletContext, ConfigurableWebApplicationContext applicationContext) {
//        super.customizeContext(servletContext, applicationContext);
//
//        XmlWebApplicationContext context = (XmlWebApplicationContext) applicationContext;
//        context.setAllowBeanDefinitionOverriding(false); //在这里将XmlWebApplicationContext属性allowBeanDefinitionOverriding设置为false,这个属性的值最终
//        //会传递给DefaultListableBeanFactory类的allowBeanDefinitionOverriding属性
//    }
//}
