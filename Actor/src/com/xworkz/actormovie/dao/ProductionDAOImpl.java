package com.xworkz.actormovie.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.xworkz.actormovie.MySingleton;
import com.xworkz.actormovie.dto.ActorDTO;
import com.xworkz.actormovie.dto.MovieDTO;

public class ProductionDAOImpl implements ProductionDAO{

	@Override
	public int save(List<MovieDTO> list) {
		SessionFactory factory = MySingleton.getFactory();
		Session session = null;
		try{
			int count = 0;
			session = factory.openSession();
			session.beginTransaction();
			System.out.println("Transaction Started");
			for(MovieDTO movie : list){
				session.save(movie);
				
				count++;
			}
			session.getTransaction().commit();
			System.out.println("Transaction Commited");
			
			return count;
		}catch (Exception e){
			System.out.println("Exception Occured in save method");
			e.printStackTrace();
		}finally{
			session.close();
		}
		return 0;
	}

	@Override
	public void saveWithMovie(MovieDTO movie, ActorDTO actor) {
		SessionFactory factory = null;
		Session session = null;
		try{
			int count = 0;
			factory = MySingleton.getFactory();
			session = factory.openSession();
			session.beginTransaction();
			System.out.println("Transaction Started");
			session.save(movie);
			session.save(actor);
			session.getTransaction().commit();
			System.out.println("Transaction Commited");
		}catch (Exception e){
			System.out.println("Exception Occured in save method");
			e.printStackTrace();
		}finally{
			session.close();
		}
	}

	@Override
	public int saveActorIfMovieExist(int mid, ActorDTO actor) {
		SessionFactory factory = null;
		Session session = null;
		int actorid;
		try{
			int count = 0;
			factory = MySingleton.getFactory();
			session = factory.openSession();
			session.beginTransaction();
			System.out.println("Transaction Started");
			MovieDTO entity = session.get(MovieDTO.class, mid);
			if(entity != null){
				session.save(actor);
				actorid = actor.getId();
				session.getTransaction().commit();
				System.out.println("Transaction Commited");
				return actorid;
			}
		}catch (Exception e){
			System.out.println("Exception Occured in save method");
			e.printStackTrace();
		}finally{
			session.close();
		}
		return 0;
	}
	

}
