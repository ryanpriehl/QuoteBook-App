package com.example.ryan.thequotebook;

/**
 * Created by Ryan on 10/6/2017.
 */

public class Quote {

    private String quote, person;

    public Quote(String quote, String person){
        this.quote = quote;
        this.person = person;
    }

    public String getQuote() {
        return quote;
    }

    public String getPerson() {
        return person;
    }

}
