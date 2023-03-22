package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText primeirovalor, segundovalor;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        primeirovalor = findViewById(R.id.pv);
        segundovalor = findViewById(R.id.sv);
        result = findViewById(R.id.result);
    }
    public void somar (View V) {
        int pv = Integer.parseInt(primeirovalor.getText().toString());
        int sv = Integer.parseInt(segundovalor.getText().toString());

        result.setText((pv + sv)+"");
    }
    public void subtrair (View V) {
        int pv = Integer.parseInt(primeirovalor.getText().toString());
        int sv = Integer.parseInt(segundovalor.getText().toString());

        result.setText((pv - sv)+"");
    }
    public void multiplicar (View V) {
        int pv = Integer.parseInt(primeirovalor.getText().toString());
        int sv = Integer.parseInt(segundovalor.getText().toString());

        result.setText((pv * sv)+"");
    }

    public void dividir (View V) {
        int pv = Integer.parseInt(primeirovalor.getText().toString());
        int sv = Integer.parseInt(segundovalor.getText().toString());

        result.setText((pv / sv)+"");
    }

    }

