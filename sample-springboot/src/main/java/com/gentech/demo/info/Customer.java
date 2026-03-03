package com.gentech.demo.info;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Customer {

    @GetMapping("/msg")
    public String getMessage()
    {
        return "Welcome to the Happy Customers !!!";
    }

    @GetMapping("/desc")
    public String getCustomerDesc()
    {
        return "This Customer provides Services on Laptops and Desktops!!";
    }

    @GetMapping("/fact/{num}")
    public Integer getFactorial(@PathVariable Integer num)
    {
        int fact=1;
        for(int i=num;i>=1;i--)
        {
            fact=fact * i;
        }
        return fact;
    }
}
