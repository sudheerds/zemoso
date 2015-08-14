package assignments;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;

class Triangle{		
	
	
	  static void compute(String fname) throws IOException {
		    
			File file = new File(fname);
			Scanner sc = new Scanner(file);
			System.out.println(fname);
			ArrayList<Integer> al = new ArrayList<Integer>();
			
			while(sc.hasNext())				
				al.add(sc.nextInt());
			
			sc.close();	
									
			int line=100;
			int s = al.size()-1;
			int k,c;
			
			for(int r = line; r>1; r--){
				
				k=s;
				c = k-r; 
				
				for(int j=1; j<r; j++,k--,c--){					
					
				int a= al.get(k); // is the desired number for a in x+max(a,b)
				
				int b= al.get(k-1); // is the desired number for b in x+max(a,b)
				
				int x = al.get(c); 
				int sum1 = x+a;
				int sum2 = x+b;
				
				if (sum1 > sum2){
					al.set(c,sum1);
				}
				else {
					al.set(c,sum2);
				}
					
				//c--;
			}
				
				s-=r;
			
			}
			
			System.out.println(al.get(0));
		
	}
	
	public static void main(String[] args) throws IOException {
			
			String fname = "/home/sudheerds/Desktop/triangle.txt";
			Triangle.compute(fname);

		}
}

