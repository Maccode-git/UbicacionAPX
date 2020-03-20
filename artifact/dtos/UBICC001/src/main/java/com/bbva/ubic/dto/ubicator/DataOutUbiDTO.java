package com.bbva.ubic.dto.ubicator;

import com.bbva.apx.dto.AbstractDTO;

public class DataOutUbiDTO extends AbstractDTO{

	/**
	 * 
	 */
	private static final long serialVersionUID = -8865131123026668279L;
	
	private String distancia;
	private float costo;
	private float valorKm;
	private String tiempoDemora;
	/**
	 * @return the valorKm
	 */
	public float getValorKm() {
		return valorKm;
	}

	/**
	 * @param valorKm the valorKm to set
	 */
	public void setValorKm(float valorKm) {
		this.valorKm = valorKm;
	}
	/**
	 * @return the distancia
	 */
	public String getDistancia() {
		return distancia;
	}
	
	/**
	 * @param distancia the distancia to set
	 */
	public void setDistancia(String distancia) {
		this.distancia = distancia;
	}
	/**
	 * @return the costo
	 */
	public float getCosto() {
		return costo;
	}
	/**
	 * @param costo the costo to set
	 */
	public void setCosto(float costo) {
		this.costo = costo;
	}
	/**
	 * @return the tiempoDemora
	 */
	public String getTiempoDemora() {
		return tiempoDemora;
	}
	/**
	 * @param tiempoDemora the tiempoDemora to set
	 */
	public void setTiempoDemora(String tiempoDemora) {
		this.tiempoDemora = tiempoDemora;
	}
	

	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "DataOutUbiDTO [distancia=" + distancia + ", costo=" + costo + ", valorKm=" + valorKm + ", tiempoDemora="+ tiempoDemora + "]";
	}

	
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Float.floatToIntBits(costo);
		result = prime * result + ((distancia == null) ? 0 : distancia.hashCode());
		result = prime * result + ((tiempoDemora == null) ? 0 : tiempoDemora.hashCode());
		result = prime * result + Float.floatToIntBits(valorKm);
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
		DataOutUbiDTO other = (DataOutUbiDTO) obj;
		if (Float.floatToIntBits(costo) != Float.floatToIntBits(other.costo))
			return false;
		if (distancia == null) {
			if (other.distancia != null)
				return false;
		} else if (!distancia.equals(other.distancia))
			return false;
		if (tiempoDemora == null) {
			if (other.tiempoDemora != null)
				return false;
		} else if (!tiempoDemora.equals(other.tiempoDemora))
			return false;
		if (Float.floatToIntBits(valorKm) != Float.floatToIntBits(other.valorKm))
			return false;
		return true;
	}

	
	
	/**
	 * @param distancia
	 * @param costo
	 * @param valorKm
	 * @param tiempoDemora
	 *  Constructor the class DataOutUbiDTO
	 */
	public DataOutUbiDTO(String distancia, float costo, float valorKm, String tiempoDemora) {
		super();
		this.distancia = distancia;
		this.costo = costo;
		this.valorKm = valorKm;
		this.tiempoDemora = tiempoDemora;
	}

	/**
	 * Constructor the class DataOutUbiDTO
	 */
	public DataOutUbiDTO(){}
	

}
