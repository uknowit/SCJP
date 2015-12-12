package com.shashi.java.certificate;

/*
 * Interface can extends other interfaces.
 * Interface cannot implement other interfaces & extend classes
 */
public interface SpecialBounceInterface extends SampleInterface {
	void add_special_bounce();
}

interface void_interface extends SpecialBounceInterface {
	
}

interface multiple_void_interface extends void_interface, SampleInterface {
	
}
/*
interface implementer_interface implements multiple_void_interface {
	
}

*/