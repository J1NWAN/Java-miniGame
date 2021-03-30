import java.util.Scanner;

public class Player {
	public static void main(String[] args) {
		long start = System.currentTimeMillis(); // 현재 시간

		GameCenter player = new GameCenter("J's");
		int count = 1;
		int select = 0;

		Scanner sc = new Scanner(System.in);

		while (count == 1) {
			System.out.println("\n1. Up and Down Game");
			System.out.println("2. Rock Paper Scissors Game");
			System.out.println("3. Bulls and Cows Game");
			System.out.println("4. Last Word Chain Game");
			System.out.print("0. Exit\n\nprompt > ");

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
				player.word_Chain();
				break;
			case 0:
				System.out.println("\nExit\n");
				count = 0;
				break;
			default:
				System.out.println("\n@@ Invalid Input @@\n");
			}
		}

		sc.close();
		long end = System.currentTimeMillis();
		System.out.println("\nProgram Run Time : " + (end - start) / 1000.0);
	}
}
