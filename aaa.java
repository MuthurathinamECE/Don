package day20;

import java.util.Scanner;

public class aaa {
public static void main(String args[]){
	 String a,b="",c="",d;
	    int z,x1=0,f1=0,y=0,x=0,i,e=0,f=0,g=0,e1=0;
	    char j;
	    Scanner sc=new Scanner(System.in);
	    a=sc.next();
	    d=sc.next();
	    x=a.length();
	    x1=d.length();
	    if(x==x1){
	    for(i=0;i<x;i++){
	    	e=a.charAt(i);
	    	e1=d.charAt(i);
	    	if(e>=65&&e<=90){
	    		f=e-64;
	    	}
	    	else{
	    		f=e-96;
	    	}
	    	if(e1>=65&&e1<=90){
	    		f1=e1-64;
	    	}
	    	else{
	    		f1=e1-96;
	    	}
	    	g=f+f1;
	    	if(g<=26){
	                 j=(char)(g+96);
	                 System.out.print(j);
	    	}
	    		else if(g>=27&&g<=52){
	    			int b1=g%26;
	    			j=(char)(b1+96);
	    			System.out.print(j);
			}
}
	    }	    
}
}
