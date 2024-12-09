package com.yogendra.limit.bean;

public class Limit {

	private Integer minimum;
	private Integer maximum;

	public Limit() {
		// default
	}

	public Limit(Integer minimum, Integer maximum) {
		this.minimum = minimum;
		this.maximum = maximum;
	}

	public Integer getMinimum() {
		return minimum;
	}

	public void setMinimum(Integer minimum) {
		this.minimum = minimum;
	}

	public Integer getMaximum() {
		return maximum;
	}

	public void setMaximum(Integer maximum) {
		this.maximum = maximum;
	}

}
