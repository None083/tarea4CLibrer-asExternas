/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package daw;

import javax.swing.JOptionPane;

/**
 *
 * @author noelia
 */
public class Programa {

    public static void main(String[] args) {

        String[] opcionesMenu = {"1.- PIN", "2.- Sistema operativo",
            "3.- Contraseña personalizada", "4.- Salir"};
        String opcionElegida = "";

        do {

            opcionElegida = (String) JOptionPane.showInputDialog(null,
                    "Elige una opción", "Generador de contraseñas",
                    JOptionPane.QUESTION_MESSAGE, null,
                    opcionesMenu, "1.- PIN");

            //Este if es por si presionas cancel en la ventana de opciones
            if (opcionElegida == null) {
                opcionElegida = "4.- Salir";
            }

            switch (opcionElegida) {
                case "1.- PIN" -> {
                    JOptionPane.showMessageDialog(null, "Pin: "
                            + Generador.pinTelMovil());
                }
                case "2.- Sistema operativo" -> {
                    JOptionPane.showMessageDialog(null, "Contraseña: "
                            + Generador.pcPassword());
                }
                case "3.- Contraseña personalizada" -> {
                    JOptionPane.showMessageDialog(null, "Contraseña: "
                            + Generador.paswordCadenaEstablecida(Generador.solicitarDatoInt()));
                }
                default -> {
                    JOptionPane.showMessageDialog(null, "CHAO PESCAO");
                }
            }
        } while (!(opcionElegida.equals("4.- Salir")));
    }
}
