package com.example.codeclan.com.wordcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class WordCounterActivity extends AppCompatActivity {

    EditText input_data;
    TextView answer;
    Button count;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_word_counter);

        input_data = findViewById(R.id.input_data);
        answer = findViewById(R.id.answer_text);
        count = findViewById(R.id.count_button);
    }

    public int onButtonClick(View button) {
        WordCounter wordCounter = new WordCounter();
        int answer = wordCounter.countWords(input_data.getText().toString());
        String question = input_data.getText().toString();
//        return answer;
        return wordCounter.numberOfWords();

    }
}
