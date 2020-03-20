package com.bbva.ubic.dto.ubicator;

import com.bbva.apx.dto.AbstractDTO;

public class DataInUbiDTO extends AbstractDTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = -479833926816481487L;
	
	private String origen;
	private String destino;
	
	/**
	 * @return
	 * Method Get to Origen
	 * Return String
	 */
	public String getOrigen() {
		return origen;
	}
	
	/**
	 * @param origen
	 * Method Set to Origen
	 */
	public void setOrigen(String origen) {
		this.origen = origen;
	}
	
	
	/**
	 * @return
	 * Method Get to Destino
	 * Return String
	 */
	public String getDestino() {
		return destino;
	}
	
	/**
	 * @param destino
	 * Method Set to Destino
	 */
	public void setDestino(String destino) {
		this.destino = destino;
	}
	
	
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((destino == null) ? 0 : destino.hashCode());
		result = prime * result + ((origen == null) ? 0 : origen.hashCode());
		return result;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DataInUbiDTO other = (DataInUbiDTO) obj;
		if (destino == null) {
			if (other.destino != null)
				return false;
		} else if (!destino.equals(other.destino))
			return false;
		if (origen == null) {
			if (other.origen != null)
				return false;
		} else if (!origen.equals(other.origen))
			return false;
		return true;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "DataInUbiDTO [origen=" + origen + ", destino=" + destino + "]";
	}
	
	
	/**
	 * @param origen
	 * @param destino
	 * Constructor the class DataInUbiDTO
	 */
	public DataInUbiDTO(String origen, String destino) {
		super();
		this.origen = origen;
		this.destino = destino;
	}
	
	/**
	 * Constructor the class DataInUbiDTO
	 */
	public DataInUbiDTO(){}

}
