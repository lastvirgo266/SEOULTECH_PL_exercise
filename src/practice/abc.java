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

a.print();// 2012 = 2014 + 1
System.out.println(a.i); //2015
b = c;
b.print(); // 2013 = 2014, ����� 2015
System.out.println(b.i); //2014

a = b;
a.print(); // 2014 = 2015, ����� 2016
System.out.println(a.i); //2012
}
}