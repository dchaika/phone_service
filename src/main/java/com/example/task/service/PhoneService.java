package com.example.task.service;

import com.example.task.model.Phone;
import com.example.task.repository.PhoneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class PhoneService {
    @Autowired
    private PhoneRepository phoneRepository;

    public List<Phone> getAll() {
        return phoneRepository.findAll();
    }

    public boolean book(int id, String user) throws Exception {
        return phoneRepository.update(id, false, new Date(), user);
    }

    public boolean release(int id) throws Exception {
        return phoneRepository.update(id, true, null, null);
    }
}