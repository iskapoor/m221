package com.example.sping_portfolio.controllers;
import com.example.sping_portfolio.unit7.GrayScale;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

import java.io.File;

@Controller  // HTTP requests are handled as a controller, using the @Controller annotation
public class Alive {
    @GetMapping("/alive")
    // CONTROLLER handles GET request for /greeting, maps it to greeting() and does variable bindings


    public String page(Model model) {
        String[] names = {"Ishan", "Justin", "Luca", "Mort MORT MORT!", "Paul", "Rohan", "Roop", "Ryan", "Sammy", "Yeonjoon"};
        String[] arr = {"images/ishaan.jpg","images/justinli.jpg","images/lucapinto.jpg","images/mort.jpg","images/paulbok.jpg","images/rohankos.jpg","images/roop.jpg","images/rynamog.jpg","images/sammahj.jpg","images/yeongjoong.jpg"};
        String[] dead = {"Ishan", "Luca"}; // any names in this list that match those in the names[] array will be grayscaled with sam's file

        // checks for any strings in the dead[] array that match the names[] array and applies the grayscale function to their pictures in arr[]
        for (int i =0; i < names.length; i++) {
            for (String k : dead) {
                if (names[i] == k) {
                    File input = new File(arr[i]);
                    String outputName = arr[i].substring(arr[i].indexOf("/") + 1);
                    System.out.println(outputName);
                    GrayScale.GrayScale(input, outputName);
                }
            }
        }

        // returns the names and pictures to the HTML view
        model.addAttribute("arr", arr);
        model.addAttribute("names", names);
        return "alive"; // returns HTML VIEW (greeting)
    }
}

