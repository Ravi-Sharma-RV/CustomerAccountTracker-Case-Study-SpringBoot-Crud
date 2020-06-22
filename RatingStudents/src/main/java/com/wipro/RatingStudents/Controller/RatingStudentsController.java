package com.wipro.RatingStudents.Controller;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.RatingStudents.Model.AssignmentBean;
import com.wipro.RatingStudents.Service.RatingStudentsService;

@RestController
@RequestMapping("/data")
public class RatingStudentsController {
	
	@Autowired
	RatingStudentsService rss;
	
	@RequestMapping(value="/byName/{studentName}", method=RequestMethod.GET)
	public String GetDataByName(@PathVariable("studentName") String studentName, AssignmentBean ab) 
	{	
		return rss.GetDataByName(ab);	
	}
	
	@RequestMapping(value="/bySubject/{subject}", method=RequestMethod.GET)
	public String GetDataBySubject(@PathVariable("subject") String subject, AssignmentBean ab) 
	{	
		return rss.GetDataBySubject(ab);	
	}
	
	

}
