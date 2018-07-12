package day17;
import java.util.Scanner;
public class fact {
public static void main(String[] args) {
	int a,fact=1,i=1;
	Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number");
    a=sc.nextInt();
    for(i=1;i<=a;i++){
    	fact=fact*i;
    }
    System.out.println(a+" factorial is "+fact);
}
}
