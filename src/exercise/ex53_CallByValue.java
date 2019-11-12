package exercise;

public class ex53_CallByValue {
    public static void swap(int x, int y) {
        int temp;
        temp = x; x = y; y = temp;
        System.out.println("  swap: x = " + x + ", y = " + y);
    }
    
    
    public static void main(String[] args) {
        int x = 1, y = 2;
        System.out.println("before: x = " + x + ", y = " + y);
        swap(x, y);
        System.out.println(" after: x = " + x + ", y = " + y);
    }
    
    
}
