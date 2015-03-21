import java.util.Scanner;
public class problema2 {

	public static void main(String[] args) {
		int n1=0, n2=0, n3=0, n4=0, n5=0, n6=0, r=0;
		String m="";
		System.out.println("Ingrese notas:");
		Scanner S=new Scanner(System.in);
		n1=S.nextInt();
		n2=S.nextInt();
		n3=S.nextInt();
		n4=S.nextInt();
		n5=S.nextInt();
		n6=S.nextInt();
		r=(n1+n2+n3+n4+n5+n6)/6;
				if(r<60)
					m="E";
				else if(r>59 && r<70)
					m="D";
				else if(r>69 && r<80)
					m="C";
				else if(r>79 && r<90)
					m="B";
				else if(r>89 && r<=100)
					m="A";
		System.out.println("La media es:"+r);
		System.out.println("Nota:"+m);
	}

}
