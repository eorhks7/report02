package yoon;

import java.util.Scanner;

public class yoon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner input = new Scanner(System.in);
	System.out.print("�⵵�� �Է��ϼ��� : ");
	int a = input.nextInt();
	if ((a%4==0 && a%100 != 0) || a % 400 ==0){
	//4�� ������ ���������� 100���� �����������ȵǰ� 400���γ���������� ����
		System.out.println(a+"���� �����Դϴ�");	
	}
	else {
		System.out.println(a+"���� ����Դϴ�");	
	}
	
	}

}
