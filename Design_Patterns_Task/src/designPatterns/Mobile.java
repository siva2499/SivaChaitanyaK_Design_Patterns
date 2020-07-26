package designPatterns;

public class Mobile {
	 private State state;
	    
	    public Mobile() {
	        state = null;
	    }
	    
	    public void setState(State state) {
	        this.state = state;
	    }
	    
	    public State getState() {
	        return state;
	    }
}
