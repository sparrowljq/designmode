package com.lzu.edu.cn.desiginmode.mediator;

import java.util.Date;
/**
 * 
 * @author junqiangliu 创建中介类
 */
public class ChatRoom {
	public static void showMessage(User user, String message) {
		System.out.println(new Date().toString()+"["+user.getName()+"] :"+message);

	}
}
