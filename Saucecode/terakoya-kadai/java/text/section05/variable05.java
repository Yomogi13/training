package text.section05;

public class variable05 {
	public static void main(String [] args) {
		
//		円周率
		final double PI = 3.14159;
//		円の面積・円周
		double circleArea = 0, circumfernce = 0;
//		円の半径
		int radius = 5;

//		円の面積を求める
		circleArea = PI * radius * radius;
		System.out.println(circleArea);
		
//		円周を求める
		circumfernce = PI * (radius * 2);
		System.out.println(circumfernce);
	}

}
