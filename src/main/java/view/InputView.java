package view;

import java.util.Scanner;

public class InputView {
	private static final Scanner scanner = new Scanner(System.in);

	public static int inputMovieId() {
		System.out.println("## 예약할 영화를 선택하세요.");
		return scanner.nextInt();
	}

	public static int inputMovieTime() {
		System.out.println("## 예약할 시간표를 선택하세요. (첫 번째 상영 시간이 1번)");
		return scanner.nextInt();
	}

	public static int ticketNum() {
		System.out.println("## 예약할 인원을 입력하세요.");
		return scanner.nextInt();
	}

	public static boolean inputStopOrGo() {
		System.out.println("## 예약을 종료하고 결제를 진행하려면 1번, 추가 예약을 진행하려면 2번을 입력하세요.");
		int stopOrGo = scanner.nextInt();
		return stopOrGo == 2;
	}

	public static int inputPoint(int total_price) {
		System.out.println("## 결제를 진행합니다. 총 결제 금액은 " + total_price + "원 입니다.");
		System.out.println("## 포인트 사용 금액을 입력하세요. 포인트가 없으면 0 입력.");
		return scanner.nextInt();
	}

	public static int inputCardOrCash() {
		System.out.println("## 신용카드는 1번, 현금은 2번을 선택하세요.");
		return scanner.nextInt();
	}

}
