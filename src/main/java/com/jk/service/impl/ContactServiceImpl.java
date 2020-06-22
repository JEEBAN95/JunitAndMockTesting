package com.jk.service.impl;

import java.util.List;

import com.jk.dao.ContactDao;
import com.jk.exception.NoDataFoundException;
import com.jk.model.Contact;
import com.jk.service.ConctactService;

public class ContactServiceImpl implements ConctactService {

	private ContactDao contactDao;

	
	public void setContactDao(ContactDao contactDao) {
		this.contactDao = contactDao;
		
	}

	@Override
	public String getNameById(Integer id) {
		
		String name = contactDao.findNameById(id);
		String formattedName = name.toUpperCase();
		return formattedName;
	}

	@Override
	public List<String> getAllContactNames() {
		List<String> names = contactDao.findNames();
		if (!names.isEmpty()) {
			return names;
		}
		return null;
	}

	@Override
	public Contact getContactInfoById(Integer id) {
		Contact contact = contactDao.findById(id);
		if (contact == null) {
			throw new NoDataFoundException();
		}
		return contact;
	}
}