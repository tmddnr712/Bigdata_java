package june624;
import java.util.Scanner;
// 가위 바위 보
// 함수 베이스로 작성
// 작성 방법은 3가지
// 1번째 방식 : 컴퓨터(3), 유저(3) => 9가지 경우의 수가 발생 if else문을 이용해서 경우의 수를 처
public class RCP {
	public static void main(String[] args) { 
		Scanner sc = new Scanner(System.in); 
		System.out.println("[1: 가위 2:바위 3:보]"); 
		int user = sc.nextInt(); 
		int com = (int) (Math.random() * 3 + 1 - 1) + 1; 
		game(user, com); 
		}
	
	public static void game(int user, int com) {
		// user 
		String users = null; switch (user) {
		case 1: users = "가위"; break; 
		case 2: users = "바위"; break; 
		case 3: users = "보"; break; 
		} 
		// computer 
		String coms = null; 
		
		switch (com) { 
		case 1: coms = "가위"; break; 
		case 2: coms = "바위"; break; 
		case 3: coms = "보자기"; break; 
		}  
		System.out.printf("[나: %s] VS [컴퓨터: %s]\n", users, coms); 
		if ((com == 1 && user == 1) || (com == 2 && user == 2) || (com == 3 && user == 3)) { 
			System.out.println("비김"); 
			} 
		else if ((com == 1 && user == 2) || (com == 2 && user == 3) || (com == 3 && user == 1)) { 
			System.out.println("이김"); 
			} 
		else if ((com == 1 && user == 3) || (com == 2 && user == 1) || (com == 3 && user == 2)) { 
			System.out.println("짐"); 
		} 
	}
}