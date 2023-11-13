/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw;

import org.apache.commons.lang3.RandomStringUtils;

/**
 *
 * @author noelia
 */
public class Generador {

    public static String pinTelMovil() {
        return RandomStringUtils.randomNumeric(4);
    }

    public static String pcPassword() {
        return RandomStringUtils.randomAlphanumeric(8);
    }

    public static String paswordCadenaEstablecida(int num) {
        String cadena = "aeiou813";
        return RandomStringUtils.random(num, cadena);
    }

}
