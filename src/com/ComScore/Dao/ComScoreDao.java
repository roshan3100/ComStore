package com.ComScore.Dao;

import java.util.List;

import com.ComScore.Model.Comscore;
import com.ComScore.Model.gross_info;
import com.ComScore.Model.week_info;

public interface ComScoreDao {
	
	public void savecomscore(List<Comscore> comscore);


	List<gross_info> getgross_info();

	List<week_info> getweek_info();

	List<Comscore> getComscore();

}
