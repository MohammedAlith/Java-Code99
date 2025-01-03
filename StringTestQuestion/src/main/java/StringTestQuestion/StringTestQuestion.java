package StringTestQuestion;

public class StringTestQuestion {
   public static void main(String[] args) {
       String[] arr = {"apple", "ape", "april"};
       char common;
;       
       for (int i = 0; i < arr.length; i++) {
       
           char[] charArray = new char[arr[i].length()];
           
           
           for (int j = 0;  j < arr[i].length(); j++) {
               charArray[j] = arr[i].charAt(j);  
           }
           
           
       
           for (int j = 0; j < charArray.length; j++) {
               
               if(arr[i].charAt(j)==charArray[j]) {
            	  common=charArray[i];
            	  System.out.print(common);
            	  common++;
            	 
               }
             
           }
//           System.out.println();
     	

          
          
   }
}
}
