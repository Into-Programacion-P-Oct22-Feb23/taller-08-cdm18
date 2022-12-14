/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema2;

import java.util.Scanner;
import java.util.Locale;
//import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class problema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        //     jugadores = Integer.parseInt(JOptionPane.showInputDialog("Digite cuantos jugadores va a ingresar:"));
        
        int[] multi = {1,2,3,4};

        System.out.println("N\tx2\tx3\tx4");
        for (int n = 25; n >=1; n--) {
            System.out.println(n*multi[0] + "\t" + n*multi[1]+ "\t" + n*multi[2]
            + "\t" + n*multi[3] + "\t");           

        }
  
       
        
    }

}
