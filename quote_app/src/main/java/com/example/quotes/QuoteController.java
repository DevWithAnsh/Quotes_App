package com.example.quotes;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class QuoteController {

    String[] quotes = {
            "Stay hungry, stay foolish.",
            "Code. Break. Fix. Repeat.",
            "First, solve the problem. Then, write the code.",
            "Simplicity is the soul of efficiency.",
            "Dream big. Start small. Act now."
    };

    Random random = new Random();

    @GetMapping("/")
    public String getQuote() {
        int index = random.nextInt(quotes.length);
        return "<h1>" + quotes[index] + "</h1>";
    }
}
