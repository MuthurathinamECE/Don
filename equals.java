package day21;
import java.util.Scanner;
public class equals {
public static void main(String[] args) {
	int a,b,c,i,d=1,e=1;
	String z;
	Scanner sc=new Scanner(System.in);
	a=sc.nextInt();
	b=sc.nextInt();
	c=sc.nextInt();
	for(i=1;i<=a/2;i++){
		d=i*b;
		e=c*i;
		if(a==d+e){
			System.out.println("YES");
			break;
		}
		else if(i==(a/2)-1){
			System.out.println("NO");
			break;
		}
		else{
	
		}
	}
}
}
