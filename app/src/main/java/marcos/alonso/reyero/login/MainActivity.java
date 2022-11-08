package marcos.alonso.reyero.login;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    final String user = "Alibaba";
    final String password = "Abretesesamo";

    int intentosFallidos = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button boton = findViewById(R.id.login);
        EditText usuario = findViewById(R.id.usuario);
        EditText pass = findViewById(R.id.password);

        boton.setOnClickListener(view -> {
            if (intentosFallidos < 3 && usuario.getText().toString().equalsIgnoreCase(user) && pass.getText().toString().equals(password)) {
                Toast.makeText(getApplicationContext(), "Adelante, puedes pasar", Toast.LENGTH_LONG).show();
            } else {
                intentosFallidos++;
                if (intentosFallidos < 3) {
                    Toast.makeText(getApplicationContext(), "No puedes pasar, inténtalo de nuevo", Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(getApplicationContext(), "Has superado el número máximo de intentos", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}