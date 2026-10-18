import java.util.Scanner;

public class Practice01 {

	public static void main(String[] args) {
		
		System.out.println("이름\t학번\n");
		System.out.println("Mr. Kim\t2020_000123");
		System.out.println("Mr. Lee\t2020_000456\n");
		System.out.println("어머님께서는 \"밥 먹고 설거지 해놔라.\"라고 하셨습니다.");
		System.out.println("그래서 나는 \'네.\'라고 했습니다.");
		
		Scanner scanner = new Scanner(System.in);
//		
//		String inputStr = scanner.nextLine();
//		System.out.println("inputStr: " + inputStr);
//		
//		int inputInt = scanner.nextInt();
//		System.out.println("inputInt: " + inputInt);
//		
//		scanner.nextLine();
//		
//		String inputString = scanner.nextLine();
//		System.out.println("inputString: " + inputString);
		
		System.out.println("이름 입력: ");
		String mName = scanner.nextLine();
		
		System.out.println("나이 입력: ");
		int mAge = scanner.nextInt();
		
		System.out.println("몸무게 입력: ");
		float mWeight = scanner.nextFloat(); 
		
		System.out.println("신장 입력: ");
		double mHeight = scanner.nextDouble();
		
		System.out.printf("이름: %s, 나이: %d, 몸무게: %f, 신장: %f", 
				mName, mAge, mWeight, mHeight);
		
		scanner.close();		
		

	}

}
