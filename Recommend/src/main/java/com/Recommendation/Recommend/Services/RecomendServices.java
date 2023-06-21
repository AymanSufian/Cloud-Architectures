package com.Recommendation.Recommend.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Recommendation.Recommend.Entity.RecomendEntity;
import com.Recommendation.Recommend.Repository.RecomendRepo;
import com.Recommendation.Recommend.UserInput.UserInput;


@Service
public class RecomendServices {

	private final RecomendRepo recomendRepo;

    @Autowired
    public RecomendServices(RecomendRepo recomendRepo) {
        this.recomendRepo = recomendRepo;
    }
    
    
    
	  
	 public RecomendEntity getRecommendation(UserInput userInput) {
		 
		   
		   RecomendEntity recommendation = new RecomendEntity();
		   
		   recommendation.setMemory(userInput.getMemory());
	       recommendation.setStorage(userInput.getStorage());
	       recommendation.setBandwidth(userInput.getBandwidth());
	       recommendation.setLatency(userInput.getLatency());
	       recommendation.setReliability(userInput.getReliability());
	       recommendation.setScalability(userInput.getScalability());
	      

	       
	       if (userInput.getMemory().equalsIgnoreCase("high") &&
	           userInput.getStorage().equalsIgnoreCase("high")&&
	           userInput.getBandwidth().equalsIgnoreCase("high") &&
	           userInput.getLatency().equalsIgnoreCase("high") &&
	           userInput.getReliability().equalsIgnoreCase("high") &&
	           userInput.getScalability().equalsIgnoreCase("high") ) {
	           
	    	   
	           recommendation.setProductName("Scenario: multicloud architecture");
	           recommendation.setRequirement("Memory: High, Storage: High, Bandwidth: High, Latency: High, Reliability: High, Scalability: High ");
	    	   recommendation.setReason("It leverages multiple public, private, and hybrid clouds, providing flexibility, redundancy, and optimal resource allocation across multiple providers, ensuring high performance and availability.");

	           RecomendEntity savedRecommendation = recomendRepo.save(recommendation);
	           return savedRecommendation;
	           
	       }
	      
	       
	       
	       if (userInput.getMemory().equalsIgnoreCase("medium") &&
		           userInput.getStorage().equalsIgnoreCase("medium")&&
		           userInput.getBandwidth().equalsIgnoreCase("medium") &&
		           userInput.getLatency().equalsIgnoreCase("medium") &&
		           userInput.getReliability().equalsIgnoreCase("medium") &&
		           userInput.getScalability().equalsIgnoreCase("medium") ) {
		           
		    	   
		           recommendation.setProductName("Scenario: Hybrid cloud architecture");
		           recommendation.setRequirement("Memory: Medium, Storage: Medium, Bandwidth: Medium, Latency: Medium, Reliability: Medium, Scalability: Medium ");
		    	   recommendation.setReason("It combines the benefits of public and private clouds, allowing businesses to leverage the scalability and cost-effectiveness of public clouds while maintaining control over critical data and sensitive workloads in a private cloud environment.");

		           RecomendEntity savedRecommendation = recomendRepo.save(recommendation);
		           return savedRecommendation;
		           
		       }
	       
	      
	       if (userInput.getMemory().equalsIgnoreCase("low") &&
		           userInput.getStorage().equalsIgnoreCase("low")&&
		           userInput.getBandwidth().equalsIgnoreCase("low") &&
		           userInput.getLatency().equalsIgnoreCase("low") &&
		           userInput.getReliability().equalsIgnoreCase("low") &&
		           userInput.getScalability().equalsIgnoreCase("low") ) {
		           
		    	   
		           recommendation.setProductName("Scenario: private cloud architecture");
		           recommendation.setRequirement("Memory: Low, Storage: Low, Bandwidth: Low, Latency: Low, Reliability: Low, Scalability: Low ");
		    	   recommendation.setReason("It offers greater control over resources and data, ensuring lower costs and tighter security compared to public or hybrid clouds.");

		           RecomendEntity savedRecommendation = recomendRepo.save(recommendation);
		           return savedRecommendation;
		           
		       }
	       
	       
	       if (userInput.getMemory().equalsIgnoreCase("low") &&
		           userInput.getStorage().equalsIgnoreCase("high")&&
		           userInput.getBandwidth().equalsIgnoreCase("high") &&
		           userInput.getLatency().equalsIgnoreCase("low") &&
		           userInput.getReliability().equalsIgnoreCase("high") &&
		           userInput.getScalability().equalsIgnoreCase("high") ) {
		           
		    	   
		           recommendation.setProductName("Scenario: public cloud");
		           recommendation.setRequirement("Memory: High, Storage: High, Bandwidth: High, Latency: High, Reliability: High, Scalability: High ");
		    	   recommendation.setReason("Public cloud excels in scalability, storage, bandwidth, reliability, low latency, and memory options due to its flexible and distributed infrastructure, enabling efficient resource allocation for diverse workload needs.");

		           RecomendEntity savedRecommendation = recomendRepo.save(recommendation);
		           return savedRecommendation;
		           
		       }
	       
	      
	        
	       return recommendation;
	   }
	
}
