package com.sofka.ejercicio16.utilities;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Random;

public class Persona {
    private String nombre;
    private Integer edad;
    private Integer dni;
    private Character sexo;
    private Double altura;
    private Double peso;

    public Persona() {
        this.nombre = "";
        this.edad = 0;
        this.sexo = ' ';
        this.altura = 0.0;
        this.peso = 0.0;
        generarDNI();
    }

    public Persona(String nombre, Integer edad, Character sexo) {
        this.nombre = nombre;
        this.edad = edad;
        comprobarSexo(sexo);
        this.altura = 0.0;
        this.peso = 0.0;
        generarDNI();
    }

    public Persona(String nombre, Integer edad, Integer dni, Character sexo, Double peso, Double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
        comprobarSexo(sexo);
        this.altura = altura;
        this.peso = peso;
    }

    public Persona(String nombre, Integer edad, Character sexo, Double peso, Double altura) {
        this.nombre = nombre;
        this.edad = edad;
        comprobarSexo(sexo);
        this.altura = altura;
        this.peso = peso;
        generarDNI();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Integer getDni() {
        return dni;
    }

    public Character getSexo() {
        return sexo;
    }

    public void setSexo(Character sexo) {
        this.sexo = sexo;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Byte calcularIMC(){
        double IMC = (this.peso / Math.pow(this.altura, 2));
        if (IMC < 20.0){
            return -1;
        }else if (IMC <= 25.0){
            return 0;
        }else{
            return 1;
        }
    }

    public Boolean esMayorDeEdad(){
        return this.edad > 17;
    }

    private void comprobarSexo(char sexo){
        if (String.valueOf(sexo).equalsIgnoreCase("H") || String.valueOf(sexo).equalsIgnoreCase("M")){
            this.sexo = Character.toUpperCase(sexo);
        }else{
            this.sexo = 'H';
        }
    }

    @Override
    public String toString(){
        return nombre + "\n" + edad + "\n" + dni + "\n" + sexo + "\n" + altura + "\n" + peso;
    }

    private void generarDNI() {
        try {
            Random random = SecureRandom.getInstanceStrong();
            dni = random.nextInt(99999999 + 10000000) + 10000000;
        }catch (NoSuchAlgorithmException exception){
            try {
                throw new NoSuchAlgorithmException();
            } catch (NoSuchAlgorithmException e) {
                e.printStackTrace();
            }
        }
    }


}
