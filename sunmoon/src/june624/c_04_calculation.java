package june624;

public class c_04_calculation {
	//두 수를 더하는 함수(사칙연산)
	public static void main(String[] args) { 
		int n1 = 5; int n2 = 10;
		System.out.println(add(n1, n2));
		System.out.println(subtract(n1, n2));
		System.out.println(multiply(n1, n2));
		System.out.println(divides(n1, n2));
	}
	public static int add(int n1, int n2) {
		int result = n1 + n2;
		return result;
	}
	// subtract, multiply, divides 함수를 작성해 보세요.
	public static int subtract(int n1, int n2) {
		int result = n1 - n2;
		return result;
	}
	public static int multiply(int n1, int n2) {
		int result = n1 * n2;
		return result;
	}
	public static float divides(float n1, float n2) {
		float result = n1 / n2;
		return result;
	}
	
}
