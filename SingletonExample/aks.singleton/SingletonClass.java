
public class SingletonClass {
	/*
	 * public SingletonClass() { System.out.println("Inside Singleton Class");//
	 * TODO Auto-generated constructor stub }
	 */
	private static SingletonClass singletonClassInstance = null;
	
	private SingletonClass() {
		System.out.println("Inside private Constructor");
	}
	
	public static SingletonClass getInstance(){
		if(singletonClassInstance == null) {
			singletonClassInstance = new SingletonClass();
			return singletonClassInstance;
		}
		return singletonClassInstance;
	}
	
}
