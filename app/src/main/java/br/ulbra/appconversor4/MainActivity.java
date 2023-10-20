package br.ulbra.appconversor4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText edtL, edtG;

    TextView txtResultado;

    Button btnConvert;

    double v1, v2, calculo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtL = (EditText) findViewById(R.id.edtLitros);
        edtG = (EditText) findViewById(R.id.edtGaloes);
        btnConvert = (Button)findViewById(R.id.btnConv);
        txtResultado = (TextView) findViewById(R.id.txtResposta);

        btnConvert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(edtL.getText().toString().equals("")){
                    v2 = Double.parseDouble(edtG.getText().toString());
                    calculo = v2 / 0.264172;
                    txtResultado.setText(v2+" galões em litros é "+calculo);
                }else{
                    v1 = Double.parseDouble(edtL.getText().toString());
                    calculo = v1 * 0.264172;
                    txtResultado.setText(v1+" litros em galões é "+calculo);
                }
            }
        });
    }
}