package git;

import java.util.Scanner;

public class Easy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
	     System.out.println("请输入姓名、年龄、性别、成绩：");
	     //姓名字符串，年龄整型，性别字符，成绩浮点型
	     Scanner sc=new Scanner(System.in);
	     String name=sc.nextLine();
	     int age=sc.nextInt(); 
	     sc.nextLine();//整型要回车
	     String sex=sc.nextLine();
	     float score;
	     score=sc.nextFloat();
	     sc.close();
	     System.out.println("姓名年龄性别成绩分别为:"+name+"  "+age+"  "+sex+"  "+score);

	}

}