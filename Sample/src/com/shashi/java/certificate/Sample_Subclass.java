package com.shashi.java.certificate;

public class Sample_Subclass extends Sample{
	public void printAccessFunction() {
		System.out.println("Accessed from base class");
		System.out.println(m_pub_var + " " + protected_str+" "+FINAL_VAR);
		//System.out.println(string_list.size());
	}
}
