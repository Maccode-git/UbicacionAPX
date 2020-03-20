package com.bbva.ubic.lib.r001.impl;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.client.RestTemplate;

import com.bbva.ubic.dto.ubicator.DataOutUbiDTO;
import com.bbva.ubic.lib.r001.UBICR001;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.JsonNode;

public class UBICR001Impl extends UBICR001Abstract {

	private static final Logger LOGGER = LoggerFactory.getLogger(UBICR001.class);

	/* (non-Javadoc)
	 * @see com.bbva.ubic.lib.r001.UBICR001#execute(java.lang.String, java.lang.String)
	 */
	@Override
	public DataOutUbiDTO execute(String origen, String destino) {
		DataOutUbiDTO out = new DataOutUbiDTO();
		LOGGER.info("Starting execute");
		try {
			RestTemplate restTemplate = new RestTemplate();
			String json = restTemplate.getForObject("https://maps.googleapis.com/maps/api/directions/json?origin=" + origen + "&destination=" + destino + "&key=AIzaSyByPeqwGB3sb1BXGhEkzfzmnOodqugTM6Q", String.class);
			
			ObjectMapper objectMapper = new ObjectMapper();
			JsonNode jsonTotal = objectMapper.readValue(json, JsonNode.class);
			
			JsonNode jsonInfo = jsonTotal.get("routes").get(0).get("legs").get(0);
			out.setDistancia(jsonInfo.get("distance").get("text").toString());
			out.setTiempoDemora(jsonInfo.get("duration").get("text").toString());
			out.setValorKm(1.5F);
			out.setCosto((jsonInfo.get("distance").get("value").asInt()/1000)*out.getValorKm());
			
		} catch (Exception e) {
			return null;
		}
		LOGGER.info("Finaly execute");
		return out;
	}
}
