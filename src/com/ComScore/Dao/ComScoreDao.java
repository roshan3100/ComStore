package com.ComScore.Dao;

import java.util.List;

import com.ComScore.Model.Comscore;

public interface ComScoreDao {
	
	public void savecomscore(List<Comscore> comscore);
	List<Comscore> getComscore();

}
