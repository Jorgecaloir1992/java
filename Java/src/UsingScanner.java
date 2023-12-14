import java.util.Scanner;;

public class UsingScanner {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		String name = "";
		int age = 0;

		System.out.println("Were is your name?");
		name = in.nextLine();

		System.out.println("Were is your age?");
		age = in.nextInt();

		System.out.println("Hello " + name + " you age is " + age + " ages");

		in.close();
	}
}