package TestArrayQuestion;

public class TestArrayQuestion {

	public static void main(String[] args) {
	
		int[] arr = {1, 1, 2, 2, 2, 2, 3};
        int target = 2; 
         int count = 0;
         
        
         for (int i = 0; i < arr.length; i++) {
             System.out.print(arr[i] + " ");
         }
     

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                count++;
            }
        }
        System.out.println();
        System.out.println("target: "+target);
        System.out.println("Count: " + count);

	}

}
