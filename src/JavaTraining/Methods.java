package JavaTraining;

public class Methods {

	    static int add(int x,int y){
	        int z;
	        if (x > y){
	            z= (x+y) * 5;
	        }
	        else {
	                z = x+y;
	        }
	        return z;
	    }
	     public static void main(String[] args) {
	             int a = 10;
	             int b = 7;
	             int c;
	             c= add (a,b);
	         System.out.println(c);
	    }

	
}
