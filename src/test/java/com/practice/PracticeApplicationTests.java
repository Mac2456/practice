package com.practice;

import com.practice.model.Student;
import com.practice.repository.StudentRepo;
import com.practice.service.StudentService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.mock.mockito.MockBeans;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PracticeApplicationTests {

	@Autowired
	private StudentService studentService;

	@MockBean
	private StudentRepo studentRepo;

	@Test
	public void getalltest() {
		when(studentRepo.findAll()).thenReturn(Stream.of(new Student(7,"ravi","patel",30,5.6),
				new Student(8,"Path","BAPS",32,6.6)).collect(Collectors.toList()));
		assertEquals(2,studentService.getall().size());
	}
	@Test
	public void addNameTest() {
		Student student = new Student(7,"ravi","patel",30,5.6);
		when(studentRepo.save(student)).thenReturn(student);
		assertEquals(student,studentService.addName(student));
		}
	@Test
	public void removeNameTest() {
		Student student = new Student(1,"ravi","patel",30,5.6);

		studentService.removeName(student.getStudent_Id());
		verify(studentRepo,times(1)).deleteById(student.getStudent_Id());

	}


}
