package designPatterns;

public class MobileUnlock implements State{
	  public void action(Mobile mobile) {
	        System.out.println("The moblie is Unlocked");
	        mobile.setState(this);
	    }
	    public String toString() {
	        return "Unloked State";
	    }
}
