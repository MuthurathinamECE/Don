package day17;
import java.util.Scanner;
public class posstive {
 public static void main(String args[]){
	 int a,b=0;
	 Scanner sc=new Scanner(System.in);
	 System.out.println("enter the number");
	 a=sc.nextInt();
	 b=a;
	 if(b==0){
		 System.out.println(a+" is Zero");
	 }
	 else if(a<0){
		 System.out.println(a+" is negative");
	 }
	 else
		 System.out.println(a+" is posstive");
 }
}
