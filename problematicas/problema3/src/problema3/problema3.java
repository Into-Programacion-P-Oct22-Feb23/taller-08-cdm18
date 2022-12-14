/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema3;

import java.util.Scanner;
import java.util.Locale;
//import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class problema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //   Scanner entrada = new Scanner(System.in);
        //    entrada.useLocale(Locale.US);
        //     jugadores = Integer.parseInt(JOptionPane.showInputDialog("Digite cuantos jugadores va a ingresar:"));
        String mensaje = "";
        double numerador = 5;
        double denominador = 9;
        for (int n = 20; n < 81; n = n + 4) {
            double c = numerador / denominador * (n - 32);
            mensaje = String.format("%s\n%d\t\t%.2f\n",mensaje, n, c);
        }
            System.out.println("Fahrenheit\tCelsius\t"+ mensaje);

    }

}
