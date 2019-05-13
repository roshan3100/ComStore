package com.ComScore.Util;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Component;

import com.ComScore.Model.Comscore;
import com.ComScore.Model.gross_info;
import com.ComScore.Model.week_info;
import com.ComScore.XMLPojo.Srg_Report;
import com.ComScore.XMLPojo.Title;


@Component
public class ModelDB {

	public List<Comscore> modeldb(Srg_Report srg_report) throws Exception
	{
		System.out.println("Roshan");
		List<Comscore> comscore =new ArrayList<Comscore>() ;

			Date creation_date=new SimpleDateFormat("yyyy-MM-dd").parse(srg_report.getCreation_date());
//	Date reported_date=new SimpleDateFormat("dd/MM/yyyy").parse(srg_report.getReport_date());
			
			int created_user_nr =1;
			int system_day_nr =1;
			int release_nr =1;
			
			List<Title> list=srg_report.getTitle();  
			
			for(Title title:list)  
			{
				Comscore cms= new Comscore();
				week_info week_info = new week_info();
				gross_info gross_info = new gross_info();
				
				
				gross_info.setCreated_date(creation_date);
				gross_info.setCreated_user_nr(created_user_nr);
				if( title.getGrosses() !=null && title.getGrosses().getFriday_gross()!=null && title.getGrosses().getFriday_gross()!=null && title.getGrosses().getFriday_gross().getDay_pct_chg()!=null && !title.getGrosses().getFriday_gross().getDay_pct_chg().isEmpty() )
				gross_info.setDay_pct_chg(Double.parseDouble(title.getGrosses().getFriday_gross().getDay_pct_chg()));
				if(title.getGrosses()!=null && title.getGrosses().getFriday_gross()!=null && title.getGrosses().getFriday_gross().getGross()!=null && !title.getGrosses().getFriday_gross().getGross().isEmpty() )
				gross_info.setGross(Integer.parseInt(title.getGrosses().getFriday_gross().getGross()));
				if(title.getLocations()!=null  && title.getLocations().getLocations_reporting()!=null && !title.getLocations().getLocations_reporting().isEmpty())
				gross_info.setLocations(Integer.parseInt(title.getLocations().getLocations_reporting()));
				
				gross_info.setSystem_day_nr(system_day_nr);
				gross_info.setUpdated_date(creation_date);
				gross_info.setUpdated_user_nr(created_user_nr);
				if(title.getGrosses()!=null && title.getGrosses().getFriday_gross()!=null  && title.getGrosses().getFriday_gross().getWeek_pct_chg()!=null && !title.getGrosses().getFriday_gross().getWeek_pct_chg().isEmpty())
				gross_info.setWeek_pct_chg(Double.parseDouble(title.getGrosses().getFriday_gross().getWeek_pct_chg()));

				week_info.setApproved("Y");
				week_info.setCreated_date(creation_date);
				week_info.setCreated_user_nr(created_user_nr);
				if(title.getGrosses()!=null && title.getGrosses().getCume_gross()!=null && title.getGrosses().getCume_gross().getCumulative_gross()!=null && !title.getGrosses().getCume_gross().getCumulative_gross().isEmpty())
				week_info.setCumulative_gross(Double.parseDouble(title.getGrosses().getCume_gross().getCumulative_gross()));
				if( title.getGrosses()!=null && title.getGrosses().getWeek_gross()!=null && title.getGrosses().getWeek_gross().getCurr_week_gross()!=null && !title.getGrosses().getWeek_gross().getCurr_week_gross().isEmpty())
				week_info.setCurr_week_gross(Double.parseDouble(title.getGrosses().getWeek_gross().getCurr_week_gross()));
				week_info.setDeleted(1);
				if(title.getLocations()!=null && title.getLocations().getLocation_pct_chg()!=null && !title.getLocations().getLocation_pct_chg().isEmpty() )
				week_info.setLocation_pct_chg(Double.parseDouble(title.getLocations().getLocation_pct_chg()));
				if(title.getLocations()!=null && title.getLocations().getLocation_week_avg()!=null && !title.getLocations().getLocation_week_avg().isEmpty())
				week_info.setLocation_week_avg(Double.parseDouble(title.getLocations().getLocation_week_avg()));
				if(title.getLocations()!=null && title.getLocations().getLocations_reporting()!=null && !title.getLocations().getLocations_reporting().isEmpty() )
				week_info.setLocations_reporting(Integer.parseInt(title.getLocations().getLocations_reporting()));
				if(title.getLocations()!=null && title.getLocations().getLocations_upcoming()!=null && !title.getLocations().getLocations_upcoming().isEmpty() )
				week_info.setLocations_upcoming(Double.parseDouble(title.getLocations().getLocations_upcoming()));
				if(title.getGrosses()!=null && title.getGrosses().getWeek_gross()!=null && title.getGrosses().getWeek_gross().getPrev_week_gross()!=null && !title.getGrosses().getWeek_gross().getPrev_week_gross().isEmpty())
				week_info.setPrev_week_gross(Double.parseDouble(title.getGrosses().getWeek_gross().getPrev_week_gross()));
				week_info.setRejected("N");
				week_info.setUpdated_date(creation_date);
				week_info.setUpdated_user_nr(created_user_nr);
				if(title.getGeneral()!=null && title.getGeneral().getWeeks_in_release()!=null && !title.getGeneral().getWeeks_in_release().isEmpty())
				week_info.setWeeks_in_release(Integer.parseInt(title.getGeneral().getWeeks_in_release()));
				
				
				if(title.getGeneral()!=null  && title.getGeneral().getBooking_xref_title_no()!=null && !title.getGeneral().getBooking_xref_title_no().isEmpty())
				cms.setBooking_xref_title_no(Integer.parseInt(title.getGeneral().getBooking_xref_title_no()));
				cms.setCreated_date(creation_date);        	
				cms.setCreated_user_nr(created_user_nr);
			  	cms.setDistributor_name(title.getGeneral().getDistributor_name());
				if(title.getGeneral()!=null &&  title.getGeneral().getRanking()!=null && !title.getGeneral().getRanking().isEmpty())
			  	cms.setRanking(Integer.parseInt(title.getGeneral().getRanking()));
			  	if(title.getGeneral()!=null && title.getGeneral().getRating()!=null && !title.getGeneral().getRating().isEmpty())
				cms.setRating(title.getGeneral().getRating());
				cms.setRelease_nr(release_nr);
				if(title.getGeneral()!=null  && title.getGeneral().getTitle_name()!=null && !title.getGeneral().getTitle_name().isEmpty())
				cms.setTitle_name(title.getGeneral().getTitle_name());
				cms.setUpdated_date(creation_date);
				cms.setUpdated_user_nr(created_user_nr);
				
				cms.setWeek_info(week_info);
				week_info.setComscore(cms);
				week_info.setGross_info(gross_info);
				gross_info.setWeek_info(week_info);
				
				comscore.add(cms);
			}	
		return comscore;
	}

}
