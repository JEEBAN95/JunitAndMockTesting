package com.jk;

import com.jk.service.ConctactService;
import com.jk.service.impl.ContactServiceImpl;

public class App {
	public static void main(String[] args) {
		System.out.println();
		ConctactService contactService = new ContactServiceImpl();
		contactService.getAllContactNames();
		
	}
}
