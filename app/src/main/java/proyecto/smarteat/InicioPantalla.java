package proyecto.smarteat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class InicioPantalla extends AppCompatActivity {

    ImageButton btGoogle, btRegistroCorreo, btInicioSesion;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.inicio_pantalla);

        btGoogle = findViewById(R.id.ipibBotonGoogle);
        btRegistroCorreo = findViewById(R.id.ipibBotonCorreo);
        btInicioSesion = findViewById(R.id.ipibIniciarSesion);

        btInicioSesion.setOnClickListener(v -> {
            // Abre la pantalla de inicio de sesión
            Intent intent = new Intent(InicioPantalla.this, IniciarSesionPantalla.class);
            startActivity(intent);
        });
    }
}