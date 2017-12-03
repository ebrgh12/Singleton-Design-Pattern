package SingletonSynchronized;

/* Here using synchronized makes sure that only one thread at a time can execute getInstance()*/

public class Singleton {

	private static Singleton obj;
	
	// Private Constructor
	private Singleton(){
		
	}
	// Only one thread can execute this at a time as we have used Synchronized
	public static synchronized Singleton getInstance(){
		if(obj==null){
			obj=new Singleton();
		}
		return obj;
	}
}
