package com.learning.PharmaStoreManagement.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Size;

@Entity
@Table(name="medical_store")
public class MedicalStore {
  
	@Id
	private int mid;
	private String mname;
	@Size(min=10,message="enter atleast 10 characters")
	private String description;
	private LocalDate validity;
	private int count;
	private String company;
	private String batch;
	
	public MedicalStore() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MedicalStore(int mid, String mname,
			@Size(min = 10, message = "enter atleast 10 characters") String description, LocalDate validity, int count,
			String company, String batch) {
		super();
		this.mid = mid;
		this.mname = mname;
		this.description = description;
		this.validity = validity;
		this.count = count;
		this.company = company;
		this.batch = batch;
	}
	public int getMid() {
		return mid;
	}
	public void setMid(int mid) {
		this.mid = mid;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public LocalDate getValidity() {
		return validity;
	}
	public void setValidity(LocalDate validity) {
		this.validity = validity;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getBatch() {
		return batch;
	}
	public void setBatch(String batch) {
		this.batch = batch;
	}
	@Override
	public String toString() {
		return "MedicalStore [mid=" + mid + ", mname=" + mname + ", description=" + description + ", validity="
				+ validity + ", count=" + count + ", Company=" + company + ", Batch=" + batch + "]";
	}
	
	
	
	
	
}
