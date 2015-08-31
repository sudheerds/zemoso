package euler227;

import java.util.Scanner;

public class Chase {

	
	public static void main(String[] args) {
		
		System.out.println("Enter no of players");
		int teamSize=new Scanner(System.in).nextInt();
		int [] player = new int[teamSize];		
		int turn1=0;
		int turn2=teamSize-1;
		int gamecount=0;
		
		while (true){
			
		
			if(player[turn1]==2 || player[turn2]==2)
				break;
			
			//Player with the first die
			int die1 = (int)(Math.random()*6+1);		
			if(die1 == 1){							
				
					player[turn1]-=1;
					
					if(turn1==0) player[turn1++]+=1;					
					else if(turn1==teamSize-1) player[turn1--]+=1;
					
					else {
						if(turn1%2==0)					
							player[turn1-=2]+=1;
						else
							player[turn1+=2]=1;
					}
				
				} else if(die1 == 6){
				
				player[turn1]-=1;
				
				if(turn1==0) player[turn1+=2]+=1;
				else if(turn1==1) player[turn1--]+=1;
				else if(turn1==teamSize-2) player[turn1++]+=1;
				
				else {
					if(turn1%2==0)					
						player[turn1+=2]+=1;
					else
						player[turn1-=2]=1;
				}
				
			}
			
			gamecount++;
			if(player[turn1]==2)
				break;
			
			//Player with the second die
			int die2 = (int)(Math.random()*6+1);			
			if(die2 == 1){							
				
				player[turn2]-=1;
				
				if(turn2==0) player[turn2++]+=1;
				else if(turn2==teamSize-1) player[turn2--]+=1;
				
				else {
					if(turn2%2==0)					
						player[turn2-=2]+=1;
					else
						player[turn2+=2]=1;
				}
			
			} else if(die2 == 6){
			
			player[turn2]-=1;
			
			if(turn2==0) player[turn2+=2]+=1;
			else if(turn2==1) player[turn2--]+=1;
			else if(turn2==teamSize-2) player[turn2++]+=1;
			
			else {
				if(turn2%2==0)					
					player[turn2+=2]+=1;
				else
					player[turn2-=2]=1;
			}
			
		}
			
			gamecount++;
			if(player[turn2]==2)
				break;			
			
		}
		
		System.out.printf("The Expected Value of the game lasts among " +
				"%d playes is %d",teamSize,gamecount);

	}

}
