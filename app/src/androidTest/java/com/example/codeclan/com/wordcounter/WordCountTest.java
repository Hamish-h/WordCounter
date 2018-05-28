package com.example.codeclan.com.wordcounter;

import org.junit.Before;
import org.junit.Test;
import static junit.framework.Assert.assertEquals;

public class WordCountTest {

    public WordCounter wordCount;

    @Before
    public void before(){
        this.wordCount = new WordCounter();
    }

    @Test
    public void testWordCounter(){
        wordCount.countWords("hello world how are you all");
        assertEquals(6, wordCount.numberOfWords());
    }
}


