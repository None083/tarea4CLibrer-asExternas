/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package daw;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author noelia
 */
public class Programa {

    public static void main(String[] args) {

        int opcion;

        do {

            opcion = Integer.parseInt(JOptionPane.showInputDialog("""
                                            
                                         ESCOGE UNA OPCIÓN
                        --------------------------------------------------------
                                1 - Crear pin para móvil
                                2 - Crear contraseña para PC
                                3 - Crear contraseña del largo deseado
                        --------------------------------------------------------
                                            """));
            
            switch(opcion){
                case 1 ->{
                    JOptionPane.showMessageDialog(null, Generador.pinTelMovil());
                }
                case 2 ->{
                    JOptionPane.showMessageDialog(null, Generador.pcPassword());
                }
                case 3 ->{
                    Scanner teclado = new Scanner(System.in);
                    System.out.println("Introduce un número para el largo de la contraseña");
                    int largoNum = teclado.nextInt();
                    System.out.println(Generador.paswordCadenaEstablecida(largoNum));
                }
            }
            
            

            if (!(opcion >= 1 && opcion <= 3)) {
                JOptionPane.showMessageDialog(null, "Elige un número de la lista");
            }
        } while (!(opcion == 3));
    }
}
