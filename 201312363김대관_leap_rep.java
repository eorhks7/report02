package yoon;

import java.util.Scanner;

public class yoon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int a;
	
	do {
		
	Scanner input = new Scanner(System.in);
	System.out.print("�⵵�� �Է��ϼ��� : ");
	a = input.nextInt();
	
	if (a==0){
	
		System.out.print("");	
	}
	else if((a%4==0 && a%100 != 0) || a % 400 ==0){
	//4�� ������ ���������� 100���� �����������ȵǰ� 400���γ���������� ����
		System.out.println(a+" ���� �����Դϴ�");
	}
	else {
		System.out.println(a+" ���� ����Դϴ�");	
	}
	}while(a != 0);
		System.out.println("���α׷��� ��Ĩ�ϴ�.");
	}

}
