package com.org.emprunt.entities;

import jakarta.persistence.*;


import java.time.LocalDate;

@Entity
public class Emprunter
 {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public Long getId() {
        return id;
    }

  

    private Long userId;  
    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    private Long bookId;

    public Long getBookId() {
        return bookId;
    }

    public void setBookId(Long bookId) {
        this.bookId = bookId;
    }

    private LocalDate empruntDate;
  
    public LocalDate getEmpruntDate() {
        return empruntDate;
    }

    public void setEmpruntDate(LocalDate empruntDate) {
        this.empruntDate = empruntDate;
    }

    public Emprunter() {
        this.empruntDate = LocalDate.now();
    }

    
}
