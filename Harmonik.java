package diziler;

import java.util.Arrays;
public class Harmonik {

	
	    public static void main(String[] args) {
	    	
	        int[] arr = {10, 21, 13, 75, 45, 33, 7};
	        int sum = 0;
	        double total = 0;
	        
	        //Aritmetik ortalama buluyor
	        for (int i = 0; i < arr.length; i++) {
	            sum += arr[i];
	            
	            
	        }
	        
	        //Harmonik ortalama buluyor
	       for(int j=1; j<arr.length; j++) {
	    	  total += (1.0 / arr[j]);
	    	   
	       }

	        System.out.println(sum / arr.length);
	        System.out.println(total);
	        System.out.println(arr.length/total);
	    }
	}