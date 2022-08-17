package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private TextView textView2;
    private Button button;
    private ArrayList<String> phrases = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Instanciamento de elementos
        textView2 = findViewById(R.id.textView2);
        button = findViewById(R.id.button);

        phrases.add("Luck is what happens when preparation meets opportunity.");
        phrases.add("All cruelty springs from weakness.");
        phrases.add("Wealth is the slave of the wise. The master of the fool.");
        phrases.add("If a man knows not to which port he sails, no wind is favorable.");
        phrases.add("Time heals what reason cannot.");
        phrases.add("Difficulties strengthen the mind, as labor does the body.");

        //Listener do botão, estrutura de callback para ocorrer algo quando tiver ação no botão
        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random random = new Random();
                int position = random.nextInt(phrases.size());
                String phrase = phrases.get(position);

                textView2.setText(phrase);

            }
        };
        button.setOnClickListener(listener);
    }
}

