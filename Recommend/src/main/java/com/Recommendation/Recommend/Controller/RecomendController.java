package com.Recommendation.Recommend.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Recommendation.Recommend.Entity.RecomendEntity;
import com.Recommendation.Recommend.Services.RecomendServices;
import com.Recommendation.Recommend.UserInput.UserInput;


@RestController
public class RecomendController {
	
	
	    private final RecomendServices recomendServices;

	    @Autowired
	    public RecomendController(RecomendServices recomendServices) {
	    	
	        this.recomendServices = recomendServices;
	    }

	    @PostMapping("/recommendation")
	    public ResponseEntity<RecomendEntity> getRecommendation(@RequestBody UserInput userInput) {
	    	
	        RecomendEntity recommendation = recomendServices.getRecommendation(userInput);

	        
	        if (recommendation == null) {
	            return ResponseEntity.notFound().build();
	        }
	        

	        return ResponseEntity.ok(recommendation);
	    }
	
}