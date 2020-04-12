package com.github.abnvanand.washeteria.controller;

import com.github.abnvanand.washeteria.data.entity.User;
import com.github.abnvanand.washeteria.service.WasheteriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/data")
public class WebServiceController {

    private final WasheteriaService washeteriaService;

    @Autowired
    public WebServiceController(WasheteriaService washeteriaService) {
        this.washeteriaService = washeteriaService;
    }

    @GetMapping
    public List<User> getUsers(){
        return Collections.singletonList(this.washeteriaService.doLogin("abhinav.anand@students.iiit.ac.in", "password"));
    }
}
