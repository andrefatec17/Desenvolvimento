package exc05;


public class Son extends Father{
	Son() {
		super("Father ");
		new Father("Son ");
	}

	public static void main(String[] args) {
		new Son();
	}
}
