package com.ComScore.Dao;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;

import org.hibernate.Criteria;
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

//		// get the current hibernate session
//		Session currentSession = sessionFactory.getCurrentSession();
//
//		// now retrieve/read from database using the primary key
//		comscore = currentSession.createQuery("from comscore",Comscore.class).list();
		
		Session session = sessionFactory.openSession();

	    // DEPRECATED: Create Criteria
	    // Criteria criteria = session.createCriteria(Contact.class);

	    // DEPRECATED: Get a list of Contact objects according to the Criteria object
	    // List<Contact> contacts = criteria.list();

	   // UPDATED: Create CriteriaBuilder
	    CriteriaBuilder builder = session.getCriteriaBuilder();

	    // UPDATED: Create CriteriaQuery
	    CriteriaQuery<Comscore> criteria = builder.createQuery(Comscore.class);

	    // UPDATED: Specify criteria root
	    criteria.from(Comscore.class);

	    // UPDATED: Execute query
	    List<Comscore> comscore = session.createQuery(criteria).getResultList();

	    // Close the session
	    session.close();
		
		return comscore;
	}
}
