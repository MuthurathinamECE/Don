package day23;
import java.util.*;
public class removepalindrome {
public static void main(String[] args) {
	String a,z="";
	int b=0,c=0,e=0,i,j;
	Scanner sc=new Scanner(System.in);
	a=sc.next();
	b=a.length();
	char ch[]=new char[b];
	ch=a.toCharArray();
	for(i=0;i<b;i++){
		if(ch[i]!=0){
		for(j=i+1;j<b;j++){
			if(ch[j]!=0){
			if(ch[i]==ch[j]){
				ch[i]=0;
				ch[j]=0;
				c++;
			}
			}
		}
		}
}
	if(c!=0){
	System.out.println(b-(2*c));
	}
	else{
		System.out.println(b);
	}
}
}
