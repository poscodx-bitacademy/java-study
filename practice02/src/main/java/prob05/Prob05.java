package prob05;

import java.util.Random;
import java.util.Scanner;

public class Prob05 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		while(true) {
			// 게임 변수 초기화
			int minNumber = 1;
			int maxNumber = 100;

			// 정답 램덤하게 만들기
			Random random = new Random();
			int correctNumber = random.nextInt(maxNumber) + minNumber;

			// 게임 시작
			int countTry = 0;
			System.out.println("수를 결정하였습니다. 맞추어 보세요:");

			while(true) {
				// 시도 회수 증가
				countTry++;

				// 추측 범위 출력
				System.out.println(minNumber + "-" + maxNumber);
				// 입력 프롬프트
				System.out.print(countTry + ">>");

				// 입력 받기
				int guessNumber = scanner.nextInt();

				// 정답
				if(guessNumber == correctNumber) {
					System.out.println("맞췄습니다.");
					break;
				}

				// 오답인 경우
				if(guessNumber > correctNumber) {
					System.out.println("더 낮게");
					maxNumber = guessNumber;
				} else {
					System.out.println("더 높게");
					minNumber = guessNumber;
				}
			}

			System.out.print("다시 하시겠습니까?(y/n)>>");
			String answer = scanner.next();
			if(!"y".equals(answer.toLowerCase())) {
				break;
			}
		}
		scanner.close();
	}
}
