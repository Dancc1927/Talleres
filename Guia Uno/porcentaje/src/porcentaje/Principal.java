package porcentaje;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Principal{
  public static void main(String arg[]) {
	 //consola;
	  ventana();
  }

private static void consola() {
	// transforma un texto en un numero//
	double area,base,altura;
	Scanner in=new Scanner(System.in);
	System.out.print("Ingrese la base");
	
	
	//Double reconoce el punto decimal//
	//nextDouble no reconoce el punto//
	
	
	
	base=Double.parseDouble(in.next());
	System.out.println("ingrese la altura");
	altura=Double.parseDouble(in.next());
}
  public static void ventana() {
	  double area,base,altura;
	  base=Double.parseDouble(JOptionPane.showInputDialog("Ingrese altura"));
	  altura=Double.parseDouble(JOptionPane.showInputDialog("Ingrese "));
	  area=(base*altura)/2;
	  
	  JOptionPane:showMessageDialog(null,"El area es:"+area);
	  System.out.println("Base:"+base+"altura");
	  System.out.println("el area es:"+area);
  }


	
}
  
