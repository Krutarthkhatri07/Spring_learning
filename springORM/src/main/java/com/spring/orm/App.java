package com.spring.orm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.orm.dao.StudentDao;
import com.spring.orm.entities.Student;

public class App {
	public static void main(String[] args) {
		System.out.println("");
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		StudentDao studentDao = (StudentDao) context.getBean("StudentDao");

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			System.out.println("Press 1 for add  new student");
			System.out.println("Press 2 for display all student");
			System.out.println("Press 3 for get details of single student");
			System.out.println("Press 4 for delete student");
			System.out.println("Press 5 for update student");
			System.out.println("Press 6 for exit");
			int flag=0;
			try {	
				int input = Integer.parseInt(br.readLine());
				switch (input) {
				case 1:
					System.out.println("Enter student id: ");
					int uId = Integer.parseInt(br.readLine());
					System.out.println("Enter student name: ");
					String uName =(br.readLine());
					System.out.println("Enter student city: ");
					String uCity = (br.readLine());
					Student s=new Student(uId,uName,uCity);
					int insert=studentDao.insert(s);
					System.out.println("student added:"+insert);
					System.out.println("*********************************");
					System.out.println();
					break;
				case 2:	

					List<Student> getallstudent = studentDao.getallstudent();
					System.out.println("*********************************");
					System.out.println();
					for(Student st:getallstudent)
					{
						System.out.println("Id:"+st.getStudentId()+"Name:"+st.getStudentName()+"City:"+st.getStudentCity());
						System.out.println("----------------------------------------");
					}
					System.out.println("*********************************");
					System.out.println();
					break;
				case 3:
					
					System.out.println("Enter student id: ");
					int uId1 = Integer.parseInt(br.readLine());
					Student getstudent = studentDao.getstudent(uId1);
					System.out.println("Id:"+getstudent.getStudentId()+"Name:"+getstudent.getStudentName()+"City:"+getstudent.getStudentCity());
					System.out.println("*********************************");
					System.out.println();
					break;
				case 4:
					System.out.println("Enter student id: ");
					int uId2 = Integer.parseInt(br.readLine());
					studentDao.deletestudent(uId2);
					System.out.println("student deleted");
					System.out.println("*********************************");
					System.out.println();
					break;
				case 5:
					System.out.println("Enter student id: ");
					int uId3 = Integer.parseInt(br.readLine());
					Student getstudent1 = studentDao.getstudent(uId3);
					if(getstudent1==null)
					{
						System.out.println("enter valid student id!");
						break;
					}
					System.out.println("Enter student name: ");
					String uName3 =(br.readLine());
					System.out.println("Enter student city: ");
					String uCity3 = (br.readLine());
					Student s3=new Student(uId3,uName3,uCity3);
					studentDao.updatestudent(s3);
					System.out.println("student updated");
					System.out.println("*********************************");
					System.out.println();
					break;
				case 6:
					flag=1;
					break;
				default:
					break;
				}
				if(flag==1)
				{
					break;
				}

			} catch (Exception e) {
				System.out.println("invalid input try with another one..!");
			}
		}
		System.out.println("thank you...");

	}
}
