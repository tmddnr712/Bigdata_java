package june625;

public class d_02_student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student st = new Student("대한",100, 95, 90); // 생성자에 따라서
		st.print();
		Student st2 = new Student("한국", 100, 90);
		st2.print();
		Student st3 = new Student("만세", 100);
		st3.print();
		System.out.println(st3.getStudentName());
		
	}
	
}

// 문제 : Person class
// 이름(name), 나이(age)를 저장
// 멤버함수는 클래스 내의 변수의 값을 출력하는 함수를 작성하고 데이터를 get/set할 수 잇는 함수를 작성하세요
// Person 데이터를 이용해서 대한이 : 10, 민국이 : 11, 만세 : 12 인 데이터를 저장하고 출력하세요.