package again;

import java.util.*;

public class game2048 {

	public static void main(String[] args) 
	{
		Scanner input=new Scanner(System.in);
		String you = null;

		System.out.println("\n\t\tWelcome to 2048\n");
		
		int[][] arr=new int[3][3];
		Random r=new Random();
		arr[r.nextInt(2)][r.nextInt(2)]=2;
		arr[r.nextInt(2)][r.nextInt(2)]=2;
		int add=0;
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
		do{
			you=input.nextLine();
			if(you.equalsIgnoreCase("d"))	
			{
				for(int i=0;i<3;i++)
				{
					if(arr[i][0]>0 && arr[i][1]>0 && arr[i][2]>0)
					{
						add=arr[i][0]+arr[i][1]+arr[i][2];
						arr[i][0]=0;arr[i][1]=0;arr[i][2]=0;
						arr[i][2]+=add;
					}
					if(arr[i][0]>0 && arr[i][1]>0)
					{
						add=arr[i][0]+arr[i][1];
						arr[i][0]=0;arr[i][1]=0;
						arr[i][2]+=add;
					}
				
					if(arr[i][1]>0 && arr[i][2]>0)
					{
						add=arr[i][0]+arr[i][1];
						arr[i][0]=0;arr[i][1]=0;
						arr[i][2]+=add;
					}
					if(arr[i][0]>0 && arr[i][2]>0)
					{
						add=arr[i][0]+arr[i][2];
						arr[i][0]=0;arr[i][2]=0;
						arr[i][2]+=add;
					}
					if(arr[i][0]>0)
					{
						add=arr[i][0];
						arr[i][0]=0;
						arr[i][2]+=add;
					}		
					if(arr[i][1]>0)
					{
						add=arr[i][1];
						arr[i][1]=0;
						arr[i][2]+=add;
					}		
					if(arr[i][2]>0)
					{
						add=arr[i][2];
						arr[i][2]=0;
						arr[i][2]+=add;
					}
					int o=r.nextInt(2);
					int p=r.nextInt(2);
					int m=arr[o][p];
					if(m<=0)
						arr[o][p]=2;
				}
				
				for(int i=0;i<3;i++)
				{
					for(int j=0;j<3;j++)
					{
						System.out.print(arr[i][j]+"\t");
					}
					System.out.println();
				}
				System.out.println();
			}
			else if(you.equalsIgnoreCase("w"))
			{
				for(int i=0;i<3;i++)
				{
					if(arr[0][i]>0 && arr[1][i]>0 && arr[2][i]>0)
					{
						add=arr[0][i]+arr[1][i]+arr[2][i];
						arr[0][i]=0;arr[1][i]=0;arr[2][i]=0;
						arr[0][i]+=add;
					}
					if(arr[0][i]>0 && arr[1][i]>0)
					{
						add=arr[0][i]+arr[1][i];
						arr[0][i]=0;arr[1][i]=0;
						arr[0][i]+=add;
					}
				
					if(arr[1][i]>0 && arr[2][i]>0)
					{
						add=arr[0][i]+arr[1][i];
						arr[0][i]=0;arr[1][i]=0;
						arr[0][i]+=add;
					}
					if(arr[0][i]>0 && arr[2][i]>0)
					{
						add=arr[0][i]+arr[2][i];
						arr[0][i]=0;arr[2][i]=0;
						arr[0][i]+=add;
					}
					if(arr[0][i]>0)
					{
						add=arr[0][i];
						arr[0][i]=0;
						arr[0][i]+=add;
					}		
					if(arr[1][i]>0)
					{
						add=arr[1][i];
						arr[1][i]=0;
						arr[0][i]+=add;
					}		
					if(arr[2][i]>0)
					{
						add=arr[2][i];
						arr[2][i]=0;
						arr[0][i]+=add;
					}
					int o=r.nextInt(2);
					int p=r.nextInt(2);
					int m=arr[o][p];
					if(m<=0)
						arr[o][p]=2;
				}
				for(int i=0;i<3;i++)
				{
					for(int j=0;j<3;j++)
					{
						System.out.print(arr[i][j]+"\t");
					}
					System.out.println();
				}
				System.out.println();
			}
			
			else if(you.equalsIgnoreCase("s"))
			{
				for(int i=0;i<3;i++)
				{
					if(arr[0][i]>0 && arr[1][i]>0 && arr[2][i]>0)
					{
						add=arr[0][i]+arr[1][i]+arr[2][i];
						arr[0][i]=0;arr[1][i]=0;arr[2][i]=0;
						arr[2][i]+=add;
					}
					if(arr[0][i]>0 && arr[1][i]>0)
					{
						add=arr[0][i]+arr[1][i];
						arr[0][i]=0;arr[1][i]=0;
						arr[2][i]+=add;
					}
				
					if(arr[1][i]>0 && arr[2][i]>0)
					{
						add=arr[0][i]+arr[1][i];
						arr[0][i]=0;arr[1][i]=0;
						arr[2][i]+=add;
					}
					if(arr[0][i]>0 && arr[2][i]>0)
					{
						add=arr[0][i]+arr[2][i];
						arr[0][i]=0;arr[2][i]=0;
						arr[2][i]+=add;
					}
					if(arr[0][i]>0)
					{
						add=arr[0][i];
						arr[0][i]=0;
						arr[2][i]+=add;
					}		
					if(arr[1][i]>0)
					{
						add=arr[1][i];
						arr[1][i]=0;
						arr[2][i]+=add;
					}		
					if(arr[2][i]>0)
					{
						add=arr[2][i];
						arr[2][i]=0;
						arr[2][i]+=add;
					}
					int o=r.nextInt(2);
					int p=r.nextInt(2);
					int m=arr[o][p];
					if(m<=0)
						arr[o][p]=2;
				}
				for(int i=0;i<3;i++)
				{
					for(int j=0;j<3;j++)
					{
						System.out.print(arr[i][j]+"\t");
					}
					System.out.println();
				}
				System.out.println();
			}
			
			else if(you.equalsIgnoreCase("a"))
			{
				for(int i=0;i<3;i++)
				{
					if(arr[i][0]>0 && arr[i][1]>0 && arr[i][2]>0)
					{
						add=arr[i][0]+arr[i][1]+arr[i][2];
						arr[i][0]=0;arr[i][1]=0;arr[i][2]=0;
						arr[i][0]+=add;
					}
					if(arr[i][0]>0 && arr[i][1]>0)
					{
						add=arr[i][0]+arr[i][1];
						arr[i][0]=0;arr[i][1]=0;
						arr[i][0]+=add;
					}

					if(arr[i][1]>0 && arr[i][2]>0)
					{
						add=arr[i][0]+arr[i][1];
						arr[i][0]=0;arr[i][1]=0;
						arr[i][0]+=add;
					}
					if(arr[i][0]>0 && arr[i][2]>0)
					{
						add=arr[i][0]+arr[i][2];
						arr[i][0]=0;arr[i][2]=0;
						arr[i][0]+=add;
					}
					if(arr[i][0]>0)
					{
						add=arr[i][0];
						arr[i][0]=0;
						arr[i][0]+=add;
					}		
					if(arr[i][1]>0)
					{
						add=arr[i][1];
						arr[i][1]=0;
						arr[i][0]+=add;
					}		
					if(arr[i][2]>0)
					{
						add=arr[i][2];
						arr[i][2]=0;
						arr[i][0]+=add;
					}
					int o=r.nextInt(2);
					int p=r.nextInt(2);
					int m=arr[o][p];
					if(m<=0)
						arr[o][p]=2;
				}
				for(int i=0;i<3;i++)
				{
					for(int j=0;j<3;j++)
					{
						System.out.print(arr[i][j]+"\t");
					}
					System.out.println();
				}
				System.out.println();
			}
			else
				System.out.println("Invalid Move Please try again.");
		}while(true);
	}
}