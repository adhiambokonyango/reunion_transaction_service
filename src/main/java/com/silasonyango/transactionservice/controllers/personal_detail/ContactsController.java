package com.silasonyango.transactionservice.controllers.personal_detail;


import com.silasonyango.transactionservice.repository.personal_detail.ContactsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/contacts")
public class ContactsController {
    @Autowired
    ContactsRepository contactsRepository;
}
