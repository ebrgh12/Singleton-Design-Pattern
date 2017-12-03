
public class SingletonDemo {
	
public static void main(String[] args){
	//illegal construct
	//Compile time Error : The constructor SingleObject() is not visible
	//Singleton object= new Singleton();
	
	//Get the only object available
	Singleton object = Singleton.getInstance();
	
	//Using this object to show message
	object.showMessage();
	
}
}
