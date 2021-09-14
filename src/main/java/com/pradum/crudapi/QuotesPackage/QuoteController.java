package com.pradum.crudapi.QuotesPackage;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class QuoteController {

    @Autowired
    QuoteServiceImpl quoteService;

    @GetMapping("/hello")
    public List<String> hello(){
        return List.of("hello","world");
    }
    @GetMapping("/quotes")
    public List<Quote> getAllQuotes(){
        return quoteService.retrieveAllQuote();
    }
    @GetMapping("/quote/{id}")
    public Optional<Quote> getQuoteById(@PathVariable long id){
        return (quoteService.retrieveQuoteById(id));
    }

    @PostMapping("/quote")
    public Quote createQuote(@RequestBody Quote quote){

        return quoteService.createQuote(quote);
    }

    @PutMapping("/quote/{id}")
    public Quote modifyQuote(@PathVariable Long id, @RequestBody Quote quote){

        quote.setId(id);
        return quoteService.updateQuote(id,quote);

    }
    @DeleteMapping("/quote/{id}")
    public HttpStatus deleteQuote(@PathVariable Long id){
        return quoteService.deleteQuote(id);

    }


}
