package codingtest;

public class timeComplexityExample3 {

	public static void main(String[] args) {

		int N = 10000;
		int cnt = 0;
		for(int i = 0; i < N; i++) {
			System.out.println("연산 횟수:" + cnt++);
		}
		for(int i = 0; i < N; i++) {
			System.out.println("연산 횟수:" + cnt++);
		}
		for(int i = 0; i < N; i++) {
			System.out.println("연산 횟수:" + cnt++);
		}
	}

}
