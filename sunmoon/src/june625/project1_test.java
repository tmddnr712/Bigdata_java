package june625;
import java.util.*;

public class project1_test {

	public static void main(String[] args) {
		project1 s = new project1(); 
		Scanner scan = new Scanner(System.in); 
		int count; 
		boolean chk = false; 
		int ban_total = 0;
		float ban_avg = 0;
		project1[] arr = new project1[6]; 
		for(int i =0; i<arr.length; i++) { 
			arr[i] = new project1(); 
		} //배열 초기화
		
		while(true) {
			System.out.println("메뉴입력 || 1. 입력 2. 출력 3. 종료 ");
			int order=scan.nextInt();
			if(order==1&&chk==false) {
				for(int i=1;i<arr.length;i++) {
					System.out.print("이름: ");
					arr[i].setName(scan.next());
					System.out.print("국어: ");
					arr[i].setKor(scan.nextInt());
					System.out.print("수학: ");
					arr[i].setMath(scan.nextInt());
					System.out.print("영어: ");
					arr[i].setEng(scan.nextInt());
					System.out.print("========"+i+"번째 입력 완료=======\n");
				}
				chk=true;
			}else if(order==1&& chk==true) {
				System.out.println("입력된 데이터가 존재합니다. 출력바랍니다.");
			}else if(order==2&&chk==true) {
				for(int i=1;i<arr.length;i++) {
					int total = 0;
					total=arr[i].getEng()+arr[i].getKor()+arr[i].getMath();
					ban_total += total;
					float avg=total/3;
					ban_avg += avg/5;
					
					System.out.println("이름 : "+arr[i].getName());
					System.out.println("국어 : "+arr[i].getKor());
					System.out.println("수학 : "+arr[i].getMath());
					System.out.println("영어 : "+arr[i].getEng());
					System.out.println("총점 : "+total);
					System.out.println("평균 : "+(int)avg);
					System.out.print("========"+i+"번째 출력 완료=======\n");
					System.out.println("반 총점: " + ban_total);
					System.out.println("반 평균: " + ban_avg);
					System.out.println("반 평균 : "+Math.round(ban_avg*100)/100.00);
				}
				chk=false;
			}else if(order==2 && chk ==false) System.out.println("입력된 데이터가 없습니다. 재입력하세요");
			else if(order==3) {
				System.out.println("종료");
				break;
			}
		}
	}

}
