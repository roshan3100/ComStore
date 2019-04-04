package com.ComStore.Controller;

import java.io.File;  
import java.util.List;  
  
import javax.xml.bind.JAXBContext;  
import javax.xml.bind.JAXBException;  
import javax.xml.bind.Unmarshaller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ComStore.XMLPojo.Grosses;
import com.ComStore.XMLPojo.Srg_Report;
import com.ComStore.XMLPojo.Title;
import com.ComStore.XMLPojo.Gross.cume_gross;  

@Controller   
public class XmlToObject {
	
	@RequestMapping("/")
    public String roshan() { 
		
     try {  
   
        File file = new File("/WBtestSRG1.xml");  
        JAXBContext jaxbContext = JAXBContext.newInstance(Srg_Report.class);  
   
        Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();  
        Srg_Report que= (Srg_Report) jaxbUnmarshaller.unmarshal(file);  
          
        System.out.println(que.getCreation_date()+" "+que.getReport_date());  
        System.out.println("Answers:");  
        List<Title> list=que.getTitle();
        for(Title ans:list) 
        {
        	 Grosses gross =ans.getGrosses();
        	 cume_gross cum= gross.getCume_gross();
        			System.out.println(cum.getCumulative_gross());
        }    	
   
      } catch (JAXBException e) {  
        e.printStackTrace();  
      }  
   
     return "roshan";
    }  
}