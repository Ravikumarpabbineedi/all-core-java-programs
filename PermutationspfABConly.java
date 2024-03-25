import java.util.*;
class PermutationspfABConly
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String s="abc";
		char i,j,k;

		for(i='a';i<='c';i++)
		{
			for(j='a';j<='c';j++)
			{
				for(k='a';k<='c';k++)
				{
					if(i!=j && j!=k && k!=i)
					System.out.println(i+""+j+""+k);
				}
			}
		}
	}
}
		
		