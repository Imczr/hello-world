package helloWorld;


class poin{
	int x;
	int y;
	
	public int poin(poin s) {
		int i=(s.x-x)+(s.y-y);
		return i;
	}
}
public class go {
public static void main(String[]args) {
	poin d1=new poin();
	d1.x=3;
	d1.y=4;
	poin d2=new poin();
	d2.x=9;
	d2.y=8;
	
	int v=d1.poin(d2);
	System.out.println(v);
	}
}

