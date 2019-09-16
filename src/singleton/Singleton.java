package singleton;

public class Singleton {
	private static Singleton uniqueInstance;
	
	private Singleton(){}
	
	public static Singleton getInstance(){
		if(uniqueInstance == null){
			uniqueInstance = new Singleton();
		}
		return uniqueInstance;
	}

	public void showBook(){
		System.out.println("BOOK ID: 1,BOOK Title: Java ");
	}
	public void showBook1(){
		System.out.println("BOOK ID: 2,BOOK Title: PHP ");
	}
}
