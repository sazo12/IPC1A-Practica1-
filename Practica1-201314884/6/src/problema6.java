import java.util.Scanner;
import java.io.*;
public class problema6 {

	public static void main(String[] args) throws IOException {
		int n1=0, n2=0, R=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Ingrese el primer numero:");
		n1=s.nextInt();
		System.out.println("Ingrese el segundo numero:");
		n2=s.nextInt();
		System.out.println("Ingrese la operacion a realizar(s,r,m,d):");
		char o = (char)System.in.read();
		if(o=='s'){
			R=n1+n2;
		System.out.println("La suma es:"+R);}
		if(o=='r'){
			R=n1-n2;
		System.out.println("La diferencia es:"+R);
		}
		if(o=='m'){
			R=n1*n2;
		System.out.println("El producto es:"+R);
		}
		if(o=='d'){
			R=n1/n2;
		System.out.println("El cociente es:"+R);
		}
	}

}
