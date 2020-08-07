package com.nt.entity;

import java.io.Serializable;

public class Membership implements Serializable {
	private Integer mid;
	private String  name;
	private  String addrs;
	private  Integer rewardPoints;
	
	public Integer getMid() {
		return mid;
	}
	public void setMid(Integer mid) {
		this.mid = mid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddrs() {
		return addrs;
	}
	public void setAddrs(String addrs) {
		this.addrs = addrs;
	}
	public Integer getRewardPoints() {
		return rewardPoints;
	}
	public void setRewardPoints(Integer rewardPoints) {
		this.rewardPoints = rewardPoints;
	}
	@Override
	public String toString() {
		return "Membership [mid=" + mid + ", name=" + name + ", addrs=" + addrs + ", rewardPoints=" + rewardPoints
				+ "]";
	}
	
	
	

}
