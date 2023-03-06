package com.example.task.controller;

import com.example.task.model.Phone;
import com.example.task.service.PhoneService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/phones")
@RequiredArgsConstructor
public class PhoneController {
    @Autowired
    private PhoneService phoneService;

    @GetMapping("/list")
    public List<Phone> getAll() {
        return phoneService.getAll();
    }

    @PostMapping("/book")
    public void book(@RequestParam(name = "id") int id, @RequestParam(name = "user") String user) {
        try {
            phoneService.book(id, user);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @PostMapping("/release")
    public void release(@RequestParam(name = "id") int id) {
        try {
            phoneService.release(id);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}