package june624;

public class c_08_box {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 문제: 가로, 세로, 높이를 입력 받아 부피를 계산하는 함수를 작성하고
		// 가로:10, 세로:20, 높이:30 인 박스의 부피를 계산하세요
		int width = 10; int length = 20; int height = 30;
		System.out.println(volume(width, length, height));

	}
	
	public static int volume(int width, int length, int height) {
		int result = width * length * height;
		return result;
	}

}
