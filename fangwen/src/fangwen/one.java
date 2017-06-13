package fangwen;

public class one {
	
	
	public void childrenclass(){
		
		
	}
	/*super()
	 * 1.super是父类的引用，而super()的是指向父类的构造函数
	 * 2.如果一个子类继承父类的话，会默认调用父类的无参构造函数(原理的是：隐式的调用super())
	 * 3.如果父类的构造覆盖了无参构造函数并且带有参数，那么子类的够着函数的super()就必须显示定义了。
	 * 4.super()调用作用和目的：通过子类的够着函数给父类里面的成员变量赋值。
	 * 5.super()必须放置在子类构造函数的第一行
	 * 
	 * */
	
	//只要一个类继承另一个类，就可以拥有父类public和protected的成员属性和成员方法。
	//缺省的只能在同一个包才能访问
	
	/*重点：
	 * 1.如果一个类继承了另一个类，那么会产生一个super对象，而对象会指向父类，也就是说super是当前父类的一个引用。
	 * 2.如果一个类没有继承，super指向的object。
	 * 
	 * */
	public static void main(String[] args) {
		int k=1;
		int num =++k + k++ + k++ + ++k;
		System.out.println(num);
	}
}
