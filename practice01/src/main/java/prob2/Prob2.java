package prob2;

public class Prob2 {
	public static void main(String[] args) {
		for(int i = 1; i <= 9; i++) {
			for(int j = 1; j < i + 10; j++) {
				System.out.print(j + " ");
			}
			System.out.print("\n");
		}
	}
}
