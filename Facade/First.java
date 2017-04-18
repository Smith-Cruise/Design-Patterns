class CPU {
	public void startup() {
		System.out.println("cpu startup");
	}

	public void shutdown() {
		System.out.println("cpu shutdown");
	}
}

class Memory {
	public void startup() {
		System.out.println("memory startup");
	}

	public void shutdown() {
		System.out.println("memory shutdown");
	}
}

class Computer {
	private CPU cpu;
	private Memory memory;

	public Computer() {
		cpu = new CPU();
		memory = new Memory();
	}

	public void startup() {
		cpu.startup();
		memory.startup();
	}

	public void shutdown() {
		cpu.shutdown();
		memory.shutdown();
	}
}

public class First {
	public static void main(String[] args) {
		Computer computer = new Computer();
		computer.startup();
		computer.shutdown();
	}
}