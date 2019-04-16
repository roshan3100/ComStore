package com.ComScore.Service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ComScore.Dao.ComScoreDao;
import com.ComScore.Model.ComScoreDB;
import com.ComScore.Model.Comscore;

@Service
public class ComScoreServiceImpl implements ComScoreService {

	@Autowired
	private ComScoreDao comscoredao;
	
	private ComScoreDB comscoredb;
	
	@Override
	@Transactional
	public void save(List<Comscore> comscore) {

			comscoredao.savecomscore(comscore);

	}
	
	@Override
	@Transactional
	public ComScoreDB getcomscore()
	{
		
		return comscoredb;
	}

}
