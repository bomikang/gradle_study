package kr.or.dgit.bigdata.school;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import kr.or.dgit.bigdata.school.dto.PhoneNumber;
import kr.or.dgit.bigdata.school.dto.Student;
import kr.or.dgit.bigdata.school.service.StudentService;

public class StudentServiceTest {
	private static StudentService studentService;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		studentService = StudentService.getInstance();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		studentService = null;
	}
	
	@Test
	public void test() {
		List<Student> list = StudentService.getInstance().findAllStudent();
		Assert.assertNotNull(list);
		for(Student s: list){
			System.out.println(s);
		}
	}
	
	@Test
	public void testSelectByNo(){
		Student std = StudentService.getInstance().selectByNo(3);
		Assert.assertNotNull(std);
	}

	
//	@Test
//	public void testInsertItem(){
//		Calendar cal = Calendar.getInstance();
//		cal.set(1995, 3-1, 8);
//		
//		Student insStd = new Student(6, "보루미둥이", "senoyrida@naver.com", cal.getTime(), new PhoneNumber("010-2678-4160"));
//		studentService.insertItem(insStd);
//		
//		List<Student> list = studentService.findAllStudent();
//		
//		Assert.assertEquals(6, list.size());
//	}
	
//	
//	@Test
//	public void testDeleteItem(){
//		studentService.deleteItem(2);
//		
//		Student std = StudentService.getInstance().selectByNo(1);
//		Assert.assertNull(std); //null이 와야함.
//	}
//	
//	
//	@Test
//	public void testUpdateItem(){
//		Calendar cal = Calendar.getInstance();
//		cal.clear(); //시 분 초를 초기화 해야 equals를 이용할 때 true가 됨.
//		cal.set(1994, 10-1, 8);
//		
//		Student std = new Student(4, "이유진", "k63439236@gmail.com", cal.getTime(), new PhoneNumber("010-1515-6666"));
//		
//		studentService.updateItem(std);
//		
//		//Assert.assertNotNull(std);
//		
//		Student selectItem = studentService.selectByNo(4);
//		
//		Assert.assertEquals(selectItem, std);
//		
//	}
//	
}
