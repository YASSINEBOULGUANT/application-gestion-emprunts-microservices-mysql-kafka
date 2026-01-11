package com.org.emprunt.controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.org.emprunt.DTO.EmpruntDetailsDTO;
import com.org.emprunt.entities.Emprunter;
import com.org.emprunt.service.EmpruntService;

@RestController
@RequestMapping("/emprunts")
public class EmpruntController {

    private final EmpruntService service;

    public EmpruntController(EmpruntService service) {
        this.service = service;
    }

    @PostMapping("/{userId}/{bookId}")
    public Emprunter emprunterBook(
            @PathVariable Long userId,
            @PathVariable Long bookId) {

        return service.createEmprunt(userId, bookId);
    }

    @GetMapping
    public List<EmpruntDetailsDTO> getAllEmprunts() {
        return service.getAllEmprunts();
    }
}
