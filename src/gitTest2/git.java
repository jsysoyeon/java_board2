package gitTest2;
import java.util.Scanner;

public class git {

	public static void main(String[] args) {

		input a = new input();
		Scanner sc = new Scanner(System.in);
		String[] title = new String [100];
		String[] text = new String [100];
		int i = 0;
		
		while(true) {
			a.menu();
			String s = sc.nextLine();
			if(s.equals("exit")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			if(s.equals("add")) {
				System.out.println("제목 : ");
				title[i] = sc.nextLine();
				System.out.println("내용 : ");
				text[i] = sc.nextLine();
				i++;
			}
			if(s.equals("list")) {
				for(int j = 0; j < i; j++) {
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







