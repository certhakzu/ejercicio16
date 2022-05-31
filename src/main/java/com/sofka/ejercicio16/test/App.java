package com.sofka.ejercicio16.test;

import com.sofka.ejercicio16.utilities.Message;
import com.sofka.ejercicio16.utilities.Persona;

import java.util.Scanner;
import java.util.logging.Logger;

public class App {
    private static final Logger logger = Logger.getLogger(String.valueOf(App.class));
    private static final Scanner scanner = new Scanner(System.in);
    static final String PEDIR_NOMBRE = "Escriba Nombre: ";
    static final String PEDIR_EDAD = "Digite Edad: ";
    static final String PEDIR_SEXO = "Digite Sexo (H: hombre/M: mujer): ";


    public static void main(String[] args) {
        Message message = new Message();
        String nombre;
        Integer edad;
        Character sexo;
        Double peso;
        Double altura;

        logger.info(PEDIR_NOMBRE);
        nombre = scanner.nextLine();
        logger.info(PEDIR_EDAD);
        edad = Integer.parseInt(scanner.nextLine());
        logger.info(PEDIR_SEXO);
        sexo = Character.valueOf(scanner.nextLine().charAt(0));
        logger.info("Digite Peso:");
        peso = Double.parseDouble(scanner.nextLine());
        logger.info("Digite Altura: ");
        altura = Double.parseDouble(scanner.nextLine());
        Persona persona1 = new Persona(nombre, edad, sexo, peso, altura); //Primera Persona

        logger.info(PEDIR_NOMBRE);
        nombre = scanner.nextLine();
        logger.info(PEDIR_EDAD);
        edad = Integer.parseInt(scanner.nextLine());
        logger.info(PEDIR_SEXO);
        sexo = Character.valueOf(scanner.nextLine().charAt(0));
        Persona persona2 = new Persona(nombre, edad, sexo); //Segunda Persona

        logger.info(PEDIR_NOMBRE);
        nombre = scanner.nextLine();
        logger.info(PEDIR_EDAD);
        edad = Integer.parseInt(scanner.nextLine());
        logger.info(PEDIR_SEXO);
        sexo = Character.valueOf(scanner.nextLine().charAt(0));
        logger.info("Digite Peso:");
        peso = Double.parseDouble(scanner.nextLine());
        logger.info("Digite Altura: ");
        altura = Double.parseDouble(scanner.nextLine());
        Persona persona3 = new Persona(); //Tercera Persona
        persona3.setNombre(nombre);
        persona3.setEdad(edad);
        persona3.setSexo(sexo);
        persona3.setPeso(peso);
        persona3.setAltura(altura);

        //Mostrar showMessageIMCpara los 3 objetos
        message.showMessageIMC(persona1);
        message.showMessageIMC(persona2);
        message.showMessageIMC(persona3);

        //Mostras si son mayores de edad
        message.showMessageIsMajorAge(persona1);
        message.showMessageIsMajorAge(persona2);
        message.showMessageIsMajorAge(persona3);

        //Mostrar informacion de cada objeto
        message.showMessageOfPerson(persona1);
        message.showMessageOfPerson(persona2);
        message.showMessageOfPerson(persona3);
    }
}
