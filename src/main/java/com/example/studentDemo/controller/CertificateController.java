package com.example.studentDemo.controller;

import com.example.studentDemo.repository.CertificateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;

@Controller
public class CertificateController {
    @Autowired
    private CertificateRepository repository;

}
