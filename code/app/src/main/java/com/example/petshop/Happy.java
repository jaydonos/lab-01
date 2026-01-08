package com.example.petshop;

import java.util.Date;

public class Happy extends Mood{

    public Happy(String mood) {
        super(mood);
    }

    public Happy(String mood, Date date) {
        super(mood, date);
    }

    public String strMood() {
        return "Happy";
    }


}
