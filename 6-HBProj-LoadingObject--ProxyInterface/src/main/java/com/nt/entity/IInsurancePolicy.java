package com.nt.entity;

import java.io.Serializable;

public interface IInsurancePolicy{
	public Integer  getPolicyId();
	public void setPolicyId(Integer policyId) ;
	public  String getPolicyName(); 
	public void setPolicyName(String policyName); 
	public  String getPolicyType(); 
	public void setPolicyType(String policyType);
	public   String getCompany(); 
	public void setCompany(String company) ;
	public  Integer getTenure();
	public void setTenure(Integer tenure) ;
}
