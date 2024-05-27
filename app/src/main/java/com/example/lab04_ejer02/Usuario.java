package com.example.lab04_ejer02;

public class Usuario {
    private String nombre;
    private String apellido;
    private String email;
    private String telefono;
    private String username;
    private String password;

    public Usuario(String nombre, String apellido, String email, String telefono, String username, String password) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.telefono = telefono;
        this.username = username;
        this.password = password;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}
