import java.util.*;
public class qs
{
	public static Scanner reader = new Scanner(System.in);
	public static int CalcAmount(int a[],int k)
	{
		int index=-1;
		
		for(int i=0;i<=a.length-k;i++)
		{
			if(ArrUtils.UpOrder(a,i,i+k)==true)
			{
					index=i;
				
				
			}
			
			}
			return index;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
  int k,n,b;
  
   System.out.println("insert n");
   n=reader.nextInt();
   int[]a=new int[n];
   ArrUtils.readArr(a);
   System.out.println("insert k");
   k=reader.nextInt();
    while(k<2||k>a.length)
    {
    	System.out.println("number is wrong insert again");
    	k=reader.nextInt();
    }
   
   b=CalcAmount(a,k);
   if( CalcAmount(a,k)==-1)
	   System.out.println("no");
   else
	   ArrUtils.printArr(a, a[b], a[b+k]);
	}

}