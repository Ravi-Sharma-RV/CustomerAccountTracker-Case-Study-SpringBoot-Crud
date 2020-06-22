package com.wipro.RatingStudents.Repository;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.wipro.RatingStudents.Model.AssignmentBean;


@Repository
public interface AssignmentRepository extends CrudRepository<AssignmentBean, Integer> {
	
	@Query("SELECT p.assignmentCategory FROM AssignmentBean p WHERE p.studentName = :studentName AND p.subject = :subject")
    List<String> findByStudentName1(@Param("studentName") String studentName,@Param("subject") String subject );
	
	
	@Query("SELECT p.points FROM AssignmentBean p WHERE p.studentName = :studentName AND p.subject = :subject")
    List<Integer> findByStudentName2(@Param("studentName") String studentName,@Param("subject") String subject );
	
	@Query("SELECT p.subject FROM AssignmentBean p")
	HashSet<String> findBySubject(@Param("subject") String subject);
	
	@Query("SELECT p.studentName FROM AssignmentBean p")
	HashSet<String> findByName(@Param("studentName") String studentName);
	
	
}
