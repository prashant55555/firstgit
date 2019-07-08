
public class patt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printNums(5);

	}
	 public static void printNums(int n) 
	    { 
	        int i, j,num; 
	  
	        // outer loop to handle number of rows 
	        //  n in this case 
	        for(i=0; i<n; i++) 
	        { 
	            // initialising starting number 
	            num=1; 
	  
	            //  inner loop to handle number of columns 
	            //  values changing acc. to outer loop 
	            for(j=1; j<=i; j++) 
	            { 
	                // printing num with a space  
	                System.out.print(j+ " "); 
//	                for(j=j+i;j>=n-i;j++) {
//	                	System.out.print(num+ "*");
//	                }
//	  
	                //incrementing value of num 
	                num++; 
	            } 
	  
	            // ending line after each row 
	            System.out.println(); 
	        } 
	    } 

}
