package com.example.lab04_ejer02;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.WindowInsetsControllerCompat;
import android.os.Bundle;
import android.view.View;

import android.widget.TextView;
import androidx.fragment.app.FragmentTransaction;


public class MainActivity extends AppCompatActivity implements OnRegisterListener {
    private TextView txtMensaje;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        View mainLayout = findViewById(R.id.main);
        ViewCompat.setOnApplyWindowInsetsListener(mainLayout, (v, insets) -> {
            WindowInsetsCompat systemBars = insets;

            return insets;
        });

        txtMensaje = findViewById(R.id.txtMensaje);

        RegistroFragment registroFragment = RegistroFragment.newInstance(this);

        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.frameLayout, registroFragment);
        transaction.commit();
    }

    @Override
    public void onRegister(Usuario user) {
        txtMensaje.setText(String.format(
                "Nombre: %s\nApellido: %s\nEmail: %s\nTeléfono: %s\nUsername: %s",
                user.getNombre(), user.getApellido(), user.getEmail(), user.getTelefono(), user.getUsername()
        ));
    }
}
