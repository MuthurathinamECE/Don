package day20;
import java.util.Scanner;
public class summ {
	public static void main(String[] args) {
		int a,i,c=0,b;
	Scanner sc=new Scanner(System.in);
	a=sc.nextInt();
	b=sc.nextInt();
	int arr[]=new int[a];
	for(i=0;i<a;i++){
       arr[i]=sc.nextInt();
}
	for(i=0;i<b;i++){
		c=c+arr[i];
	}
	System.out.println(c);
	}
}