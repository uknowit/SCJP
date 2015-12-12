package com.shashi.java.certificate;

import java.util.List;

public class Sample {
	public int m_pub_var = 12;
	public static final int FINAL_VAR = 14;
	protected String protected_str = "Hello world";
	private List<String> string_list;
	
	public void addSamples() {
		string_list.add("Shashikumar H N");
		string_list.add("Nokia Networks");
		string_list.add("Manyatha Tech Park");
	}
	
	void printAccessFunction(){}
	
	public static void main(String[] args){
		Sample m_sample = new Sample();
		Sample sample_sub = new Sample_Subclass();
		sample_sub.printAccessFunction();
		System.out.println(m_sample.protected_str);
	}
}
