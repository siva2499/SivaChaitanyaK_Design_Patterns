package designPatterns;

public class MobileLock implements State{
	  public void action(Mobile mobile) {
	        System.out.println("The moblie is locked");
	        mobile.setState(this);
	    }
	    public String toString() {
	        return "Locked State";
	    }
}
