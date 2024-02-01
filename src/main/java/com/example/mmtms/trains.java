
package com.example.mmtms;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class trains {
    @GetMapping ("/trains")
    public String getData() { return "Please book trains ticket from MMT at 30 % discount" ; }
}