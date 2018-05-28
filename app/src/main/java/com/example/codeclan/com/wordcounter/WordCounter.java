package com.example.codeclan.com.wordcounter;

import android.support.v7.app.AppCompatActivity;

public class WordCounter extends AppCompatActivity {

    int words;

    public int countWords(String word) {
        this.words = word.split("\\s+").length;
        return 0;
    }

    public int numberOfWords() {
        return this.words;
    }
}


