package com.example.quotes;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class QuoteController {

    String[] quotes = {
            "Stay hungry, stay foolish nd bkar.",
            "Code. Break. Fix. Repeat and success nd sucessssssssssssss",
            "First, solve the problem. Then, write the code okkkkkkkkkk.",
            "Simplicity is the soul of efficiency okkyyyyyy.",
            "Dream big. Start small. Act now. nd get sucesssss"
    };

    Random random = new Random();

    @GetMapping("/")
    public String getQuote() {
        int index = random.nextInt(quotes.length);
        return "<h3>" + quotes[index] + "</h3>";
    }
}
