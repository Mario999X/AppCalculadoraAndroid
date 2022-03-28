package com.example.calculadoraandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText editNumeroUno, editNumeroDos;
    TextView viewResultado;
    Button btnSuma, btnResta, btnMulti, btnDiv, btnReset;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initComponents();
    }

    private void initComponents(){
        editNumeroUno = findViewById(R.id.editNumeroUno);
        editNumeroDos = findViewById(R.id.editNumeroDos);
        viewResultado = findViewById(R.id.viewResultado);
        btnSuma = findViewById(R.id.btnSuma);
        btnResta = findViewById(R.id.btnResta);
        btnMulti = findViewById(R.id.btnMulti);
        btnDiv = findViewById(R.id.btnDiv);
        btnReset = findViewById(R.id.btnReset);

        btnSuma.setOnClickListener(this);
        btnResta.setOnClickListener(this);
        btnMulti.setOnClickListener(this);
        btnDiv.setOnClickListener(this);
        btnReset.setOnClickListener(this);


    }


    @Override
    public void onClick(View view) {

        int a = Integer.parseInt(editNumeroUno.getText().toString());
        int b = Integer.parseInt(editNumeroDos.getText().toString());

        switch (view.getId()){
            case R.id.btnSuma:
                viewResultado.setText(String.valueOf(a+b));
                break;
            case R.id.btnResta:
                viewResultado.setText(String.valueOf(a-b));
                break;
            case R.id.btnMulti:
                viewResultado.setText(String.valueOf(a*b));
                break;
            case R.id.btnDiv:
                if (b == 0) {
                    viewResultado.setText("Dividido por 0");
                } else {
                    viewResultado.setText(String.valueOf(a / b));
                }
                break;
            case R.id.btnReset:
                editNumeroUno.setText("0");
                editNumeroDos.setText("0");
                viewResultado.setText("Resultado");
                break;
            default:
                System.out.println("Definido");
        }
    }
}