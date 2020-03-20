package com.bbva.ubi.dto.ubicator.test;

import static org.junit.Assert.assertArrayEquals;
import org.junit.Before;
import org.junit.Test;

import com.bbva.ubic.dto.ubicator.DataInUbiDTO;

import junit.framework.Assert;

public class DataInUbiDTOTest {

	DataInUbiDTO in= new DataInUbiDTO();
	
	/**
	 * Method for test the sentence Starting()  - ended - OK
	 */
	@Before
	public void starting(){
		in.setOrigen("BOGOTA");
		in.setDestino("SOACHA");
		in.getOrigen();
		in.getDestino();
	}
	
	/**
	 * Method for test the sentence toString() - ended - OK
	 */
	@Test
	public void testToString(){
		Assert.assertEquals(in.toString(), "DataInUbiDTO [origen=BOGOTA, destino=SOACHA]");
		Assert.assertFalse(in.toString().equals("BOGOTA-SOACHA"));
	}
	
	/**
	 * Method for test the sentence HashCode() - ended - OK
	 */
	@Test
	public void testHashCode(){
		Assert.assertEquals(in.hashCode(), in.hashCode());
		Assert.assertFalse(((Integer)in.hashCode()).equals(1));
		Assert.assertFalse(((Integer)(new DataInUbiDTO()).hashCode()).equals(2));
	}
	
	/**
	 * Method for test the sentence Equals() - ended - OK
	 */
	@Test
	public void testEquals(){
		DataInUbiDTO in1 = new DataInUbiDTO();
		DataInUbiDTO in2 = new DataInUbiDTO();
		
		Assert.assertEquals(in1.equals(in2), true);
		Assert.assertEquals(in.equals(in), true);
		Assert.assertEquals(in.equals(null), false);
		Assert.assertEquals(in.equals(new Integer(1)), false);
		
		Assert.assertEquals(in1.equals(in), false);
		
		in2.setDestino(in.getOrigen());
		Assert.assertEquals(in.equals(in2), false);
		
		in2.setOrigen(in.getOrigen());
		in1.setDestino(in2.getDestino());
		Assert.assertEquals(in1.equals(in2), false);
		
		in1.setOrigen("CIUDAD");
		Assert.assertEquals(in1.equals(in2), false);
		
		in2 = new DataInUbiDTO("BOGOTA","SOACHA");
		Assert.assertEquals(in.equals(in2), true);
	}
	
	
	
}
