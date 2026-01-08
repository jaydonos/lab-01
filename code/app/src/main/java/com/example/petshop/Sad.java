package com.example.petshop;

import java.util.Date;

public class Sad extends Mood {
    public Sad(String mood) {
        super(mood);
    }

    public Sad(String mood, Date date) {
        super(mood, date);
    }

    public String strMood() {
        return "Sad";
    }
}
