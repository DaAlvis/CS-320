package com.example.contact;

import java.util.HashMap;
import java.util.Map;

public class ContactService {
    private Map<String, Contact> contacts = new HashMap<>();

    public void addContact(Contact contact) {
        if (contact == null || contacts.containsKey(contact.getContactId())) {
            throw new IllegalArgumentException("Invalid or duplicate contact.");
        }
        contacts.put(contact.getContactId(), contact);
    }

    public void deleteContact(String contactId) {
        if (!contacts.containsKey(contactId)) {
            throw new IllegalArgumentException("Contact not found.");
        }
        contacts.remove(contactId);
    }

    public Contact getContact(String contactId) {
        return contacts.get(contactId);
    }

    public void updateFirstName(String contactId, String newFirstName) {
        Contact contact = getContact(contactId);
        if (contact != null && newFirstName != null && newFirstName.length() <= 10) {
            contact.setFirstName(newFirstName);
        } else {
            throw new IllegalArgumentException("Invalid first name.");
        }
    }

    public void updateLastName(String contactId, String newLastName) {
        Contact contact = getContact(contactId);
        if (contact != null && newLastName != null && newLastName.length() <= 10) {
            contact.setLastName(newLastName);
        } else {
            throw new IllegalArgumentException("Invalid last name.");
        }
    }

    public void updatePhone(String contactId, String newPhone) {
        Contact contact = getContact(contactId);
        if (contact != null && newPhone != null && newPhone.matches("\\d{10}")) {
            contact.setPhone(newPhone);
        } else {
            throw new IllegalArgumentException("Invalid phone number.");
        }
    }

    public void updateAddress(String contactId, String newAddress) {
        Contact contact = getContact(contactId);
        if (contact != null && newAddress != null && newAddress.length() <= 30) {
            contact.setAddress(newAddress);
        } else {
            throw new IllegalArgumentException("Invalid address.");
        }
    }
}
