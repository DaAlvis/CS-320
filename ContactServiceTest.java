package com.example.contact;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ContactServiceTest {
    private ContactService service;

    @BeforeEach
    public void setUp() {
        service = new ContactService();
    }

    @Test
    public void testAddContact() {
        Contact contact = new Contact("001", "John", "Doe", "1234567890", "123 Main St");
        service.addContact(contact);
        assertEquals(contact, service.getContact("001"));
    }

    @Test
    public void testDeleteContact() {
        Contact contact = new Contact("002", "Jane", "Smith", "0987654321", "456 Elm St");
        service.addContact(contact);
        service.deleteContact("002");
        assertNull(service.getContact("002"));
    }

    @Test
    public void testUpdateFirstName() {
        Contact contact = new Contact("003", "Alice", "Brown", "1112223333", "789 Oak Ave");
        service.addContact(contact);
        service.updateFirstName("003", "Alicia");
        assertEquals("Alicia", service.getContact("003").getFirstName());
    }

}
