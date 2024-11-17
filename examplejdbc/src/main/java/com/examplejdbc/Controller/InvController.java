package com.examplejdbc.Controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.examplejdbc.service.InvService;

import jakarta.persistence.Entity;

@RestController
@RequestMapping("/api/inv")
@Entity
public class InvController {

	@Autowired
    private InvService invService;

    @GetMapping
    public List<Map<String, Object>> getAllInv() {
        return invService.getAllInv();
    }
}
