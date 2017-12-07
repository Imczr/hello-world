package helloWorld;
/*
public class helloWorld{
	public static void main(String[]args) {
		Student xin=new Student();//创建一个Student 对象，名字是xin
		xin.age=18;//xin的年龄18岁。
		xin.name="小明";
		xin.study();
	}
}
		class Student{
			int age;
			String name;
			
			public void study() {
				System.out.println(name+"在学习,"+"他"+age+"岁！");
			}
		}
*/
/*
public class helloWorld{
	 public static void main(String[]args) {
		 dog ha=new dog();
		 ha.age=6;//调用方法时，不是这个值
		 ha.bark();
	 }
}
		class dog{
			String name;
			int age;
			public void bark() {
				int age=2;//在方法里定义的属性比主程序里的属性优先级要高
				if(age>10) {
					System.out.println("哦吼吼吼");
				}else if(age>5) {
					System.out.println("汪汪汪");
				}else if(age>1) {
					System.out.println("oho吼吼");
				}
			}
		}
*/
/*
		class master{
			String name;
			int age;
			public void fight(int ae) {
				String name="王";
				if(ae>5) {
				System.out.println(name+",现在已经很晚了！");
				}else if(ae<=4) {
					System.out.println("oh");
				}
			}
		}
public class helloWorld{
	public static void main(String[]args) {
		master d=new master();//创建一个名为d的对象
		//首先会在栈上申请一个名为d的空间，然后获取master 的name和age属性。这时，由于name和age都还未定义,所以，name为null，age为0；
		d.name="小明";//这么逊的名字并不会起效
		d.fight(29);
	}
}
*/
/*
		class Test{
			int width;
			int height;
			public void zhou() {
				//求长方形的周长和面积
				int z=(width+height)*2;
				System.out.println("Test的周长是："+z);
			}
			public void size() {
				int size=width*height;
				System.out.println("size的面积是："+size);
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
				double r=Math.sqrt(p.x-x)*(p.x-x)+(p.y-y)*(p.y-y);//对r除以平方
				//p.x=33，p.y=44
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
		double d=p1.size(p2);//将p2的值传给方法
		System.out.println(d);
	}
}