package com.org.emprunt.repositories;
import org.springframework.data.jpa.repository.JpaRepository;

import com.org.emprunt.entities.Emprunter;



public interface EmpruntRepository extends JpaRepository<Emprunter, Long> {
}
