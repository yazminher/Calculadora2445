package com.example.calculadora2445;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText num1;
    private EditText num2;
    private TextView resultado;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        num1= findViewById(R.id.num1);
        num2= findViewById(R.id.num2);
        resultado= findViewById(R.id.resultado);
    }


    public void sumar(View View ){
        Integer  resultadoNumero = Integer.parseInt(num1.getText().toString())+Integer.parseInt(num2.getText().toString());
        resultado.setText(resultadoNumero +"");


    }

    public void restar(View View ){
        Integer  resultadoNumero = Integer.parseInt(num1.getText().toString())-Integer.parseInt(num2.getText().toString());
        resultado.setText(resultadoNumero +"");


    }

    public void multiplicar(View View ){
        Integer  resultadoNumero = Integer.parseInt(num1.getText().toString())*Integer.parseInt(num2.getText().toString());
        resultado.setText(resultadoNumero +"");


    }
    public void dividir(View View ){
        Integer  resultadoNumero = Integer.parseInt(num1.getText().toString())/Integer.parseInt(num2.getText().toString());
        resultado.setText(resultadoNumero +"");


    }
}