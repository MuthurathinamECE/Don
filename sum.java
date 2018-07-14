package day18;
import java.util.Scanner;
public class sum {
public static void main(String args[]){
	int a,b=0,i,sum=0,sum1=0,avg=0,avg1=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number");
	a=sc.nextInt();
	int arr[]=new int[a];
	for(i=0;i<a;i++){
		arr[i]=sc.nextInt();
	}if(a%2!=0){
	b=(a/2)+1;
	for(i=0;i<b;i++){
		sum=sum+arr[i];
	}
	avg=sum/b;
	for(i=b;i<a;i++){
		sum1=sum1+arr[i];
	}
	avg1=sum1/(a-b);
	}else{
		b=(a/2);
		for(i=0;i<b;i++){
			sum=sum+arr[i];
		}
		avg=sum/b;
		for(i=b;i<a;i++){
			sum1=sum1+arr[i];
		}
		avg1=sum1/(a-b);
	}
		if(avg==avg1){
			System.out.println("Yes");
		}
		else{
			System.out.println("No");
		}	
}
}
