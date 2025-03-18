package com.example.addressbook.interfaces;

import com.example.addressbook.dto.ContactDTO;
import com.example.addressbook.model.Contact;

import java.util.List;

public interface IAddressBookService {
    Contact createAddressBookEntry(ContactDTO dto);
    List<Contact> getAllEntries();
    Contact getEntryById(Long id);
    Contact updateEntry(Long id, ContactDTO dto);
    void deleteEntry(Long id);
}