package com.ComScore.Service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ComScore.Dao.ComScoreDao;
import com.ComScore.Model.ComScoreDB;
import com.ComScore.Model.Comscore;
import com.ComScore.Util.FrontDB;

@Service
public class ComScoreServiceImpl implements ComScoreService {

	@Autowired
	private ComScoreDao comscoredao;
	
	@Autowired
	private FrontDB frontdb;
	private List<ComScoreDB> comscoredb;
	
	@Override
	@Transactional
	public void save(List<Comscore> comscore) {

			comscoredao.savecomscore(comscore);

	}
	
	@Override
	@Transactional
	public List<ComScoreDB> getcomscoredb()
	{
		List<Comscore> comscore =comscoredao.getComscore();
		comscoredb = frontdb.getcomscoredb(comscore);
		return comscoredb;
	}

}
