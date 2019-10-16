package jbm.example.p4yuli;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class ResiveParametros extends AppCompatActivity {
TextView vnombre;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resive_parametros);
        vnombre = (TextView) findViewById(R.id.lbmnombre);
        Bundle parametros = getIntent().getExtras();
        vnombre.setText("Bienvenido"+ parametros.getString("nombre"));
    }
}
