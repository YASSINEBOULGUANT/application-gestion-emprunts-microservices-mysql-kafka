package com.org.emprunt.DTO;

import java.time.LocalDate;

public class EmpruntDetailsDTO {

    private Long empruntId;

    public Long getEmpruntId() {
        return empruntId;
    }

    public void setEmpruntId(Long empruntId) {
        this.empruntId = empruntId;
    }

    private String userName;
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    private String title;
    public String getTitle() {
        return title;
    }

    public void setTitle(String bookTitle) {
        this.title = bookTitle;
    }

    private LocalDate dateEmprunt;

    public LocalDate getDateEmprunt() {
        return dateEmprunt;
    }

    public void setDateEmprunt(LocalDate dateEmprunt) {
        this.dateEmprunt = dateEmprunt;
    }

    public EmpruntDetailsDTO() {}

    public EmpruntDetailsDTO(Long empruntId, String userName, String bookTitle, LocalDate dateEmprunt) {
        this.empruntId = empruntId;
        this.userName = userName;
        this.title = bookTitle;
        this.dateEmprunt = dateEmprunt;
    }

   
}
