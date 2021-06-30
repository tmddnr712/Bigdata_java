package june625;
// 자바는 하나의 파일에 하나의 클래스만 외부로 노출 가능
// Student 클래스는 동일 파일에서만 접근이 가능
class Students{ // 학생 추상화 : template == 사용자 정의 데이터타입
	int studentId;
	String studentName;
	int grade;
	String address;
	// void가오면 return하지 않겠다.
	public void showStudentInfo() {
		System.out.println("학생의 이름은" + studentName + ", 주소는 " + address + "입니다.");
		// return 이 없음
	}
	public String getStudentName() {
		return studentName;
	}
	void printGreeting(String name) {
		System.out.println(name + "님 안녕하세요~^^");
	}
	
}
// default가 private
// default public
// 자바는 상속구조에 생성 : 암묵적으로 Object를 상속
public class d_01_class { // 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Students student1 = new Students();
		student1.studentName = "대한";
		String name = student1.getStudentName();
		System.out.println(name);
		student1.printGreeting("민국");
		student1.showStudentInfo();
	}

}
