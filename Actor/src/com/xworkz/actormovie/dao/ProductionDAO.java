package com.xworkz.actormovie.dao;

import com.xworkz.actormovie.dto.ActorDTO;
import com.xworkz.actormovie.dto.MovieDTO;

import java.util.List;

public interface ProductionDAO {
	public int save(List<MovieDTO> list);
	public void saveWithMovie(MovieDTO movie,ActorDTO actor);
	public int saveActorIfMovieExist(int  mid,ActorDTO actor);

}
