package com.xworkz.actormovie;

import com.xworkz.actormovie.dao.ProductionDAO;
import com.xworkz.actormovie.dao.ProductionDAOImpl;
import com.xworkz.actormovie.dto.ActorDTO;
import com.xworkz.actormovie.dto.MovieDTO;

import java.util.ArrayList;
import java.util.List;
public class Tester {
	public static void main(String[] args) {
		try{
			System.out.println("Main Method Started");
			ProductionDAOImpl dao = new ProductionDAOImpl();
//			//---------Save using arraylist-------------------
//			List<MovieDTO> list = new ArrayList<MovieDTO>();
//			MovieDTO mdto1 = new MovieDTO("KGF", "Kannada", 45);
//			MovieDTO mdto2 = new MovieDTO("KGF2", "Kannada", 65);
//			MovieDTO mdto3 = new MovieDTO("IT", "ENGLISH", 169);
//			MovieDTO mdto4 = new MovieDTO("villan", "Kannada", 1);
//			
//			list.add(mdto1);
//			list.add(mdto2);
//			list.add(mdto3);
//			list.add(mdto4);
//			int x = dao.save(list);
//			System.out.println(x);
//			//--------------Save with Movie method---------------
//			ActorDTO adto = new ActorDTO("sudeep","kannada",23456.5f);
//			MovieDTO mdto = new MovieDTO("StarMars", "English", 1234);
//			ProductionDAO dao = new ProductionDAOImpl();
//			dao.saveWithMovie(mdto, adto);
//			System.out.println("saveWithMovie operation done");
			//-----------------SaveActorIfMovieExsist method----------------------
			ActorDTO adto = new ActorDTO("yash", "kannada", 12345.6f);
			int value = dao.saveActorIfMovieExist(1, adto);
			if(value !=0)
				System.out.println("saveActorIfMovieExist operation is done and ");
			MySingleton.getFactory().close();
			System.out.println("main method ended");
		}catch(Exception e){
			System.out.println("Exception occured in main method");
			e.printStackTrace();
		}
	}

}
