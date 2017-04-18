// 等待适配
class Source {
	public void method1() {
		System.out.println("this is original method!");
	}
}

interface Targetable {
	// 与原类中方法相同
	public void method1();

	// 新方法
	public void method2();
}

class Adaper extends Source implements Targetable {
	@Override
	public void method2() {
		System.out.println("this is a targetable method");
	}
}

public class First {
	public static void main(String[] args) {
		Targetable target = new Adaper();
		target.method1();
		target.method2();
	}
}