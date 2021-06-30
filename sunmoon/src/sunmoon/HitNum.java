package sunmoon;
import java.util.Random;
import java.util.Scanner;

public class HitNum {

	public static void main(String[] args) {
        // TODO Auto-generated method stub
        Random random = new Random();// 랜덤 수 만드는 객체 생성
        int answer = random.nextInt(100); // 100까지의 수만 랜덤
        //System.out.println(("정답 미리보기: ") + answer);
        int input_number;
        int repeat_count = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("1~100사이의 숫자중 하나로 배정된 숫자를 맞추시오.");
        do {
            System.out.print("정답: ");
            input_number = scan.nextInt();
            repeat_count++;
            if (input_number > answer) {
                System.out.println("숫자가 너무 작습니다..");
            }
            if (input_number < answer) {
                System.out.println("숫자가 너무 큽니다.");
            }
            if (repeat_count > 9) {
            	System.out.print("게임오버");
                break;
            }
        } while (input_number != answer);
        System.out.printf("정답입니다. 총 시도횟수는 %d회 입니다.\n", repeat_count);
 
    }
 
}
 

// 21.06.23 과제
// 숫자 알아 맞추기 게임
// 컴퓨터, 게이머
// 컴퓨터는 랜덤으로 자기 수를 결정 Random
// 게이머 : 숫자를 입력 Scanner
// 비교를 해서 정답인지 오답인지를 출력하면서 계속 반복 : 비교 for, while 문
// 오답이면 입력한 숫자가 컴퓨터의 숫자보다 큰지 작은지를 출력합니다. 숫자 너무 작다, 너무 크다라는 메시지만 출력
// 10회가 넘어가면 게이머가 진것으로 합니다. if
// 과제명_날짜_이름(제출시)