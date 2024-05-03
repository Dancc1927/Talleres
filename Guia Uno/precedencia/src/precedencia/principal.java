package precedencia;

import javax.swing.JOptionPane;

public class principal {
	public static void main(String [] args) {
	int formula=	(10/5)+6-2+(3*8*1)-(12/2)+9-(7*4);
	double oper=4.0+3*6;
	double oper1=(4.0+3)*6;
	
	double oper3=10/5+6-2+3*8*1-12/2+(9-7)*4;
	double oper4=10/(5+6)-(2+3)*8*(1-12)/2+(9-7)*4;
	
	double x=(double)5/2;
	double y2=45.0/2;
	
	System.out.print(x);
	System.out.print(y2);
}}