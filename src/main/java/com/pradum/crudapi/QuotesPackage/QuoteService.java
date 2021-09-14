package com.pradum.crudapi.QuotesPackage;

import org.springframework.http.HttpStatus;

import java.util.List;
import java.util.Optional;

public interface QuoteService {
    Quote createQuote(Quote quote);

    List<Quote> retrieveAllQuote();

    Optional<Quote> retrieveQuoteById(Long Id);

    HttpStatus deleteQuote(Long id);

    Quote updateQuote(Long id , Quote quote);

}
