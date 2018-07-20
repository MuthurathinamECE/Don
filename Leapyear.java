package day20;

import java.util.Scanner;

public class Leapyear {
	public static void main(String[] args) {
		int a;
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
			if(a%100==0){
				if(a%400==0){
			System.out.println("leap year");
		}
				else{
					System.out.println("not leap year");
				}
		}else if(a%4==0){
          System.out.println("leap year");			
		}
		else{
			System.out.println("not leap year");
		}
		
	}

}