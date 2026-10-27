class ExClass2 {
	private int a = 1;
	private void display() {
		System.out.println("Private 메서드입니다.");
	}
}

public class MyClass5 {

	public static void main(String[] args) {
		ExClass2 obj = new ExClass2();
		obj.a = 2;
		System.out.println(a);
		obj.display();

	}

}
