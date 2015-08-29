package euler298;
import java.util.*;
import java.util.Date;

public class SelectiveAmnesia {

	static Map<Long,Integer> lm,rm;
	static int L,R;
	static int turn;
	static int CalledNum ;
	static Object obj;
	static long time;
	static Date date;
	static float diff=0;

	static Object checkList(Map<Long,Integer> m){
		
		if(m.containsValue(CalledNum)){
			
			for(Object o:m.keySet())
				if(m.get(o) == CalledNum) 
					return o;
			
		}
		
		return null;
		
	}
	
		
	public static void main(String[] args) {	
		
		lm = new TreeMap<Long,Integer>();
		 rm = new TreeMap<Long,Integer>();
		 L=0;
		 R=0;
		 turn=1;
		 CalledNum = 0;	
		System.out.println("Turn \t CalledNumber \t Larry's Memory \t Larry's Score \t Robin's Memory \t Robin's Score \n");
		
		do {
				
			
				CalledNum = (int )(Math.random() * 10 + 1);									
				if(lm.containsValue(CalledNum)!=true && lm.size()<6 && lm.size()!=5){						
						lm.put(new Date().getTime()+CalledNum,CalledNum);
					}else if(lm.containsValue(CalledNum)) {						
						if((obj = checkList(lm)) !=null){						
							lm.remove(obj);
							lm.put(new Date().getTime()+CalledNum, CalledNum);
							L++;						
							}					
					}else if(lm.containsValue(CalledNum)!=true && lm.size()==5) {					
						lm.remove((long)(lm.keySet().toArray())[0]); 
						lm.put(new Date().getTime()+CalledNum, CalledNum);
						}
					
					if(rm.containsValue(CalledNum)!=true && rm.size()<6 && rm.size()!=5){						
						rm.put(new Date().getTime()+CalledNum,CalledNum);
					}else if(rm.containsValue(CalledNum)) {						
						if((obj = checkList(rm)) !=null){						
							R++;						
							}					
					}else if(rm.containsValue(CalledNum)!=true && rm.size()==5) {					
						rm.remove((long)(rm.keySet().toArray())[0]);
						rm.put(new Date().getTime()+CalledNum, CalledNum);
						}					
					
				System.out.println(turn +"\t"+ CalledNum +"\t"+ lm.toString() +"\t"+ L +"\t"+ rm.toString() +"\t"+ R);
				turn++;	
				diff+= (L-R);
			
		}while(turn<51);
		
		System.out.printf("The expected value: E(L-R) = %.8f",Math.abs(diff/50));
		
		

	}

}
