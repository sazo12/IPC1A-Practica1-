import java.util.Scanner;
import java.util.Random;
public class problema8 {

	public static void main(String[] args) {
		Random rnd = new Random();
		int n1=0, n2=0;
		Scanner s = new Scanner(System.in);
		System.out.println("Ingrese el limite inferior:");
		n1=s.nextInt();
		System.out.println("Ingrese el limite superior:");
		n2=s.nextInt();
        System.out.println("Número aleatorio: "+rnd.nextInt(n2));
	}

}
