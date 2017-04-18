/**
* 我们在接口中定义了过多方法，以至于我们并不是全部需要
**/
interface Sourceable {
	public void method1();
	public void method2();
	public void method3();
}

abstract class Wrapper implements Sourceable {
	@Override
	public void method1() {}

	@Override
	public void method2() {}

	@Override
	public void method3() {}
}

class SourceSub1 extends Wrapper {
	@Override
	public void method1() {
		System.out.println("sourcesub1 method1");
	}
}

class SourceSub2 extends Wrapper {
	@Override
	public void method2() {
		System.out.println("sourcesub2 method2");
	}
}

public class Second {
	public static void main(String[] args) {
		Sourceable source1 = new SourceSub1();
		Sourceable source2 = new SourceSub2();
		source1.method1();
		source1.method2();
		source2.method1();
		source2.method2();
	}
}