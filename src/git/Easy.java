package git;

import java.util.Scanner;

public class Easy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
	     System.out.println("���������������䡢�Ա𡢳ɼ���");
	     //�����ַ������������ͣ��Ա��ַ����ɼ�������
	     Scanner sc=new Scanner(System.in);
	     String name=sc.nextLine();
	     int age=sc.nextInt(); 
	     sc.nextLine();//����Ҫ�س�
	     String sex=sc.nextLine();
	     float score;
	     score=sc.nextFloat();
	     sc.close();
	     System.out.println("���������Ա�ɼ��ֱ�Ϊ:"+name+"  "+age+"  "+sex+"  "+score);

	}

}