package by.java.lesson.mod2;

public class InserSort {

	public static void printArr(int[] a, String s) {
		
		
		System.out.println(s+": " );
		
		for(int i = 0; i < a.length; i++) {
			
			System.out.print(a[i] + " ");
			
		}
		
		System.out.println("\n");
	}
	
	
	public static int binarySearch(int[] sortedArray, int key, int low, int high) {
		
	    int index;
	    
	    index = -1;
	    
	    int mid;
	    mid = 0;
	    
	    int iterations;
	    iterations = 0;

	    while (low <= high) {
	    	
	       mid = (low + high) / 2;
	        
	        if (sortedArray[mid] < key) {
	        	
	            low = mid + 1;
	            

	            
	        } else if (sortedArray[mid] > key) {
	        	
	            high = mid - 1;

	            
	        } else if (sortedArray[mid] == key) {
	        	
	            index = mid;
	            
	            break;
	            
	        }
	        
            iterations++;
	        
	    }
	    
	    if(index == -1) {
	    	
	    	index = mid;
	    }
	    

	    return index;
	}	
	
	
	public static void insertSort(int array[]) {
		
		printArr(array,"Current array");
		
		int low;
		low = 0;
		
		int high;
		
		int index;
		
		int middle;	
		middle=0;

		int counter;
		counter=0;
		
		for (int left = 0; left < array.length; left++) {

			int elem = array[left];
							
			high = left-1;

			
			index = binarySearch(array, elem, low, high);
			
			if(left-1!=-1) {
				
			if((array[left] < array[left-1])) {
				
				for(int j = left-1; j > index-1; j--) {
					
					if(array[j] > array[j+1]) {
					
					 middle =array[j]; 
					
					 array[j] = array[j+1];
					
					 array[j+1] = middle;
					}
					
				}
				
			}
			}
			
			System.out.println("index: "+index+" left: "+left);
			

			}

		
		printArr(array,"Sorted array");
			

	}


	
	
	public static void main(String[] args) {


		int[] k1 = {11,1,5,7,12,19,20,3,29,30};
		

		insertSort(k1);

		

	}

}
