package exercise;

class ex75_FormattedOutput {
	public static void main(String[] args) {
		int a = 12345;
		double b = 1000.12345;
		String c = "hello World!!";
		// C스타일의 출력이 가능해졌다.
		System.out.printf("Hello World!!\n");
		System.out.printf("String : %s\n",c);
		System.out.printf("Int    : %d\n",a);
		System.out.printf("Int    : %10d\n",a);
		System.out.printf("Dounle : %f\n",b);
		System.out.printf("Dounle : %.5f\n",b);
		System.out.printf("Dounle : %1$e\n",b);
	}
}

