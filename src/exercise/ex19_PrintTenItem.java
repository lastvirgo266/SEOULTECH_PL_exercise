package exercise;

public class ex19_PrintTenItem {
    public static void main(String[] args) {
	int i, n = 25;
	
	//�ּ��� ������ ���� i���� �ʱ�ȭ�� �ȵ�����(n�� �ʱ�ȭ ������)
	//System.out.println("i�� �� : "+ i);
	
	for (i = 1; i <= n; ++ i) {
		// ���� �����ڰ� �켱������ ���Ƽ� �� ��ȣ�� ��� ��������־����
		System.out.print(i + ((i % 10 == 0 || i == n ) ? "\n" : " "));
		}
	
	
	}
}
