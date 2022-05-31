package com.sofka.ejercicio16.utilities;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Message {
    public static final Logger logger = Logger.getLogger(String.valueOf(Message.class));

    public static Message getInstance(){
        return new Message();
    }

    public void showMessageIMC(Persona persona){
        if (persona.calcularIMC() == -1){
            logger.log(Level.INFO, " {0}", persona.getNombre().concat(" Está por debajo de su Peso Ideal"));
        }else if (persona.calcularIMC() == 0){
            logger.log(Level.INFO, " {0}", persona.getNombre().concat("Está en su peso Ideal"));
        }else {
            logger.log(Level.INFO," {0}",persona.getNombre().concat("Está en Sobrepeso"));
        }
    }

    public void showMessageIsMajorAge(Persona persona){
        if (Boolean.TRUE.equals(persona.esMayorDeEdad())){
            logger.log(Level.INFO, " {0}", persona.getNombre().concat(" Es Mayor de Edad"));
        }else {
            logger.log(Level.INFO, " {0}", persona.getNombre().concat(" NO Es Mayor de Edad"));
        }
    }

    public void showMessageOfPerson(Persona persona){
        logger.log(Level.INFO, " {0}", persona);
    }
}
