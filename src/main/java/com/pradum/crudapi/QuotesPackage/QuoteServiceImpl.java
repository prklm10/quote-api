package com.pradum.crudapi.QuotesPackage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class QuoteServiceImpl implements QuoteService{

    @Autowired
    private QuoteRepositry quoteRepositry;


    @Override
    public Quote createQuote(Quote quote) {
        return quoteRepositry.save(quote);
    }

    @Override
    public List<Quote> retrieveAllQuote() {
        return quoteRepositry.findAll();
    }

    @Override
    public Optional<Quote> retrieveQuoteById(Long id) {
        return quoteRepositry.findById(id);
    }

    @Override
    public HttpStatus deleteQuote(Long id) {

       Optional<Quote> flag = quoteRepositry.findById(id);
        if(flag.isPresent()){
                quoteRepositry.deleteById(id);
            return HttpStatus.OK;
        }
        return HttpStatus.NOT_FOUND;


    }

    @Override
    public Quote updateQuote(Long id, Quote quote) {
        Optional<Quote> flag = quoteRepositry.findById(id);
        if(flag.isPresent()) {
            Quote newFlag = flag.get();
            newFlag.setId(quote.getId());
            newFlag.setAuthor(quote.getAuthor());
            newFlag.setQuote(quote.getQuote());

           return quoteRepositry.save(newFlag);
        }
        return null;
    }
}
