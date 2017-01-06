import java.util.*;
public class ArrUtils
{
  public static Scanner reader = new Scanner(System.in);
	/**
	 * @param args
	 */
  public static void readArr(int[]arr)
  {
	  for(int i=0;i<arr.length;i++)
	  {
		  System.out.println("insert a number");
		  arr[i]=reader.nextInt();
	  }
  }
	  public static void printArr(int[]arr)
	  {
		  for(int i=0;i<arr.length;i++)
		  {
			  System.out.print(arr[i]+" "); 
		  }
  }
	  public static void printArr(int[]arr,int p1,int p2)
	  {
		  for(int i=p1;i<=p2;i++)
		  {
			  System.out.print(arr[i]+" "); 
		  }
  }
	  public static boolean inArr(int[]arr,int x)
	  {
		  boolean f=false;
		  for(int i=0;i<arr.length;i++)
		  {
			 if(arr[i]==x) 
				 f=true;
		  }
		  return f;
  }
	  public static boolean inArr(int[]arr,int x,int p1,int p2)
	  {
		  boolean f=false;
		  for(int i=p1;i<p2;i++)
		  {
			 if(arr[i]==x) 
				 f=true;
		  }
		  return f;
  }
	  public static double avgArr(int[]arr)
	  {
		  int sum=0;
		  for(int i=0;i<arr.length;i++)
		  {
			  sum=sum+arr[i];
		  }
		  return sum/arr.length;
	  }
	  
	  public static int bigArr(int[]arr)
	  {
	  int max;
	  max=arr[0];
	  for(int i=1;i<arr.length;i++)
	  {
		  if(arr[i]>max)
			  max=arr[i];
	  }
		  return max;
	  }
public static boolean UpOrder(int[]arr,int p1,int p2)
{
	  boolean f=true;
	  for(int i=p1;i<p2-1;i++)
	  {
		 if(arr[i]>arr[i+1]) 
			 f=false;
	  }
	  return f;
}
	  }