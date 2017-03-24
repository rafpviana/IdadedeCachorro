package com.example.rafaelpinheiro.idadedecachorro;

import android.support.v4.content.SharedPreferencesCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText textoEditavelIdade;
    private TextView textoResultado;
    private Button botaoDescobrirIdade;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textoEditavelIdade = (EditText) findViewById(R.id.textoEditavelIdadeId);

        textoResultado = (TextView) findViewById(R.id.textoResultadoId);

        botaoDescobrirIdade = (Button) findViewById(R.id.botaoDescobrirIdadeId);

        botaoDescobrirIdade.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    String idadeString = textoEditavelIdade.getText().toString();

                if(idadeString.isEmpty()){
                    Toast.makeText(MainActivity.this, "Digite uma idade válida", Toast.LENGTH_SHORT).show();
                }
                else{
                    int resultadoInt = Integer.parseInt(idadeString) * 7;
                    textoResultado.setText("A idade do seu cachorro em anos humanos é: "+resultadoInt);
                }




            }
        });
    }
}
