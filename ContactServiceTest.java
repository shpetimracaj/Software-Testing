//Created by Tim Racaj
package com.contacts;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ContactServiceTest {
    @Test
    public void testAddContact() {
        ContactService service = new ContactService();
        Contact contact = new Contact("1234567890", "John", "Doe", "1234567890", "123 Main St");
        assertTrue(service.addContact(contact));
    }

    @Test
    public void testDeleteContact() {
        ContactService service = new ContactService();
        Contact contact = new Contact("1234567890", "John", "Doe", "1234567890", "123 Main St");
        service.addContact(contact);
        assertTrue(service.deleteContact("1234567890"));
    }

    @Test
    public void testUpdateContact() {
        ContactService service = new ContactService();
        Contact contact = new Contact("1234567890", "John", "Doe", "1234567890", "123 Main St");
        service.addContact(contact);
        assertTrue(service.updateContact("1234567890", "Tim", "Smith", "0237654321", "123 Wolcott St"));
        assertEquals("Tim", service.getContact("1234567890").getFirstName());
        assertEquals("Smith", service.getContact("1234567890").getLastName());
        assertEquals("0237654321", service.getContact("1234567890").getPhone());
        assertEquals("123 Wolcott St", service.getContact("1234567890").getAddress());
    }
}
