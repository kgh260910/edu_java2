class ExClass {
	int number;
}

public class MyClass3 {
	public static void add(int a, int b, int sum) {
		sum = a + b;
	}

	public static void main(String[] args) {
	 	ExClass b = new ExClass();
	 	b.number = 30;
	 	ExClass b2 = b;
	 	b = null;
	 	System.out.println("number 값: " + b.number); // 컴파일에러발생
	}
	

}
