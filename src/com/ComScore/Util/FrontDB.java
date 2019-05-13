package com.ComScore.Util;

import com.ComScore.Model.Comscore;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.ComScore.Model.ComScoreDB;

@Component
public class FrontDB {
	
	List<ComScoreDB> comscoredb = new ArrayList<ComScoreDB>();
	
	public List<ComScoreDB> getcomscoredb(List<Comscore> comscore)
	{
		System.out.println("Roshan");
		for(Comscore cms :comscore)
		{
			ComScoreDB coms =new ComScoreDB();
			
			coms.setTitle(cms.getTitle_name());
			coms.setDist(cms.getDistributor_name());
			coms.setGross_Date(cms.getWeek_info().getGross_info().getCreated_date());
			coms.setRelease_Date(cms.getCreated_date());
			coms.setReported_Gross(cms.getWeek_info().getGross_info().getGross());
			coms.setReported_Locs(cms.getWeek_info().getGross_info().getLocations());
			
			comscoredb.add(coms);
		}
		return comscoredb;
	}

}
