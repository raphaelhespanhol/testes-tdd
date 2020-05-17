package com.brothers.controller;

import com.brothers.controller.dto.UserDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.net.URI;

@RestController
@RequestMapping("api/users")
public class UserController {

    @PostMapping
    public ResponseEntity create(@Valid @RequestBody UserDTO user){
        return ResponseEntity.created(URI.create("/id?".concat("1"))).body(user);
    }

}
