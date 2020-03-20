package com.bbva.ubic;

import com.bbva.ubic.dto.ubicator.DataInUbiDTO;
import com.bbva.ubic.dto.ubicator.DataOutUbiDTO;

import com.bbva.elara.transaction.AbstractTransaction;

public abstract class AbstractUBICT00201COTransaction extends AbstractTransaction {

	public AbstractUBICT00201COTransaction(){
	}
	
	/**
	 * Return value for input parameter dataInUbiDTO
	 */
	protected DataInUbiDTO getDatainubidto(){
		return (DataInUbiDTO)getParameter("dataInUbiDTO");
	}
	
	/**
	 * Set value for output parameter dataInUbiDTO
	 */
	protected void setDatainubidto(final DataInUbiDTO field){
		this.addParameter("dataInUbiDTO", field);
	}
	
	

	/**
	 * Return value for input parameter dataOutUbiDTO
	 */
	protected DataOutUbiDTO getDataoutubidto(){
		return (DataOutUbiDTO)getParameter("dataOutUbiDTO");
	}
	/**
	 * Set value for output parameter dataOutUbiDTO
	 */
	protected void setDataoutubidto(final DataOutUbiDTO field){
		this.addParameter("dataOutUbiDTO", field);
	}			
	
}
