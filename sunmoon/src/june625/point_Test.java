package june625;

public class point_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		point po = new point(2,4);
		System.out.println(po.getX());
		System.out.println(po.getY());
		System.out.println(po.distance());
		System.out.println("원점에서의 각도" + po.theta());
		point po2 = new point(10, 8);
		System.out.println("두 점 간의 거리" + po.distanceTo(po2));
		
	}

}
