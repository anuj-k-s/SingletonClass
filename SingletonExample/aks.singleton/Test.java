
public class Test {
	public static void main(String[] args) {

		SingletonClass class1 = SingletonClass.getInstance();
		System.out.println("Hashcode for 1st Object:- " + class1.hashCode());

		SingletonClass class2 = SingletonClass.getInstance();
		System.out.println("Hashcode for 2st Object:- " + class2.hashCode());

		System.out.println("Result of .equals methods on both object:- " + class1.equals(class2));
		System.out.println(class1 == class2);

		/*
		 * We can use == operators for reference comparison (address comparison) and
		 * .equals() method for content comparison. In simple words, == checks if both
		 * objects point to the same memory location whereas .equals() evaluates to the
		 * comparison of values in the objects. If a class does not override the equals
		 * method, then by default it uses equals(Object o) method of the closest parent
		 * class that has overridden this method
		 */
	}
}
