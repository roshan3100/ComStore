package com.ComScore.Controller;

import java.io.File;  
import java.util.List;  
  
import javax.xml.bind.JAXBContext;  
import javax.xml.bind.Unmarshaller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ComScore.Model.ComScoreDB;
import com.ComScore.Model.Comscore;
import com.ComScore.Service.ComScoreService;
import com.ComScore.Util.ModelDB;
import com.ComScore.XMLPojo.Srg_Report; 

@Controller   
public class XmlToObject {
	
	@Autowired
	ComScoreService comscoreservice;
	
	private List<Comscore> comscore;
	
	@Autowired
	private ModelDB modeldb;
	
	@RequestMapping("/setcomscore")
    public String unmarshaller() { 
		
     try {  
   
        File file = new File("D:\\Workspace\\ComScore\\WBtestSRG.xml");  
        JAXBContext jaxbContext = JAXBContext.newInstance(Srg_Report.class);  
   
        Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();  
        Srg_Report srg_report= (Srg_Report) jaxbUnmarshaller.unmarshal(file); 
        
     //   System.out.println(srg_report.getTitle().get(0).getGrosses().getFriday_gross().getGross());
        
        comscore=modeldb.modeldb(srg_report);
        comscoreservice.save(comscore);
            
      } catch (Exception e) {  
        e.printStackTrace();  
      }  
   
     return "roshan";
    }  
	
	@RequestMapping("/getcomscore")
    public String getfront() { 
		
     try {  
   
       List<ComScoreDB> comscoredb=comscoreservice.getcomscoredb();
       
       for(ComScoreDB cms: comscoredb)
       {
    	   System.out.println(cms.getTitle());
    	   System.out.println(cms.getDist());
    	   System.out.println(cms.getGross_Date());
    	   System.out.println(cms.getRelease_Date());
    	   System.out.println(cms.getReported_Gross());
    	   System.out.println(cms.getReported_Locs());
       }
            
      } catch (Exception e) {  
        e.printStackTrace();  
      }  
   
     return "roshan";
    }  
}