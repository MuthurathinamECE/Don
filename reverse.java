package day17;
import java.util.Scanner;
public class reverse {
public static void main(String[] args) {
	int l,i;
	String a;
	String reverse="";
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the string");
	a=sc.next();
	l=a.length();
	for(i=l-1;i>=0;i--){
		reverse=reverse+a.charAt(i);
	}
	System.out.println(a+" string reverse is "+reverse);
}
}
