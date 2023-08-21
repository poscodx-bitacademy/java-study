package prob01;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class GugudanApp {
	public static void main(String[] args) {
		Gugudan[] gugudans = randomizeGugudan(9);

		// 문제 & 정답
		int loc = randomize(0, 9);
		int resultNumber = gugudans[loc].left * gugudans[loc].right;
		System.out.println(gugudans[loc].left + " x " +  gugudans[loc].right + " = ?");

		int length = gugudans.length;
		for (int i = 0; i < length; i++) {
			System.out.print(i % 3 == 0 ? "\n" : "\t");
			System.out.print(gugudans[i].left * gugudans[i].right);
		}

		System.out.print("\n\n");
		System.out.print("answer:");

		Scanner s = new Scanner(System.in);
		int answer = s.nextInt();
		s.close();

		System.out.println((answer == resultNumber) ? "정답" : "오답");
	}

	private static int randomize(int lNum, int rNum) {
		int random = (int) (Math.random() * rNum) + lNum;
		return random;
	}

	private static Gugudan[] randomizeGugudan(int count) {
		Set<Gugudan> result = new HashSet<>();
		
		while (result.size() != count) {
			result.add(new Gugudan(randomize(1, 9), randomize(1, 9)));
		}
		
		return result.toArray(new Gugudan[result.size()]);
	}
}
