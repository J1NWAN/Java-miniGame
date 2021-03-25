import java.util.Scanner;
//
public class GameCenter implements Controller {
	public GameCenter(String user) {
		System.out.println(user + " Login ~\n");
	}

	public void up_Down() {
		Scanner sc = new Scanner(System.in);
		int computer = (int) (Math.random() * 50 + 1);
		int player = 0;
		int count = 0;

		System.out.println("\n# Up and Down Game #\n");
		for (int i = 10; i >= 1; i--) {
			System.out.println("You have " + i + " chances.");
			System.out.print("> ");
			player = sc.nextInt();

			if (computer > player) {
				System.out.println("Up !!\n");
			} else if (computer < player) {
				System.out.println("Down ~\n");
			} else {
				System.out.println("\nYour Victory :)");
				break;
			}

			count++;
		}

		if (count == 10) {
			System.out.println("\nYou Lose.. :(");
		}
	}

	public void rock_Paper_Scissors() {
		System.out.println("\n# Rock Paper Scissors Game #\n");
		Scanner sc = new Scanner(System.in);
		
		int player = 0;
		int coin = 1;

		// 0 - 묵 1 - 찌 2 - 빠
		while (true) {
			System.out.print("(0) Rock  (1) Scissors  (2) Paper\nSelect > ");
			int computer = (int) (Math.random() * 3);
			player = sc.nextInt();

			if (coin != 2) {
				if (player == computer) {
					System.out.println("\n@Draw :o\n");
					continue;
				} else if ((player == 0 && computer == 2) || (player == 1 && computer == 0)
						|| (player == 2 && computer == 1)) {
					System.out.println("\n@You Lose.. :(\n");
					System.out.print("Continue ? 1. Yes, 2. No ");
					coin = sc.nextInt();
				} else {
					System.out.println("\n@Your Victory :)\n");
					System.out.print("Continue ? 1. Yes, 2. No ");
					coin = sc.nextInt();
					
				}
				System.out.println("");
			}
			
			if(coin == 2) {
				System.out.println("# Game Over #");
				break;
			}
		}
	}
}
