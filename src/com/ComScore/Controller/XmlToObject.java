package com.ComScore.Controller;

import java.io.File;  
import java.util.List;  

import javax.xml.bind.JAXBContext;  
import javax.xml.bind.Unmarshaller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
	private ModelDB modeldb;

	@RequestMapping("/")
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

	@RequestMapping("/comscore")
	public String comscore(Model theModel) { 

		List<ComScoreDB> theComscore = comscoreservice.getcomscoredb();
		
		// add the customers to the model
		theModel.addAttribute("comscore", theComscore);
		
		return "roshan";
	}  
}