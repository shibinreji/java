import java.util.Scanner;
class search
{
 public static void main(String args[])
 {
  int i,j,key,n,f=0;
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the limit:");
  n=sc.nextInt();
  int array[]=new int[n];
  System.out.println("Enter  the elements:");
  for(i=0;i<n;i++)
   array[i]=sc.nextInt();
  System.out.println("The elements are:");
  for(i=0;i<n;i++)
   System.out.println("\n"+array[i]+"\n");
  System.out.println("Enter the element to be searched:");
  key=sc.nextInt();
  for(i=0;i<n;i++)
   if(key==array[i])
    {
     System.out.println("Element found at position "+i);
     f=1;
    }
    if(f==0)
      System.out.println("Element not found");
     
  }
}
