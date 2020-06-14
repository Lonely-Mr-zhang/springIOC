package io.github.lonelyMrZhang.ui;

import io.github.lonelyMrZhang.dao.IAccountDao;
//import io.github.lonelyMrZhang.factory.BeanFactory;
import io.github.lonelyMrZhang.service.IAccountService;
import io.github.lonelyMrZhang.service.impl.AccountServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @description: 模拟表现层，调用业务层
 * @author: lonely.mr.zhang
 * @date: 2020/6/12 12:53 上午
 */
public class Client {

    /**
     * 获取Spring的IOC核心容器，并根据id获取对象
     * @param args
     */
    public static void main(String[] args) {
        //1、获取核心容器
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        //2、根据id获取对象
        IAccountService accountService = (IAccountService)ac.getBean("accountService");
        IAccountDao accountDao =  ac.getBean("accountDao", IAccountDao.class);

        System.out.println(accountService);
        System.out.println(accountService);
    }
}
