package com.shashi.java.other;

import com.shashi.java.certificate.Sample;

public class OtherSubClass extends Sample{
	public void packageAccess() {
		System.out.println("From base from other package");
		System.out.println(m_pub_var+" "+FINAL_VAR);
	}
}
