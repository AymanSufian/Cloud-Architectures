package com.Recommendation.Recommend.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Recommendation.Recommend.Entity.RecomendEntity;



@Repository
public interface RecomendRepo extends JpaRepository<RecomendEntity, Integer>{

	
}
