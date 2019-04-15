package com.ComScore.Controller;

import java.io.File;  
import java.util.List;  
  
import javax.xml.bind.JAXBContext;  
import javax.xml.bind.JAXBException;  
import javax.xml.bind.Unmarshaller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ComScore.XMLPojo.Srg_Report; 

@Controller   
public class XmlToObject {
	
	@RequestMapping("/")
    public String unmarshaller() { 
		
     try {  
   
        File file = new File("/WBtestSRG1.xml");  
        JAXBContext jaxbContext = JAXBContext.newInstance(Srg_Report.class);  
   
        Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();  
        Srg_Report que= (Srg_Report) jaxbUnmarshaller.unmarshal(file);  
            
      } catch (JAXBException e) {  
        e.printStackTrace();  
      }  
   
     return "roshan";
    }  
}