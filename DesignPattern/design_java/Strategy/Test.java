package Strategy;

interface FortuneCookies {
    public void print();
}
class Five implements FortuneCookies {
    public void print() {
        System.out.println("It is your turn to get it");  }  }
class Two implements FortuneCookies {
    public void print() {
        System.out.println("It is never too late to start");    }  }
class Null implements FortuneCookies {
    public void print() {
        System.out.println("You got nothing"); }
} 
class Dice {
	   public int throwIt() {
	       return (int)(Math.random()*5)+1;
	   }}
	//more class...
	class Test {  
	    static void goodFortune() {
	        int luckyNum = new Dice().throwIt();
	        FortuneCookies fc;
	        switch (luckyNum) {
	            case 2: fc = new Two();
	                    break;
	            case 5: fc = new Five();
	                    break;
	            //more
	            default: fc = new Null();
	        }
	        fc.print();    }
	    public static void main(String[] args) {
	        goodFortune();    }} 