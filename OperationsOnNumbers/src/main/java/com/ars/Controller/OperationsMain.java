package com.ars.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class OperationsMain {

    @RequestMapping("/add")
    public int add() {
        int x = 10;
        int y = 20;
        return x + y;
    }
    @RequestMapping("/sub")
    public int sub() {
        int x = 10;
        int y = 20;
        return y - x;
    }@RequestMapping("/mul")
    public int mul() {
        int x = 10;
        int y = 20;
        return x * y;
    }@RequestMapping("/div")
    public int div() {
        int x = 10;
        int y = 20;
        return y / x;
    }


}