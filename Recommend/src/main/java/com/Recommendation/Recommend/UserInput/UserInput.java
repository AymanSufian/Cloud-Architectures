package com.Recommendation.Recommend.UserInput;


public class UserInput {
	
	   private String memory;
	   private String storage;
	   private String bandwidth;
	   private String latency;
	   private String reliability;
	   private String scalability;
	   
	   
	   
	   
	public UserInput(String memory, String storage, String bandwidth, String latency, String reliability, String scalability) {
		super();
		this.memory = memory;
		this.storage = storage;
		this.bandwidth = bandwidth;
		this.latency = latency;
		this.reliability = reliability;
		this.scalability = scalability;
	}
	
	
	
	
	
	public String getMemory() {
		return memory;
	}
	public void setMemory(String memory) {
		this.memory = memory;
	}
	public String getStorage() {
		return storage;
	}
	public void setStorage(String storage) {
		this.storage = storage;
	}
	public String getBandwidth() {
		return bandwidth;
	}
	public void setBandwidth(String bandwidth) {
		this.bandwidth = bandwidth;
	}
	public String getLatency() {
		return latency;
	}
	public void setLatency(String latency) {
		this.latency = latency;
	}
	public String getReliability() {
		return reliability;
	}
	public void setReliability(String reliability) {
		this.reliability = reliability;
	}
	public String getScalability() {
		return scalability;
	}
	public void setScalability(String scalability) {
		this.scalability = scalability;
	}

	   
	   
	  
}
