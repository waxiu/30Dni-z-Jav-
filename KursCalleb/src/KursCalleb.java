import java.util.Scanner;

public class KursCalleb {

	public static void main(String[] args) {
		int i = 0;
		while(i == 0) {
		Scanner in = new Scanner(System.in);
		String login = in.nextLine();
		Scanner in1 = new Scanner(System.in);
		String password = in1.nextLine();
		System.out.println(login);
		System.out.println(password);
		if(login.equals("ivoncjusz")&&password.equals("kacper1612")) {
			System.out.println("Pomyœlnie zalogowa³o");
			i++;
		} else {
			System.out.println("B³êdne dane logowania");
		}
	}
	}
}
