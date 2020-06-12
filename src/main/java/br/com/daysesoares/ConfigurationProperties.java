package br.com.daysesoares;

import org.springframework.stereotype.Component;

@org.springframework.boot.context.properties.ConfigurationProperties(prefix = "daysesoares.rabbitmq.configuration")
@Component
public class ConfigurationProperties {

	private String leiturafila;

	public String getLeiturafila() {
		return leiturafila;
	}

	public void setLeiturafila(String leiturafila) {
		this.leiturafila = leiturafila;
	}
	
	
	
}
