package com.crazytd.springstaff.demo;

public class Person {
	private final String name;
	private final String gender;
	private final String mobile;
	private final Double weght;
	private final Double hight;

	public static class Builder{
		private String name;
		private String gender;

		private String mobile = "";
		private Double weght = 0D;
		private Double hight = 0D;

		public Builder(String name,String gender){
			this.name = name;
			this.gender = gender;
		}

		public Builder mobile(String val){
			mobile =val;
			return this;
		}
		public Builder weght(Double val){
			weght = val;
			return this;
		}
		private Builder hight(Double val){
			hight = val;
			return  this;
		}
		public Person build(){
			return new Person(this);
		}
	}
	private Person(Builder builder){
		name = builder.name;
		gender = builder.gender;
		mobile = builder.mobile;
		weght  = builder.weght;
		hight = builder.hight;
	}

}
