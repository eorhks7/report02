import java.util.Scanner;

public class dsad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result = 0;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("���ڸ� �Է��ϼ��� : ");
		int b = input.nextInt();
		System.out.println(b + "��");
		if(b>0) 
			for(int i=1; i<=9; i++){
				result += b;
				
				
				System.out.println(b + "x" + i +" = "+ result);
				
			
		}
	}

}
