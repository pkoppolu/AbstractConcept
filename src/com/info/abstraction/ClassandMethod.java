package com.info.abstraction;
abstract class C1{
	public abstract void noImplementation();
	public void withImplementation() {
		System.out.println("Method called");
	}
}
  class C2 extends C1{
	public  void noImplementation() {
		System.out.println("With Implementation called");
	}
  }

public class ClassandMethod  {
	public static void main(String[] args) {
    C2 c2 = new C2();
    c2.noImplementation();
    c2.withImplementation();
	}
}
