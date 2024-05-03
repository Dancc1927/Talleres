package porcentaje;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Principal{
  public static void main(String arg[]) {
 final double porcentaje=0.30;
 double  sueldo=Integer.parseInt(JOptionPane.showInputDialog(null,"ingrese su sueldo"));
 double resultado= sueldo+(sueldo*porcentaje);
 System.out.println("Su sueldo es: "+resultado);
  }


	
}
  
