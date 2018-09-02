package Singleton;

public class Singleton {
	private Singleton() {}
	private final static Singleton instance = new Singleton();
	public static Singleton getInstance() {
		return instance;
	}
}
/*public class Singleton{
 * private static Singleton instance = null;
 * 
 * public static synchronized Singleton getInstance(){
 * 		if(instance == null){
 * 			instance = new Singleton();	
 * 		}
 * 		return instance;
 * 	}
 * }
 */
     