package com.bbva.ubic;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.bbva.elara.domain.transaction.Severity;
import com.bbva.elara.domain.transaction.response.HttpResponseCode;
import com.bbva.ubic.dto.ubicator.DataInUbiDTO;
import com.bbva.ubic.dto.ubicator.DataOutUbiDTO;
import com.bbva.ubic.lib.r001.impl.UBICR001Abstract;
import com.bbva.ubic.lib.r001.impl.UBICR001Impl;
import com.bbva.ubic.lib.r001.UBICR001;

/**
 * Transaccion
 * Implementacion de logica de negocio.
 * @author formacion
 *
 */
public class UBICT00201COTransaction extends AbstractUBICT00201COTransaction {

	private static Logger LOGGER = LoggerFactory.getLogger(UBICT00201COTransaction.class);
	@Override
	public void execute(){
		// TODO
		try {
			//UBICR001Abstract ubi = new UBICR001Impl();
			LOGGER.debug("Start search");
			//UBICR001Abstract ubicR001 = new UBICR001Impl();
			UBICR001 ubicR001 = (UBICR001)getServiceLibrary(UBICR001.class);
			DataInUbiDTO in = this.getDatainubidto();
			DataOutUbiDTO out = ubicR001.execute(in.getOrigen(), in.getDestino());
			LOGGER.debug("Successful search");
			setContentLocation(getURIPath());
			setHttpResponseCode(HttpResponseCode.HTTP_CODE_200, Severity.OK);
			this.setDataoutubidto(out);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}


}
