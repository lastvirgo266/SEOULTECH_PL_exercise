package practice;
class A{
String s = "A 클래스";
int i = 2012;

public void print(){
System.out.println(this.s + "A클래스");
}
}

class B extends A{
String s = "B 클래스 ";
int i = 2013;

public void print(){
super.i = (++this.i) + 1;
System.out.println(this.s + "+ B클래스" + i + super.s);
}
}

class C extends B{
String s = "C 클래스";
int i = 2014;

public void print(){
super.i = this.i++;
System.out.println(this.s + " + C클래스 " + i);
}
}

public class abc {
public static void main(String[] args) {
C c = new C();
B b = new B();
A a = new B();

a.print();// 2012 = 2014 + 1
System.out.println(a.i); //2015
b = c;
b.print(); // 2013 = 2014, 출력은 2015
System.out.println(b.i); //2014

a = b;
a.print(); // 2014 = 2015, 출력은 2016
System.out.println(a.i); //2012
}
}