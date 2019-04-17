package com.ComScore.Service;

import java.util.List;

import com.ComScore.Model.ComScoreDB;
import com.ComScore.Model.Comscore;
 public interface ComScoreService {
	
	void save(java.util.List<Comscore> comscore);

	List<ComScoreDB> getcomscoredb();

}
