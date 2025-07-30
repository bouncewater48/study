package day21;

public class pr1 {
	    public static void main(String[] args) {
		        for (int i = 0; i < 3; i++) {
		            for (int j = 0; j < i; j++) {
		                System.out.print(" "); 
		            }
		            System.out.print("*");

		            if (i != 2) {
		                for (int j = 0; j < 4 - (3 * i); j++) {
		                    System.out.print(" "); 
		                }
		                System.out.print("*");
		            }
		            System.out.println();
		        }

		        for (int i = 1; i >= 0; i--) {
		            for (int j = 0; j < i; j++) {
		                System.out.print(" "); 
		            }
		            System.out.print("*");

		            if (i != 2) {
		                for (int j = 0; j < 4 - (3 * i); j++) {
		                    System.out.print(" "); 
		                }
		                System.out.print("*");
		            }
		            System.out.println();
		            /*	            
		            *    *
		             * *
		              *
		             * *
		            *    *
		           */
	        }
	    }
}
