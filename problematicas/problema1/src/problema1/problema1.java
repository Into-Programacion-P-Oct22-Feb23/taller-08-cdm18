/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema1;

import java.util.Scanner;
import java.util.Locale;
//import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class problema1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        int jugadores;
        //     jugadores = Integer.parseInt(JOptionPane.showInputDialog("Digite cuantos jugadores va a ingresar:"));
        System.out.println("Cuantos jugadores va a ingresar");
        jugadores = entrada.nextInt();
        String[] nombres = new String[jugadores];
        String[] posiciones = new String[jugadores];
        double[] estatura = new double[jugadores];
        int[] edad = new int[jugadores];
        String reporte = "";
        double promedio_edades;
        double promedio_estatura;
        int acumulador_edades = 0;
        double acumulador_estatura = 0; //sumar estaturas 
        String listado_edades = "";
        int contador = 1;

        entrada.nextLine();
        for (int i = 0; i < jugadores; i++) {
            System.out.println("Cual es el nombre del jugador " + contador);
            nombres[i] = entrada.nextLine();
            System.out.println("En que posicion juega el jugador " + contador);
            posiciones[i] = entrada.nextLine();
            System.out.println("Cual es la edad del jugador " + contador);
            edad[i] = entrada.nextInt();
            System.out.println("Cual es la estatura del jugador " + contador);
            estatura[i] = entrada.nextDouble();

            entrada.nextLine();
            reporte = String.format("%s%d. %s -%s-, edad %d, estatura %.2f\n",
                     reporte, contador,
                    nombres[i], posiciones[i], edad[i], estatura[i]);

            acumulador_edades = acumulador_edades + edad[i];
            acumulador_estatura = acumulador_estatura + estatura[i];
            listado_edades = String.format("%s %d", listado_edades,
                    edad[i]);
            contador++;
        }
        promedio_edades = acumulador_edades/jugadores;
        promedio_estatura = acumulador_estatura/jugadores;
        
        System.out.printf("Listado de jugadores\n%sListado de edades:\n%s\n"
                + "Promedio de edades: %.2f\nPromedio de estaturas: %.2f\n"
                ,reporte, listado_edades, 
                promedio_edades,promedio_estatura);

    }

}
