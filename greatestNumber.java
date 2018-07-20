package day20;
import java.util.Arrays;
import java.util.Scanner;
public class greatestNumber {
public static void main(String[] args) {
	int a,i;
	int arr[]=new int[100];
	Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number");
	a=sc.nextInt();
    for(i=0;i<a;i++){
    	arr[i]=sc.nextInt();
    }
    Arrays.sort(arr);
    System.out.println("Large number is"+arr[a-1]);
}
}
