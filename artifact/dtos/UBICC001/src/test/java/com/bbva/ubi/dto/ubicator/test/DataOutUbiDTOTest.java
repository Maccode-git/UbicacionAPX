package com.bbva.ubi.dto.ubicator.test;

import static org.junit.Assert.assertArrayEquals;
import org.junit.Before;
import org.junit.Test;

import com.bbva.ubic.dto.ubicator.DataInUbiDTO;
import com.bbva.ubic.dto.ubicator.DataOutUbiDTO;

import junit.framework.Assert;

public class DataOutUbiDTOTest {

	DataOutUbiDTO out = new DataOutUbiDTO();
	
	/**
	 * Method for test the sentence Starting()  - ended - OK
	 */
	@Before
	public void starting(){
		out.setDistancia("10km");
		out.setCosto(10000);
		out.setTiempoDemora("30 min");
		out.setValorKm(1.5F);
	}
	
	/**
	 * Method for test the sentence toString() - ended - OK
	 */
	@Test
	public void testToString(){
		Assert.assertEquals(out.toString(), "DataOutUbiDTO [distancia=" + out.getDistancia() + ", costo=" + out.getCosto()+ ", valorKm=" + out.getValorKm()+ ", tiempoDemora=" + out.getTiempoDemora() + "]");
		Assert.assertFalse(out.toString().equals("toString"));
	}
	
	/**
	 * Method for test the sentence HashCode() - ended - OK
	 */
	@Test
	public void testHashCode(){
		Assert.assertEquals(out.hashCode(), out.hashCode());
		Assert.assertFalse(((Integer)out.hashCode()).equals(1));
		Assert.assertFalse(((Integer)(new DataOutUbiDTO()).hashCode()).equals(2));
	}
	
	/**
	 * Method for test the sentence Equals() - ended - OK
	 */
	@Test
	public void testEquals(){
		DataOutUbiDTO out1 = new DataOutUbiDTO();
		DataOutUbiDTO out2 = new DataOutUbiDTO();
		
		Assert.assertEquals(out1.equals(out2), true);
		Assert.assertEquals(out.equals(out), true);
		Assert.assertEquals(out.equals(null), false);
		Assert.assertEquals(out.equals(new Integer(1)), false);
		Assert.assertEquals(out1.equals(out), false);
		
		out2.setDistancia("20km");
		Assert.assertEquals(out1.equals(out2), false);
		out1.setDistancia("25km");
		Assert.assertEquals(out1.equals(out2), false);
		
		out2.setDistancia(out1.getDistancia());
		out2.setTiempoDemora("1 min");
		Assert.assertEquals(out1.equals(out2), false);
		
		out1.setTiempoDemora("2 min");
		Assert.assertEquals(out1.equals(out2), false);
		
		out2 = new DataOutUbiDTO("10km",10000,1.6F,"30 min");
		Assert.assertEquals(out.equals(out2), false);
		
	}
	
	
	
}
