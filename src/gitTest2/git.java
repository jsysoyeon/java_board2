package gitTest2;

import java.util.Scanner;

public class git {

	public static void main(String[] args) {

		input a = new input();
		Scanner sc = new Scanner(System.in);
		String[] title = new String[100];
		String[] text = new String[100];
		int i = 0;

		while (true) {
			a.menu();
			String s = sc.nextLine();
			
			// 입력받은 값이 exit인지 확인하고 exit가 맞으면 종료
			if (s.equals("exit")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			
			// 입력받은 값이 add인지 확인하고 add가 맞으면 게시물 추가
			if (s.equals("add")) {
				System.out.println("제목 : ");
				// 입력받은 제목을 title 배열에 저장
				title[i] = sc.nextLine();
				System.out.println("내용 : ");
				// 입력받은 내용을 text 배열에 저장
				text[i] = sc.nextLine();
				// add가 끝날 때마다 i가 1씩 증가하여 배열에 저장
				i++;
			}
			
			// 입력받은 값이 list인지 확인하고 list가 맞으면 게시물 조회
			if (s.equals("list")) {
				for (int j = 0; j < i; j++) {
					System.out.println("제목 : " + title[j]);
					System.out.println("내용 : " + text[j]);
					System.out.println("");
				}
			}
		}
	}

}

class input {
	void menu() {
		System.out.println("--------------------------");
		System.out.println("|    게시글 추가 : add    |");
		System.out.println("|   게시글 조회 : list    |");
		System.out.println("|  프로그램 종료 : exit   |");
		System.out.println("--------------------------");
	}
}
