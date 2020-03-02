package com.mreboucas.blackdogdelivery.enviroment;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

/**
 * @author Marcelo Reboucas - marceloreboucas10@gmail.com - 30 de jan de 2020 as 16:18:53 
 */

@Component
@Profile("dev")
public class ProdEnviromentConfig implements EnviromentConfig {

	@Override
	public boolean isProducao() {
		return true;
	}

}
