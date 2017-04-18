interface Sourceable {
	public void method();
}

class Source implements Sourceable {
	@Override
	public void method() {
		System.out.println("the original method");
	}
}

class Decorator implements Sourceable {
	private Sourceable source;

	public Decorator (Sourceable source) {
		this.source = source;
	}

	@Override
	public void method() {
		System.out.println("before decorator");
		source.method();
		System.out.println("after decorator");
	}
}

public class First {
	public static void main(String[] args) {
		Sourceable source = new Source();
		Sourceable obj = new Decorator(source);
		obj.method();
	}
}