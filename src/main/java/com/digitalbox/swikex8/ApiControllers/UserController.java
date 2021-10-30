/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.digitalbox.swikex8.ApiControllers;

import com.digitalbox.swikex8.Models.User;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author j2fl
 */

@RestController
//@RequestMapping(path="/user", produces="application/json")
//@CrossOrigin(origins="*")
public class UserController {
    
    @GetMapping("/hello")
    User Hello()
    {
        return new User();
    }
    
}
