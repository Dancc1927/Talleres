package compra;

import javax.swing.JOptionPane;

public class principal {
	public static void main(String[] args) {
		int compra =0;
		compra= Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de la compra"));
		
		if (compra >= 50000) {
			double resultado = compra - (compra*0.1);
			System.out.println("El valor de su compra es :" + resultado);
		}
		else {System.out.println("Usted no tiene descuento, el valor de su compra es :" + compra);}
	}

}
