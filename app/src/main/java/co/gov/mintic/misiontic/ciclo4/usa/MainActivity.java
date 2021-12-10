package co.gov.mintic.misiontic.ciclo4.usa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void mensajeSimple(View view) {
        //Snackbar.make(view, "Este es un mensaje Simple", Snackbar.LENGTH_SHORT).show();
        Snackbar mensaje1 = Snackbar.make(view, "Este es otro un mensaje Simple", Snackbar.LENGTH_LONG);
        mensaje1.show();
        Toast.makeText(this, "Este es un mensaje Muyyy simple", Toast.LENGTH_LONG).show();
        Toast mensaje2 = Toast.makeText(this, "Este es otro un mensaje Muyyy simple", Toast.LENGTH_SHORT);
        mensaje2.show();
    }

    public void mensajeColorido(View view) {
                Snackbar.make(view,"Este es un Mensaje con colores", Snackbar.LENGTH_LONG)
                .setBackgroundTint(getResources().getColor(R.color.purple_700))
                .setTextColor(getResources().getColor(R.color.color_mensaje_alerta_letra))
                .show();
    }

    public void mensajeConAccion(View view) {
        Snackbar.make(view, "Mostrar Otro Mensaje", Snackbar.LENGTH_INDEFINITE)
                .setAction("Pulsame", new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        TextView etiMensaje = (TextView) findViewById(R.id.txtMensaje);
                        Button boton = (Button) view;
                        String mensaje = "Pulsaste el boton "+boton.getText();
                        etiMensaje.setText(mensaje);
                    }
                })
                .show();
    }

    public void mensajeAbrirPantalla(View view) {
        TextView etiMensaje = (TextView) findViewById(R.id.txtMensaje);
        Button boton = (Button) view;
        String mensaje = "Pulsaste el boton "+boton.getText();
        etiMensaje.setText(mensaje);

        Snackbar.make(view,"Abrir otra Pantalla", Snackbar.LENGTH_INDEFINITE)
                .setAction("Abrir", new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent i = new Intent(MainActivity.this, MainActivity2.class);
                        startActivity(i);
                    }
                })
                .show();
  }

    public void mensajeError(View view) {
        Snackbar.make(view,"Ha ocurrido un error", Snackbar.LENGTH_LONG)
                .setBackgroundTint(getResources().getColor(R.color.color_mensaje_error_fondo))
                .setTextColor(getResources().getColor(R.color.color_mensaje_error_letra))
                .show();
    }

    public void mensajeWarning(View view) {
        Snackbar.make(view,"Atiende esta recomendación ", Snackbar.LENGTH_LONG)
                .setBackgroundTint(getResources().getColor(R.color.color_mensaje_alerta_fondo))
                .setTextColor(getResources().getColor(R.color.color_mensaje_alerta_letra))
                .show();
    }

    public void mensajeOk(View view) {
        Snackbar.make(view,"Muy bien ", Snackbar.LENGTH_LONG)
                .setBackgroundTint(getResources().getColor(R.color.color_mensaje_correcto_fondo))
                .setTextColor(getResources().getColor(R.color.color_mensaje_correcto_letra))
                .show();
    }

    public void mensajeOk2(View view) {
        Snackbar.make(view,"Ok, Excelente ", Snackbar.LENGTH_LONG)
                .setBackgroundTint(getResources().getColor(R.color.color_mensaje_ok_fondo))
                .setTextColor(getResources().getColor(R.color.color_mensaje_ok_letra))
                .show();
    }
}