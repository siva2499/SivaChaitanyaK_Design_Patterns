package designPatterns;

public class App 
{
    public static void main( String[] args )
    {
    	// This is Singleton Design pattern
    	 SingletonClass singletonClass = SingletonClass.getInstance();
         singletonClass.showMessage();
         
         
         // This is Factory Design pattern
         IcecreamFactory icecreamFactory = new IcecreamFactory();
         Icecream MyIcecream1 = icecreamFactory.getIcecream("strawberry");
         MyIcecream1.eat();
         
         Icecream MyIcecream2 = icecreamFactory.getIcecream("MaNgO");
         MyIcecream2.eat();
         
         
         //This is State Design Pattern
         Mobile mobile = new Mobile();
         
         MobileLock lock = new MobileLock();
         lock.action(mobile);
         
         System.out.println(mobile.getState());
         
         MobileUnlock unlock = new  MobileUnlock();
         unlock.action(mobile);
         
         System.out.println(mobile.getState());
         
    }
}
