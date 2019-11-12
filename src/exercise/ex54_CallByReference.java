package exercise;


//�ڹٿ��� Call By Reference�� �������� ������
//Ÿ���� �ٸ��� �Ͽ� �����Ҽ�����

class Swap {
    public int x, y;
    public static void swap(Swap obj) {
        int temp;
        temp = obj.x; obj.x = obj.y; obj.y = temp;
        System.out.println("  swap: x = " + obj.x + ", y = " + obj.y);
    }
}

public class ex54_CallByReference {
    public static void main(String[] args) {
        Swap a = new Swap();
        a.x = 1; a.y = 2;
        System.out.println("before: x = " + a.x + ", y = " + a.y);
        
        //Ŭ���� ��ü�� �����
        Swap.swap(a);
        System.out.println(" after: x = " + a.x + ", y = " + a.y);
    }
}
