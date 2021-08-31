# Assignment1
Assignment 1
//third highest number in a array
public class Main
{  
public static int getThirdLargest(int[] a, int total)
{  
int temp;  
for (int i = 0; i < total; i++)   
{  
for (int j = i + 1; j < total; j++)   
{  
if (a[i] > a[j])   
{  
temp = a[i];  
a[i] = a[j];  
a[j] = temp;  
}  
}  
}  
return a[total-3];  
}  
public static void main(String args[]){  

int b[]={11,66,89,24,33,91,82,77};  
 
System.out.println("Third Largest: "+getThirdLargest(b,8));  
}}  



//reverse the number
import java.util.*;
class Revnum{
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number");//12345
		int number=sc.nextInt();
		int reverse = 0;//0        
        int temp = number;//temp=12345
        int remainder = 0;
        
        while(temp>0)
        {
	    remainder = temp % 10;//remainder=5
	    reverse = reverse * 10 + remainder;//
            temp /= 10;
        }
        System.out.println("the reverse of "+number+" is = "+reverse);


//amstrong number
//Find the amtrong Number between 0 to 999
import java.util.Scanner;
 class amstrong
 {
 	public static void main(String [] argg)
 	{
 		Scanner sc=new Scanner(System.in);
 		System.out.println("Enter the Number to check whether it Amstrong Number or not");
 		int x=sc.nextInt();
 		int ch=x;
 		int reman,equal=0;
 		while(ch!=0)
 		{
 			reman=ch%10;
 			equal=equal+(reman*reman*reman);
 			ch=ch/10;
 		}
 		if(equal==x)
 		{
 			System.out.println("This is the Amstrong Number");
 		}
 		else
 		{
 			System.out.println("The Number is not Amstrong Number");
 		}

 	}
 }
