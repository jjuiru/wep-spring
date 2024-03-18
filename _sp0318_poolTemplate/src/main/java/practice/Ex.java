package practice;

public class Ex {

	static int isPerectNum(int num) {
		int sum = 0;
		for (int i = 1; i < num; i++) {
			if (num % i == 0)
				sum += i;
		}
		if (num == sum)
			return 1;
		else
			return 0;
	}

	public static void main(String[] args) {
		int r = 0;
		for (int i = 1; i <= 100; i++)
			if (isPerectNum(i) != 0) {
				r += i;
				System.out.printf("%d", r);
			}
		;
	}

}
