public class First {
	// 设置为私有，防止被修改
	private static First instance = null;

	// 私有的构造方法，防止被实例化
	private First() {

	}

	public static First getInstance() {
		if (instance == null) {
			instance = new First();
		}
		return instance;
	}
}