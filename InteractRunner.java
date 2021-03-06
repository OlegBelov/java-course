import java.util.Scanner;

/**
 * Created by Oleg on 10.06.2016.
 *
 * Calculates user input.
 */
public class InteractRunner {

   public static void main(String[] args) {
	        Scanner reader = new Scanner(System.in);
	        try {
			Calculator calc = new Calculator();
			String exit = "no";
			while (!exit.equals("yes")) {
				System.out.println("Enter first arg : ");
				String first = reader.next();
				System.out.println("Enter second arg : ");
				String second = reader.next();
				calc.add(Integer.valueOf(first), Integer.valueOf(second));
				System.out.println("Result : " + calc.getResult());
				calc.clearResult();
				System.out.println("exit : yes/no ");
				exit = reader.next();
			}
		} finally {
			reader.close();
		}		
	 }
}