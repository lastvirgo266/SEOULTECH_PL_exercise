package exercise;

public class ex60_ScopeRule {
	int a,b,p,q;
	  public ex60_ScopeRule() {
	    a = p(); 
	    q();
	  }
	  public int p(){
	    int a;
	    a = 0; b = 1; p = 2;
	    print();
	    return p;
	  }
	  
	  public void print() {
	    System.out.println("a="+a);
	    System.out.println("b="+b);
	    System.out.println("p="+p);
	  }
	  public int q() {
	    int b,p;
	    a = 3; b = 4; p = 5; 
	    print();
	    return q;
	  }  
	  public static void main (String args[]) {
	    new ex60_ScopeRule();
	  }
}
