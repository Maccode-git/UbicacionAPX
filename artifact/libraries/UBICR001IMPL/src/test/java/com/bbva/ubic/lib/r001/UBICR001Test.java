package com.bbva.ubic.lib.r001;

import javax.annotation.Resource;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.aop.framework.Advised;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.bbva.ubic.dto.ubicator.DataOutUbiDTO;

import junit.framework.Assert;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"classpath:/META-INF/spring/UBICR001-app.xml",
		"classpath:/META-INF/spring/UBICR001-app-test.xml",
		"classpath:/META-INF/spring/UBICR001-arc.xml",
		"classpath:/META-INF/spring/UBICR001-arc-test.xml" })
public class UBICR001Test {

	private static final Logger LOGGER = LoggerFactory
			.getLogger(UBICR001.class);
	
	@Resource(name = "ubicR001")
	private UBICR001 ubicR001;
	
	@Before
	public void setUp() throws Exception {		
		getObjectIntrospection();
	}
	
	private Object getObjectIntrospection() throws Exception{
		Object result = this.ubicR001;
		if(this.ubicR001 instanceof Advised){
			Advised advised = (Advised) this.ubicR001;
			result = advised.getTargetSource().getTarget();
		}
		return result;
	}
	
	/**
	 * Method executeTest DataOutUbiDTO
	 */
	@Test
	public void executeTest(){
		LOGGER.info("Executing the test...");
		DataOutUbiDTO out = new DataOutUbiDTO();
		out = ubicR001.execute("BOGOTA","SOACHA");
		Assert.assertEquals(out.toString(), "DataOutUbiDTO [distancia=" + out.getDistancia() + ", costo=" + out.getCosto()+ ", valorKm=" + out.getValorKm()+ ", tiempoDemora=" + out.getTiempoDemora() + "]");
		Assert.assertNull(ubicR001.execute("1","SOACHA"));
	}
	
	
	
}
