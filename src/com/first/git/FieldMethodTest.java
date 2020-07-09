package com.first.git;

import java.util.Objects;

/*
 * 练习：
 * 1.若子类重写了父类方法，就意味着子类里定义的方法彻底覆盖了父类里的同名方法，
 * 系统将不可能把父类里的方法转移到子类中：编译看左边，运行看右边
 * 
 * 2.对于实例变量则不存在这样的现象，即使子类里定义了与父类完全相同的实例变量，
 * 这个实例变量依然不可能覆盖父类中定义的实例变量：编译运行都看左边
 * 
 * 
 * 
 * 
 */
class Base {
	int count = 10;

	public void display() {
		System.out.println(this);
	}

	public void display1() {
		System.out.println(this);
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Base base = (Base) o;
		return count == base.count;
	}

//	@Override
//	public int hashCode() {
//		return 10;
//	}
}

class Sub extends Base {
	int count = 20;

	public void display() {
		System.out.println(this);
	}
}

public class FieldMethodTest {
	public static void main(String[] args) {
//		Sub s = new Sub();
//		System.out.println(s.count);//20
//		s.display();//20

		Base b = new Sub();//多态性
		System.out.println(b);





	}
}
