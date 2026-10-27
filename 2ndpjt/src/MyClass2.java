
public class MyClass2 {
	public static void add(int a, int b, int sum) {
		sum = a + b;
	}

	public static void main(String[] args) {
		int a = 1;
		int b = 2;
		int sum = 0;
		add(a, b, sum);
		System.out.println("합계: " + sum);   // 합계: 0
	}
	
}
