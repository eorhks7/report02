package yoon;

import java.util.Scanner;

public class yoon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner input = new Scanner(System.in);
	System.out.print("년도를 입력하세요 : ");
	int a = input.nextInt();
	if ((a%4==0 && a%100 != 0) || a % 400 ==0){
	//4로 나누어 떨어지지만 100으로 나누어떨어지면안되고 400으로나누어떨어지면 윤년
		System.out.println(a+"년은 윤년입니다");	
	}
	else {
		System.out.println(a+"년은 평년입니다");	
	}
	
	}

}
