package homepjt;

public class MainClass {
	public static void main(String[] args) {
		int a = 3;
		int b = 5;
		float c = a/b;      // int도 가능
		System.out.println("출력 결과: " + c);
		
		int d;
		d = 10;
		System.out.println("변수의 값: " + d);
//		d = null;
	
//		float name = "JavaBook";    // 자료형이 맞지 않아 컴파일에러발생
//		System.out.println(name);
		
		byte e = 127;
		System.out.println(e);
		e++;
		System.out.println(e);
		e++;
		System.out.println(e);
		e++;
		System.out.println(e);
	}

}
