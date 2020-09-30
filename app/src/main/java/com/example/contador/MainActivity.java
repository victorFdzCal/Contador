package com.example.contador;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView txt_contador = null;
    private int cont;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt_contador = (TextView) findViewById(R.id.showCount);//Enlazamos el contador(showCount) con el elemento de java (txt_contador)
        cont = 0;
    }

    public void incrementarContador(View view) {
        cont++;
        if(cont >= 100){
            txt_contador.setTextSize(200);
            Toast.makeText(this,R.string.txt_cien,Toast.LENGTH_LONG).show();
        }
        txt_contador.setText(Integer.toString(cont));
    }

    public void mensajeToad(View view) {
        Toast.makeText(this, R.string.toast_message,Toast.LENGTH_LONG).show();
    }
}