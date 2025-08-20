package com.example.contact;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ContactTest {
    @Test
    public void testContactCreation() {
        Contact contact = new Contact("001", "Jane", "Doe", "1234567890", "123 Main St");

        assertEquals("001", contact.getContactId());
        assertEquals("Jane", contact.getFirstName());
        assertEquals("Doe", contact.getLastName());
        assertEquals("1234567890", contact.getPhone());
        assertEquals("123 Main St", contact.getAddress());
    }

    @Test
    public void testSetFirstName() {
        Contact contact = new Contact("001", "Jane", "Doe", "1234567890", "123 Main St");
        contact.setFirstName("Alice");
        assertEquals("Alice", contact.getFirstName());
    }

    @Test
    public void testSetLastName() {
        Contact contact = new Contact("001", "Jane", "Doe", "1234567890", "123 Main St");
        contact.setLastName("Smith");
        assertEquals("Smith", contact.getLastName());
    }

    @Test
    public void testSetPhone() {
        Contact contact = new Contact("001", "Jane", "Doe", "1234567890", "123 Main St");
        contact.setPhone("0987654321");
        assertEquals("0987654321", contact.getPhone());
    }

    @Test
    public void testSetAddress() {
        Contact contact = new Contact("001", "Jane", "Doe", "1234567890", "123 Main St");
        contact.setAddress("456 Elm St");
        assertEquals("456 Elm St", contact.getAddress());
    }
}
