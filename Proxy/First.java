interface Sourceable {
	public void method();
}

class Source implements Sourceable {
	@Override
	public void method() {
		System.out.println("the origin method");
	}
}

class Proxy implements Sourceable {
	private Source source;

	public Proxy() {
		this.source = new Source();
	}

	@Override
	public void method() {
		before();
		source.method();
		after();
	}

	private void before() {
		System.out.println("before proxy");
	}

	private void after() {
		System.out.println("after proxy");
	}
}

public class First {
	public static void main(String[] args) {
		Sourceable source = new Proxy();
		source.method();
	}
}