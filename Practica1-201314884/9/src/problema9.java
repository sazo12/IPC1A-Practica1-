import java.util.Scanner;

public class problema9 {

	public static void main(String[] args) {

		int numero=0; 
		int d=0,dromano=0,romano=0,p=0;
		String numR="";
		String salR=""; 
		Scanner s = new Scanner(System.in);
		System.out.println("Ingrese el numero a convertir: ");
		numero=s.nextInt();
	if(numero<4000){
		p=0;
		while(numero>0){
			dromano=numero%10;
			romano=dromano*(int)Math.pow(10,p);
			switch(romano){
			case 1:
				numR="I";
				break;
			case 2:
				numR="II";
				break;
			case 3:
				numR="III";
				break;
			case 4:
				numR="IV";
				break;
			case 5:
				numR="V";
				break;
			case 6:
				numR="VI";
				break;
			case 7:
				numR="VII";
				break;
			case 8:
				numR="VIII";
				break;
			case 9:
				numR="IX";
				break;
			case 10:
				numR="X";
				break;
			case 20:
				numR="XX";
				break;
			case 30:
				numR="XXX";
				break;
			case 40:
				numR="XL";
				break;
			case 50:
				numR="L";
				break;
			case 60:
				numR="LX";
				break;
			case 70:
				numR="LXX";
				break;
			case 80:
				numR="LXXX";
				break;
			case 90:
				numR="XC";
				break;
			case 100:
				numR="C";
				break;
			case 200:
				numR="CC";
				break;
			case 300:
				numR="CCC";
				break;
			case 400:
				numR="CD";
				break;
			case 500:
				numR="D";
				break;
			case 600:
				numR="DC";
				break;
			case 700:
				numR="DCC";
				break;
			case 800:
				numR="DCCC";
				break;
			case 900:
				numR="CM";
				break;
			case 1000:
				numR="M";
				break;
			case 2000:
				numR="MM";
				break;
			case 3000:
				numR="MMM";
				break;
			}
			numR=""+numR;
			numero=numero/10;
			p++;
		}
		salR=numR+salR;

		System.out.println("El número romano es: " + salR);
		} else{
		System.out.println("Ingrese numero menor que 4000"); 
	} 

	}

}
