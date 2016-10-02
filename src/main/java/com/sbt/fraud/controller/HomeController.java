package com.sbt.fraud.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Константин on 02.10.2016.
 */
@Controller
public class HomeController {
    @RequestMapping(value = "/")
    public String home() {
        return "test";
    }
}
