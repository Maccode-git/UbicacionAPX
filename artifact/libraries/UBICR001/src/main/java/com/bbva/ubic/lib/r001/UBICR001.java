package com.bbva.ubic.lib.r001;

import com.bbva.ubic.dto.ubicator.DataOutUbiDTO;

public interface UBICR001 {

	/**
	 * @param origen
	 * @param destino
	 * @return
	 * Method execute interface
	 */
	DataOutUbiDTO execute(String origen, String destino);

}
