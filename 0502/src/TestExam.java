import java.util.Scanner;

public class TestExam {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("500 ������ �ڿ����� �Է��ϼ���.");
		int num = sc.nextInt();
		int sum = 0;
		
		for(int i=3;i<num;i+=3) {
			if(i%2==1) {
				sum += i;
				System.out.println(i);
			}
		}
		
		System.out.println("1~"+num+"���� 3�� ����̸鼭 Ȧ���� ���� ���� "+sum+"�Դϴ�.");
		
		sc.close();

	}

}
