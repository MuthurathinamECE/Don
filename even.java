package day19;
import java.util.Scanner;
public class even {
public static void main(String[] args) {
	int a;
	Scanner sc=new Scanner(System.in);
	a=sc.nextInt();
	if(a>=0){
		if(a%2==0){
			System.out.println("even");
		}
		else{
			System.out.println("odd");
		}
	}
	else{
		System.out.println("invalid");
	}
}
}
