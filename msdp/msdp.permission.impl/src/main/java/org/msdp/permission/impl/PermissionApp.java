package org.msdp.permission.impl;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wuzhenbao.msdp.user.api.service.MsdpUserService;

/**
 * Hello world!
 *
 */
public class PermissionApp 
{
    public static void main( String[] args )
    {
    	 ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
         System.out.println(context.getDisplayName()+":here");
         context.start();
         MsdpUserService userService = context.getBean(MsdpUserService.class);
         try {
			System.out.println(userService.indexJson());
		} catch (Exception e) {
			
		}
         System.out.println("MsdpPermissionService is started.");
    }
}
