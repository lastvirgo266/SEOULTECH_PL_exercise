package practice;
class A{
String s = "A Ŭ����";
int i = 2012;

public void print(){
System.out.println(this.s + "AŬ����");
}
}

class B extends A{
String s = "B Ŭ���� ";
int i = 2013;

public void print(){
super.i = (++this.i) + 1;
System.out.println(this.s + "+ BŬ����" + i + super.s);
}
}

class C extends B{
String s = "C Ŭ����";
int i = 2014;

public void print(){
super.i = this.i++;
System.out.println(this.s + " + CŬ���� " + i);
}
}

public class abc {
public static void main(String[] args) {
C c = new C();
B b = new B();
A a = new B();

a.print();
System.out.println(a.i);
b = c;
b.print();
System.out.println(b.i);

a = b;
a.print();
System.out.println(a.i);
}
}