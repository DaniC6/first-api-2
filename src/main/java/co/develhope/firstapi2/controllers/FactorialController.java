package co.develhope.firstapi2.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FactorialController {

    @GetMapping("/{num}")
        public Integer getFactorial(@PathVariable (required = false) Integer num){
        int fact =1;
        for (int i =1 ; i <= num; i++) {
            fact = fact * i;
        }
        return fact;
    }


}
