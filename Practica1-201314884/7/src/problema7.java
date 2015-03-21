import java.util.Scanner;
public class problema7 {

	public static void main(String[] args) {
		int n=0, res=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Ingrese un numero entre 0 y 10:");
		n=s.nextInt();
		System.out.println("La tabla del "+n+" es:");
		for(int i=10; i>0; i--){
			res=n*i;
			System.out.println(n+"x"+i+"="+res);
		}
	}

}
