package com.example.sping_portfolio.controllers;
import com.example.sping_portfolio.unit7.GrayScale;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.io.File;

@Controller  // HTTP requests are handled as a controller, using the @Controller annotation
public class Leaderboard {
    @GetMapping("/leaderboard")
    // CONTROLLER handles GET request for /greeting, maps it to greeting() and does variable bindings
    public String page(Model model) {
            String first = "Mort MORT MORT!";
            String second = "Ishan";
            String third = "Yeonjoon";


            // returns the names and pictures to the HTML view
            model.addAttribute("first", first);
            model.addAttribute("second", second);
            model.addAttribute("third", third);
            return "leaderboard"; // returns HTML VIEW (greeting)
    }
}