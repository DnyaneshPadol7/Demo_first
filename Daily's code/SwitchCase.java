import java.util.Scanner;
public class SwitchCase {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char user_continue;
		
		do {
			
		
		System.out.println("Simple Calculator:-");
		System.out.print("Enter First No. ");
		int f = sc.nextInt();
		System.out.print("Enter Second No. ");
		int s = sc.nextInt();
	
		
		System.out.println("Pree 1 for additon ");
		System.out.println("Pree 2 for subtraction ");
		System.out.println("Pree 3 for multiplication ");
		System.out.println("Pree 4 for division ");
		System.out.println("Pree 5 for modulus ");
		int o =sc.nextInt();
		
		switch (o) {
		case 1:
			System.out.println("Your addition is = "+(f+s));
			break;
		case 2:
			System.out.println("Your subtraction is = "+(f-s));
			break;
		case 3:
			System.out.println("Your multiplication is = "+(f*s));
			break;
		case 4:
			System.out.println("Your division is = "+(f/s));
			break;
		case 5:
			System.out.println("Your modulus is = "+(f%s));
			break;
		default:
			System.out.println("Please Enter a Valid Input");
		}
		
			System.out.println("Do you want to continue = y/n");
			user_continue = sc.next().charAt(0);
		
		} while (user_continue=='y');

	}
	

}
