package june625;

public class circle_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		point po = new point(5, 6);
		circle cl = new circle(po, 100); // point 중심 반지름 10
		cl.setRadius(10); // 100에서 10으로 변경
		
		point po2 = new point(10, 8);
		circle cl2 = new circle(po2, 100);
		if(cl.getCollision(cl2))
			System.out.println("두 원이 충돌하였습니다.");
		else
			System.out.println("두 원은 충돌하지 않았습니다.");
	}

}
