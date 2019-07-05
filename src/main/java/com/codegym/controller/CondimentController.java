package com.codegym.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Optional;

@Controller
public class CondimentController {
    @GetMapping("/")
    public ModelAndView showForm() {
        ModelAndView modelAndView = new ModelAndView("/giavi");
        return modelAndView;

    }

    @PostMapping("/giavi")
    public String giavi(@RequestParam("condiment") String[] condiments, Model model) {
        if (condiments == null) {
            model.addAttribute("message","kho qua");
            return "/giavi";
        } else {
            model.addAttribute("condiments",condiments);
            return "/giavi";
        }


    }
    }

