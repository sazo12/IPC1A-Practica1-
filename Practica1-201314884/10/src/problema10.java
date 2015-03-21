import java.util.Scanner;
public class problema10 {

	public static void main(String[] args) {
		int n=0;
		Scanner s = new Scanner(System.in);
		System.out.println("Ingrese un numero: ");
		n=s.nextInt();
		 for (int i=n; i>0; i--) {
	            for (int j=1; j<=i; j++) {
	                System.out.print (n+""+n);
	            }
	            System.out.println(n-1);
	        } 
	}
}