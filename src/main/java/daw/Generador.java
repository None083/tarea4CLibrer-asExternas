/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw;

import javax.swing.JOptionPane;
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
        final String CADENA = "aeiou813npg.";
        return RandomStringUtils.random(num, CADENA);
    }

    public static int solicitarDatoInt() {

        boolean seguir = true;
        int dato = 0;
        
        do {
            try {
                dato = Integer.parseInt(JOptionPane.showInputDialog(
                        "Introduce un número para el largo de la contraseña"));
                seguir = false;
            } catch (NumberFormatException nfe) {
                JOptionPane.showMessageDialog(null, "No has introducido un número");
            }
        } while (seguir);
        return dato;
    }

}
