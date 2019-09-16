package singleton;

public class SingletonTest {

	public static void main(String[] args) {
		Singleton b1 = Singleton.getInstance();
		b1.showBook();
		
		Singleton b2 = Singleton.getInstance();
		b2.showBook1();

	}

}
