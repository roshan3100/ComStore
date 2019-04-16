package com.ComScore.Dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.ComScore.Model.Comscore;
import com.ComScore.Model.gross_info;
import com.ComScore.Model.week_info;

@Repository
public class ComScoreDaoImpl implements ComScoreDao{

	// need to inject the session factory
	@Autowired
	@Qualifier("sessionFactory")
	private SessionFactory sessionFactory;

	private List<Comscore> comscore;
	private List<week_info> week_info;
	private List<gross_info> gross_info;

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
		comscore = currentSession.createQuery("from comscore").list();
		return comscore;
	}

	@Override
	public List<gross_info> getgross_info() {

		// get the current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();

		// now retrieve/read from database using the primary key
		comscore = currentSession.createQuery("from gross_info").list();
		return gross_info;
	}

	@Override
	public List<week_info> getweek_info() {

		// get the current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();

		// now retrieve/read from database using the primary key
		comscore = currentSession.createQuery("from week_info").list();
		return week_info;
	}
}
