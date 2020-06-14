package io.github.lonelyMrZhang.ui;

import io.github.lonelyMrZhang.dao.IAccountDao;
//import io.github.lonelyMrZhang.factory.BeanFactory;
import io.github.lonelyMrZhang.service.IAccountService;
import io.github.lonelyMrZhang.service.impl.AccountServiceImpl;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import javax.xml.XMLConstants;

/**
 * @description: 模拟表现层，调用业务层
 * @author: lonely.mr.zhang
 * @date: 2020/6/12 12:53 上午
 */
public class Client {

    /**
     * 获取Spring的IOC核心容器，并根据id获取对象
     *
     * @param args
     */
/*    public static void main(String[] args) {
        //1、获取核心容器
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        //2、根据id获取对象
        IAccountService accountService = (IAccountService)ac.getBean("accountService");
        IAccountDao accountDao =  ac.getBean("accountDao", IAccountDao.class);

        System.out.println(accountService);
        System.out.println(accountService);
    }*/

    /**
     * 加载配置文件的不同方式
     *
     * @param args
     */
/*    public static void main(String[] args) {
        //1、获取核心容器
//        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");

        //在桌面放置配置文件看能否加载，路径前面应该多加一个/
        ApplicationContext ac = new FileSystemXmlApplicationContext("//Users/mac/Desktop/bean.xml");
        //2、根据id获取对象
        IAccountService accountService = (IAccountService) ac.getBean("accountService");
        IAccountDao accountDao = ac.getBean("accountDao", IAccountDao.class);

        System.out.println(accountService);
        System.out.println(accountService);
    }*/

    /**
     * 核心容器构建的两种方式
     *
     * @param args
     */
    public static void main(String[] args) {
        /**
         * 饿汉模式：
         */
        //1、获取核心容器
//        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");

        /**
         * 懒汉模式
         */
        Resource resource = new ClassPathResource("bean.xml");
        BeanFactory ac = new XmlBeanFactory(resource);

        //2、根据id获取对象
        IAccountService accountService = (IAccountService) ac.getBean("accountService");
        IAccountDao accountDao = ac.getBean("accountDao", IAccountDao.class);

        System.out.println(accountService);
        System.out.println(accountService);


    }
}
