package com.cg.dao;

//import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.entities.Student;

@Repository
public interface IStudentRepository extends JpaRepository<Student,Integer>
{
//    public Student addStudent(Student student);
//	public Student updateStudent(Student student);
//	public Student deleteStudent(Student student);
//	public List<Student> retrieveAllStudents();
//	public Student retrieveStudentById(int id);
	

}
