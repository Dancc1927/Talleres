package mayor2;

import java.util.Scanner;

public class Principal {
 public static void main(String[]  args) {
	 //String num="";
	
Scanner numeros = new Scanner(System.in);
int a,b;
System.out.println("Ingrese un numero");
a=numeros.nextInt();
System.out.println("Ingrese un numero");
b=numeros.nextInt();
if (a==b) {
	System.out.println("Los numeros son iguales");
}else {
	if (a > b) {
	System.out.println("El numero mayor es :"+a);
} else {
	System.out.println("El numero mayor es :"+b);
}
	} numeros.close();
 }
}
