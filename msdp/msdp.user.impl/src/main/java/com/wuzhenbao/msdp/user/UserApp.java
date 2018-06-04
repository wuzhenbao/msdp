package com.wuzhenbao.msdp.user;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class UserApp 
{
    public static void main( String[] args ) throws IOException
    {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        System.out.println(context.getDisplayName()+":here");
        context.start();
        System.out.println("MsdpUserService is started.");
        System.in.read();
    }
}
