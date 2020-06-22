package com.wipro.RatingStudents.Service;

import java.util.ArrayList;  
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.RatingStudents.Model.AssignmentBean;

import com.wipro.RatingStudents.Repository.AssignmentRepository;
import com.wipro.RatingStudents.Repository.DistributionRepository;

@Service
public class RatingStudentsService {
	
	@Autowired
	AssignmentRepository ar; 
	
	@Autowired
	DistributionRepository dr;
	
	public String GetDataByName(AssignmentBean ab) 
	{
		HashSet<String> sub=(HashSet<String>) ar.findBySubject(ab.getSubject());
		ArrayList<String> subjectName=new ArrayList<>(sub);
		String data="";
		for(int k=0;k<subjectName.size();k++)
		{
		List<String> list1=ar.findByStudentName1(ab.getStudentName(),subjectName.get(k));
		List<Integer> list2=ar.findByStudentName2(ab.getStudentName(),subjectName.get(k));
		LinkedHashMap<String, Integer> map1=new LinkedHashMap<String, Integer>();
		if(list1.size()>0&&list2.size()>0) 
		{	
			for(int i=0;i<list1.size();i++)
			{
				map1.put(list1.get(i),list2.get(i));
			}
			
			String score=ScoreCalculation(map1);
			data=data+subjectName.get(k) +"   "+ score+"\n";
		}
		else 
		{
			data= "Not exist";
		}
	
		}
		return data;
	} 
	
	
	public String GetDataBySubject(AssignmentBean ab) 
	{
		HashSet<String> sub=(HashSet<String>) ar.findByName(ab.getStudentName());
		ArrayList<String> stuName=new ArrayList<>(sub);
		String data="";
		for(int k=0;k<stuName.size();k++)
		{
		List<String> list1=ar.findByStudentName1(stuName.get(k),ab.getSubject());
		List<Integer> list2=ar.findByStudentName2(stuName.get(k),ab.getSubject());
		LinkedHashMap<String, Integer> map1=new LinkedHashMap<String, Integer>();
		if(list1.size()>0&&list2.size()>0) 
		{	
			for(int i=0;i<list1.size();i++)
			{
				map1.put(list1.get(i),list2.get(i));
			}
			
			 String score=ScoreCalculation(map1);
			 data=data+stuName.get(k) +"   "+ score+"\n";
		}
		else 
		{
			data= "Not exist";
		}
	
		}
		return data;
	} 
	
	
	public String ScoreCalculation(HashMap<String,Integer> map){
		int test_count =0;
        int project_count=0;
        int quiz_count=0;
        int lab_count=0;
        for(String check : map.keySet())
        {
            if(check.startsWith("t",0))
            {
                test_count++;
            }
            if(check.startsWith("p",0))
            {
                project_count++;
            }
            if(check.startsWith("q",0))
            {
                quiz_count++;
            }
            if(check.startsWith("l",0))
            {
                lab_count++;
            }
	    }
	    
	    int testScore=0;
	    int projectScore=0;
	    int quizScore=0;
	    int labScore=0;
	    Iterator<String> keyIterator = map.keySet().iterator();
        while(keyIterator.hasNext())
        {
            String key = keyIterator.next();
            Integer value=map.get(key);
            if(key.startsWith("t",0))
	        {
	            testScore=testScore+((40/test_count)*value);
	        }
	        if(key.startsWith("p",0))
	        {
	            projectScore=projectScore+((30/project_count)*value);
	        }
	        if(key.startsWith("q",0))
	        {
	            quizScore=quizScore+((20/quiz_count)*value);
	        }
	        if(key.startsWith("l",0))
	        {
	            labScore=labScore+((10/lab_count)*value);
	        }
        }
	    String ans1=Float.toString(testScore/100)+ "  " +Float.toString(quizScore/100) +"   "+Float.toString(labScore/100) +"   "+Float.toString(projectScore/100);
	    
	    return ans1;
	    
	}
	
	
	

}
