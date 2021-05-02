package com.the.controller;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import com.the.mybatis.MybatisManager;

@WebListener
public class TestListener implements ServletContextListener {


    public TestListener() {
       
    }


    public void contextDestroyed(ServletContextEvent sce)  { 
         System.out.println("어플리케이션이 종료될 때 실행됩니다.");
    }


    public void contextInitialized(ServletContextEvent sce)  { 
         System.out.println("어플리케이션을 실행할 때 작동됩니다.");
         
         ServletContext sc = sce.getServletContext();
         sc.setAttribute("sf", MybatisManager.getInstance());
    }
	
}
