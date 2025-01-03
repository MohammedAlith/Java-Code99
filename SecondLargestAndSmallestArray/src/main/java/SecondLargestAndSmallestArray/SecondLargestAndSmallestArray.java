package SecondLargestAndSmallestArray;

 import java.util.Arrays;

public class SecondLargestAndSmallestArray {
	
		public static void main(String[] args) {
		 int arr[]= {10,60,56,80,56,13,68};
		 
		 Secondvalue(arr);
		 System.out.println("Sorted Array is :"+Arrays.toString(arr));
		 System.out.println("Second Smallest Number : "+arr[1]);
		 System.out.println("Second Largest Number : "+arr[arr.length-2]);



		}
		public static void Secondvalue(int []arr) {
			int n= arr.length;
			
			for(int i=0;i<n-1;i++) {
				for(int j=0;j<n-i-1;j++) {
					if(arr[j] > arr[j +1]) {
						int temp =arr[j];
						arr[j]=arr[j+1];
						arr[j+1]=temp;
					}
				}
			}
		}
	}

