package day20;
import java.util.Scanner;
public class SumOfNnatural {
public static void main(String[] args) {
	int a,i,b=0,c=0;
Scanner sc=new Scanner(System.in);
a=sc.nextInt();
for(i=1;i<=a;i++){
	b=i;
	c=c+b;
}
System.out.println(c);
}
}
