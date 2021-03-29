import java.util.Scanner;

public class Player {
	public static void main(String[] args) {
		GameCenter player = new GameCenter("J's");
		int select = 0;
		int count = 1;

		Scanner sc = new Scanner(System.in);

		while (count == 1) {
			System.out.println("\n1. Up and Down Game");
			System.out.println("2. Rock Paper Scissors Game");
			System.out.println("3. Bulls and Cows Game");
			System.out.print("4. Exit\n\nprompt > ");
			
			select = sc.nextInt();
			switch (select) {
			case 1:
				player.up_Down();
				break;
			case 2:
				player.rock_Paper_Scissors();
				break;
			case 3:
				player.bulls_and_Cows();
				break;
			case 4:
				System.out.println("\nExit\n");
				count = 0;
				break;
			default:
				System.out.println("\n@@ Invalid Input @@\n");
			}
		} sc.close();
	}
}
