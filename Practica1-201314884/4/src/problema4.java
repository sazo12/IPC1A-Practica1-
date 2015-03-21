import java.util.Scanner;
import java.io.*;
public class problema4 {

	public static void main(String[] args) throws IOException {
        double x=0, a=0, p=0, r=0;
        System.out.println("Ingrese c, u o x:");
        char i = (char)System.in.read();
        Scanner s=new Scanner(System.in);
        System.in.read();
        System.out.println("Introduzca un numero");
        x=s.nextDouble();
                System.out.println("Area:"+(x*x)*Math.PI);
                System.out.println("Perimetro:"+2*Math.PI*x);
                System.out.println("Radio:"+x);
	}

}
