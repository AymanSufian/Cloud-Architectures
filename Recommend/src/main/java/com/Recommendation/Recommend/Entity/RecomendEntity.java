package com.Recommendation.Recommend.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "recommendations")
@Data
public class RecomendEntity {
	
	public RecomendEntity () {
		
		
	}

	   @Id
	   @GeneratedValue(strategy = GenerationType.IDENTITY)
	   private Long id;
	   
	   @Column(name = "product_name")
	   private String productName;
	   
	   @Column(name="requirement")
	   private String requirement;
	   
	   @Column(name="reason")
	   private String reason;
	   
	   @Column(name="r_memory")
	   private String memory;
	   
	   @Column(name="r_storage")
	   private String storage;
	   
	   @Column(name="bandwidth")
	   private String bandwidth;
	   
	   @Column(name="scalability")
	   private String scalability;
	   
	   @Column(name="reliability")
	   private String reliability;
	   
	   @Column(name="latency")
	   private String latency;

	
	   public RecomendEntity(String productName, String requirement, String reason, String memory, String storage,
						  String bandwidth, String scalability, String reliability, String latency) 
	{
		super();
		this.productName = productName;
		this.requirement = requirement;
		this.reason = reason;
		this.memory = memory;
		this.storage = storage;
		this.bandwidth = bandwidth;
		this.scalability = scalability;
		this.reliability = reliability;
		this.latency = latency;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getProductName() {
		return productName;
	}


	public void setProductName(String productName) {
		this.productName = productName;
	}


	public String getRequirement() {
		return requirement;
	}


	public void setRequirement(String requirement) {
		this.requirement = requirement;
	}


	public String getReason() {
		return reason;
	}


	public void setReason(String reason) {
		this.reason = reason;
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


	public String getScalability() {
		return scalability;
	}


	public void setScalability(String scalability) {
		this.scalability = scalability;
	}


	public String getReliability() {
		return reliability;
	}


	public void setReliability(String reliability) {
		this.reliability = reliability;
	}


	public String getLatency() {
		return latency;
	}


	public void setLatency(String latency) {
		this.latency = latency;
	}
	   
	   
	   
	   
	   

	   
}
