package exercise;

public class ex03_IntType {
    public static void main(String[] args) {
        int i;
        long l = 99999L*99999L;
        i = (int)l;
        System.out.println(Integer.toBinaryString(i));
        System.out.println(Long.toBinaryString(l));
        System.out.println("i = " + i + "\n" + "l = " + l);
        
        float f = 1.0f/3.0f;
        double d = 1.0/3.0;
        System.out.println("f = " + f + "\n" + "d = " + d);
    }
}
