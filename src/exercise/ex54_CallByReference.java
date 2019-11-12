package exercise;


//자바에는 Call By Reference는 존재하지 않지만
//타입을 다르게 하여 조작할수있음

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
        
        //클래스 객체에 저장됨
        Swap.swap(a);
        System.out.println(" after: x = " + a.x + ", y = " + a.y);
    }
}
