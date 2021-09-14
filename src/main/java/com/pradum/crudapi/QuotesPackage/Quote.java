package com.pradum.crudapi.QuotesPackage;

import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table
public class Quote {

    @Id
    @GeneratedValue()
    private Long Id;

    @Column(name = "quotes")
    private String Quote;
    @Column(name = "author")
    private String Author;

    @CreationTimestamp
    private Date PublishedOn;


    // == Constructors


    public Quote(Long id, String quote, String author, Date publishedOn) {
        Id = id;
        Quote = quote;
        Author = author;
        PublishedOn = publishedOn;
    }
    public Quote(){

    }

    // == public ==
    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getQuote() {
        return Quote;
    }

    public void setQuote(String quote) {
        Quote = quote;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public Date getPublishedOn() {
        return PublishedOn;
    }

    public void setPublishedOn(Date publishedOn) {
        PublishedOn = publishedOn;
    }

    // == Override ==

    @Override
    public String toString() {
        return "Quote{" +
                "Id=" + Id +
                ", Quote='" + Quote + '\'' +
                ", Author='" + Author + '\'' +
                ", PublishedOn=" + PublishedOn +
                '}';
    }
}
