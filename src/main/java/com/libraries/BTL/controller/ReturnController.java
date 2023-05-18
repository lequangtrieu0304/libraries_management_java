package com.libraries.BTL.controller;

import com.libraries.BTL.dto.return_book.ReturnDto;
import com.libraries.BTL.service.impl.ReturnServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/return_book")
public class ReturnController {
    @Autowired
    ReturnServiceImpl returnServiceImpl;
    @PostMapping("/create")
    public ResponseEntity<String> createReturnBook(@RequestBody ReturnDto returnDto){
        String result = returnServiceImpl.createReturnBook(returnDto);
        return new ResponseEntity<>(result, HttpStatus.OK);
    }
}
