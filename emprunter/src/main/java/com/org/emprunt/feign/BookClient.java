package com.org.emprunt.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.org.emprunt.DTO.BookDTO;

@FeignClient(name = "book-service")
public interface BookClient {

    @GetMapping("/books/{id}")
    BookDTO getBook(@PathVariable Long id);
}
