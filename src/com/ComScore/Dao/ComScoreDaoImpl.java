package com.ComScore.Dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.ComScore.Model.Comscore;


@Repository
public class ComScoreDaoImpl implements ComScoreDao{

	// need to inject the session factory
	@Autowired
	@Qualifier("sessionFactory")
	private SessionFactory sessionFactory;

	private List<Comscore> comscore;
	@Override
	public void savecomscore(List<Comscore> comscore) {

		// get current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();

		for(Comscore cms:comscore)  
		{
			// save/upate the comscore
			currentSession.saveOrUpdate(cms);
		}

	}

	@Override
	public List<Comscore> getComscore() {

		// get the current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();

		// now retrieve/read from database using the primary key
		comscore = currentSession.createQuery("from comscore",Comscore.class).list();
		return comscore;
	}
}
