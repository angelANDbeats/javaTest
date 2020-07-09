package com.first.git;

//考查多态的笔试题目：
public class InterviewTest1 {

	public static void main(String[] args) {
		Base1 base = new Sub1();

		base.add(1, 2, 3);//sub_1
		//所以说明：
		//父类的public void add(int a, int... arr)
		//与子类的public void add(int a, int[] arr)
		//构成了重写

		Sub1 s = (Sub1)base;
		s.add(1,2,3);//sub_2
		//s.add(1,2,3,4);//会报错，无法用2,3,4的形式匹配int[] arr




	}
}

class Base1 {
	public void add(int a, int... arr) {
		System.out.println("base1");
	}
}

class Sub1 extends Base1 {

	public void add(int a, int[] arr) {
		System.out.println("sub_1");
	}

	public void add(int a, int b, int c) {
		System.out.println("sub_2");
	}

}