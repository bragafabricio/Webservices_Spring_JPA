package com.projeto.demo.resources;

import com.projeto.demo.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @GetMapping
    public ResponseEntity <User> findAll(){
        User u = new User(1L, "Maria", "maria@gmail.com", "234-5678", "1234" );
        return ResponseEntity.ok().body(u);
    }

}
