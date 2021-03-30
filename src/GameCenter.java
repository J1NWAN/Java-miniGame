import java.util.*;

public class GameCenter implements Controller {
	final Scanner sc = new Scanner(System.in);
	final String ui = "##################################################";
	
	
	public GameCenter(String user) {
		System.out.println(user + " Login ~\n");
	}

	public void up_Down() {
//		Scanner sc = new Scanner(System.in);
		int computer = (int) (Math.random() * 50 + 1);
		int player = 0;
		int count = 0;
		
		for (int i = 10; i >= 1; i--) {
			System.out.println("\n" + ui);
			System.out.println("#\t\tUp and Down Game\t\t #");
			if(i == 10) {
				System.out.println("#\t\tYou have " + i + " chances.\t\t #");
			} else {
				System.out.println("#\t\tYou have " + "0" + i + " chances.\t\t #");
			}
			System.out.print("# You > ");
			player = sc.nextInt();

			if (computer > player) {
				System.out.println("#\t\t\t UP !!\t\t\t #");
			} else if (computer < player) {
				System.out.println("#\t\t\tDOWN ~\t\t\t #");
			} else {
				System.out.println("#\t\t   Your Victory :)\t\t #");
				break;
			}
			System.out.println(ui);
			count++;
		}
		
		System.out.println(ui);
		if (count == 10) {
			System.out.println("\nYou Lose.. :(");
		}
	}

	public void rock_Paper_Scissors() {
		
//		Scanner sc = new Scanner(System.in);
		
		int player = 0;
		int coin = 1;

		// 0 - 묵 1 - 찌 2 - 빠
		while (true) {
			System.out.println("\n" + ui);
			System.out.println("#\t\tRock Paper Scissors Game\t #");
			System.out.println("#\t(0) Rock  (1) Scissors  (2) Paper\t #");
			System.out.print("#\t\t\t\t\t\t #\n# select > ");
			int computer = (int) (Math.random() * 3);
			player = sc.nextInt();

			if (coin != 2) {
				if (player == computer) {
					System.out.println("#\t\t      Draw :o\t\t\t #");
					System.out.println(ui + "\n");
					continue;
				} else if ((player == 0 && computer == 2) || (player == 1 && computer == 0)
						|| (player == 2 && computer == 1)) {
					System.out.println("#\t\t    You Lose.. :( \t\t #");
					System.out.println(ui + "\n");
					System.out.print("\t    Continue ? 1. Yes, 2. No ");
					coin = sc.nextInt();
				} else {
					System.out.println("#\t\t   Your Victory :)\t\t #");
					System.out.println(ui + "\n");
					System.out.print("\t    Continue ? 1. Yes, 2. No ");
					coin = sc.nextInt();
					
				}
				System.out.println("");
			}
			
			if(coin == 2) {
				System.out.println("\t\t  @ Game Over @");
				break;
			}
		}
	}
	
	public void bulls_and_Cows() {
//		Scanner sc = new Scanner(System.in);
		int[] computer = new int[3], user = new int[3];
		int strike = 0, ball = 0;
		
		System.out.println("\n" + ui);
		System.out.println("#\t\tBulls and Cows Game\t\t #");
		
		System.out.println("# Please enter a number from 1 to 9 three times. #\n#");
		for(int i = 0; i < computer.length; i++) {
			computer[i] = (int)(Math.random() * 3 + 1);
			System.out.print("# " + (i + 1) + " > ");
			user[i] = sc.nextInt();
		}
		
		System.out.println("#\t\t\t\t\t\t #");
		
		for(int i = 0; i < computer.length; i++) {
			for(int j = 0; j < computer.length; j++) {
				if(computer[i] == user[j]) {
					if(i == j) {
						strike++;
					} else {
						ball++;
					}
				}
			}
		}
		
		if(strike == 0 && ball == 0) {
			System.out.println("#\t\t     OUT... :(\t\t\t #");
			System.out.println(ui);
		}
		else {
			System.out.println("#\t\t  " + strike + " STRIKE " + ball + " BALL" + "\t\t #");
			System.out.println(ui);
		}
		
		System.out.print("Computer Result :");
		for(int i = 0; i < computer.length; i++) System.out.print(computer[i] + " ");
		System.out.println("");
	}
	
	public void word_Chain() {
		String[] randomWord = {"레스토랑", "귀신", "아파트", "텀블러", "게임", "사막", "페인트", "앨범", "신문", "편지"};
		int count = (int)(Math.random() * 10);
		int lastIndex = 0;
		char lastChar = 0;
		
		String word;
		String answer = randomWord[count];
		
		System.out.println(ui);
		System.out.println("#\t\tLast Word Chain Game\t\t #");
		System.out.println("#\t\t\t" + answer + "\t\t\t #");
		while(true) {
			System.out.print("#\t\t\t\t\t\t #\n# WORD > ");
			word = sc.next();
			
			lastIndex = answer.length() - 1;
			lastChar = answer.charAt(lastIndex);
			
			if(word.charAt(0) == lastChar) {
				answer = word;
			} else {
				System.out.println("#\t\tThe last word is wrong.\t\t #");
				System.out.println(ui);
				break;
			}
		}
	}
}
