package helloWorld;
/*
public class helloWorld{
	public static void main(String[]args) {
		Student xin=new Student();//����һ��Student ����������xin
		xin.age=18;//xin������18�ꡣ
		xin.name="С��";
		xin.study();
	}
}
		class Student{
			int age;
			String name;
			
			public void study() {
				System.out.println(name+"��ѧϰ,"+"��"+age+"�꣡");
			}
		}
*/
/*
public class helloWorld{
	 public static void main(String[]args) {
		 dog ha=new dog();
		 ha.age=6;//���÷���ʱ���������ֵ
		 ha.bark();
	 }
}
		class dog{
			String name;
			int age;
			public void bark() {
				int age=2;//�ڷ����ﶨ������Ա�����������������ȼ�Ҫ��
				if(age>10) {
					System.out.println("Ŷ����");
				}else if(age>5) {
					System.out.println("������");
				}else if(age>1) {
					System.out.println("oho���");
				}
			}
		}
*/
/*
		class master{
			String name;
			int age;
			public void fight(int ae) {
				String name="��";
				if(ae>5) {
				System.out.println(name+",�����Ѿ������ˣ�");
				}else if(ae<=4) {
					System.out.println("oh");
				}
			}
		}
public class helloWorld{
	public static void main(String[]args) {
		master d=new master();//����һ����Ϊd�Ķ���
		//���Ȼ���ջ������һ����Ϊd�Ŀռ䣬Ȼ���ȡmaster ��name��age���ԡ���ʱ������name��age����δ����,���ԣ�nameΪnull��ageΪ0��
		d.name="С��";//��ôѷ�����ֲ�������Ч
		d.fight(29);
	}
}
*/
/*
		class Test{
			int width;
			int height;
			public void zhou() {
				//�󳤷��ε��ܳ������
				int z=(width+height)*2;
				System.out.println("Test���ܳ��ǣ�"+z);
			}
			public void size() {
				int size=width*height;
				System.out.println("size������ǣ�"+size);
			}
			
		}
public class helloWorld{
	public static void main(String[]args) {
		Test xin=new Test();
		xin.width=3;
		xin.height=5;
		xin.zhou();
		xin.size();
	}
}

*/
		class point{
			int x;
			int y;
			
			public double size(point p) {
				double r=Math.sqrt(p.x-x)*(p.x-x)+(p.y-y)*(p.y-y);//��r����ƽ��
				//p.x=33��p.y=44
				return r;

			}
			
		}
public class helloWorld{
	public static void main(String[]args) {
		point p1=new point();
		p1.x=12;
		p1.y=33;
		point p2=new point();
		p2.x=33;
		p2.y=44;
		double d=p1.size(p2);//��p2��ֵ��������
		System.out.println(d);
	}
}