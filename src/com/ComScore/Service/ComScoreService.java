package com.ComScore.Service;

import com.ComScore.Model.ComScoreDB;
import com.ComScore.Model.Comscore;
 public interface ComScoreService {
	
	void save(java.util.List<Comscore> comscore);

	ComScoreDB getcomscore();

}
