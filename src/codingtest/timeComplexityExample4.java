package codingtest;

public class timeComplexityExample4 {

	public static void main(String[] args) {

		int N = 10000;
		int cnt = 0;
		for(int i = 0; i < N; i++) {
			for(int j= 0; j < N; j++) {
				System.out.println("���� Ƚ��:" + cnt++);	
			}
		}
	}
}
