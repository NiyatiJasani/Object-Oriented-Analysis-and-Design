package com.tech.guitar;

public class GuitarSpec {
	
	private String model;
	private Type type;
	private Builder builder;
	private Wood backwood;
	private Wood topwood;
	private int numStrings;
	
	public String getModel(){
		return model;
	}
	public int getNumStrings(){
		return numStrings;
	}
	
	public Type getType(){
		return type;
	}
	
	public Builder getBuilder(){
		return builder;
	}
	public Wood getBackWood(){
		return backwood;
	}
	
	public Wood getTopWood(){
		return topwood;
	}
}
