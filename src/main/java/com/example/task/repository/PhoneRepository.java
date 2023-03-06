package com.example.task.repository;

import com.example.task.model.Phone;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class PhoneRepository {
    private final Map<Integer, Phone> phones = new HashMap<>(10);

    public PhoneRepository() {
        this.phones.put(phones.size() + 1, new Phone(phones.size() + 1, "Samsung Galaxy S9"));
        this.phones.put(phones.size() + 1, new Phone(phones.size() + 1, "Samsung Galaxy S8"));
        this.phones.put(phones.size() + 1, new Phone(phones.size() + 1, "Samsung Galaxy S8"));
        this.phones.put(phones.size() + 1, new Phone(phones.size() + 1, "Motorola Nexus 6"));
        this.phones.put(phones.size() + 1, new Phone(phones.size() + 1, "Oneplus 9"));
        this.phones.put(phones.size() + 1, new Phone(phones.size() + 1, "Apple iPhone 13"));
        this.phones.put(phones.size() + 1, new Phone(phones.size() + 1, "Apple iPhone 12"));
        this.phones.put(phones.size() + 1, new Phone(phones.size() + 1, "Apple iPhone 11"));
        this.phones.put(phones.size() + 1, new Phone(phones.size() + 1, "iPhone X"));
        this.phones.put(phones.size() + 1, new Phone(phones.size() + 1, "Nokia 3310"));
    }

    public List<Phone> findAll() {
        return new ArrayList<>(phones.values());
    }

    public boolean update(int id, boolean isAvailable, Date date, String user) throws Exception {
        if (!phones.containsKey(id)) {
            throw new Exception("Phone with id " + id + " is not found");
        }
        Phone phone = phones.get(id);
        phone.setAvailable(isAvailable);
        phone.setBookedAt(date);
        phone.setUser(user);
        return true;
    }
}