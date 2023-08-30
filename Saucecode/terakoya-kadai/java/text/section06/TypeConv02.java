package text.section06;

public class TypeConv02 {
	public static void main(String[] args) {
		
//		short型の値をbyte型にキャストする
		short valShort = 32767;
		byte valByte = (byte)valShort; //byte型に収まらず不正値となる
		System.out.println(valByte);
		
//		double型の値をint型にキャストする
		double valDouble = 123.456;
		int valInt = (int)valDouble; // 小数部分はカットされる
		System.out.println(valInt);
	}
}
