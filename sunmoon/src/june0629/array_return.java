package june0629;
// 대입이 실행되는 경우
// int a = 10;
// box.distanceTo(box2);
public class array_return {
	static int[] makeArray() {
		int temp[] = new int[4];
		for(int i = 1; i < temp.length+1; i++) {
			temp[i-1] = i * 100;
		}
		return temp; // array return
	}

	public static void main(String[] args) {
		int returnArray[]; // 위에 int로 생성했으니 main에서도 int로 받아야함
		returnArray = makeArray();
		
		for(int i = 0; i < returnArray.length; i++) {
			System.out.println(returnArray[i]);
		}

	}

}
