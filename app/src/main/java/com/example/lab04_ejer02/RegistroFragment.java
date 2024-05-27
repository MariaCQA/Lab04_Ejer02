package com.example.lab04_ejer02;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.lab04_ejer02.OnRegisterListener;
import com.example.lab04_ejer02.R;
import com.example.lab04_ejer02.Usuario;

public class RegistroFragment extends Fragment {

    private OnRegisterListener onRegisterListener;

    public static RegistroFragment newInstance(OnRegisterListener listener) {
        RegistroFragment fragment = new RegistroFragment();
        fragment.onRegisterListener = listener;
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_registro, container, false);

        EditText edtNombre = view.findViewById(R.id.edtNombre);
        EditText edtApellido = view.findViewById(R.id.edtApellido);
        EditText edtEmail = view.findViewById(R.id.edtEmail);
        EditText edtTelefono = view.findViewById(R.id.edtTelefono);
        EditText edtUsername = view.findViewById(R.id.edtUsername);
        EditText edtPassword = view.findViewById(R.id.edtPassword);
        Button btnRegister = view.findViewById(R.id.btnRegister);

        btnRegister.setOnClickListener(v -> {
            Usuario user = new Usuario(
                    edtNombre.getText().toString(),
                    edtApellido.getText().toString(),
                    edtEmail.getText().toString(),
                    edtTelefono.getText().toString(),
                    edtUsername.getText().toString(),
                    edtPassword.getText().toString()
            );
            if (onRegisterListener != null) {
                onRegisterListener.onRegister(user);
            }
        });

        return view;
    }
}
