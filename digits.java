package day20;
import java.util.Scanner;
public class digits {
	public static void main(String[] args) {
		int a,c=0;
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		while(a!=0){
			int b=a%10;
			c++;
			a=a/10;
		}
		System.out.println(c);
	}
}
