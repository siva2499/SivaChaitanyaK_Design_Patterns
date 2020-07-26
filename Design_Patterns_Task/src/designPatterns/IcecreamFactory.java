package designPatterns;

public class IcecreamFactory {
	
    public Icecream getIcecream(String icecream) {
        if(icecream.equals(null))
        	return null;
        
        if(icecream.equalsIgnoreCase("strawberry")) {
            return new Strawberry();
        } else if(icecream.equalsIgnoreCase("mango")) {
            return new Mango();
        } 
        return null;        
    }  

}