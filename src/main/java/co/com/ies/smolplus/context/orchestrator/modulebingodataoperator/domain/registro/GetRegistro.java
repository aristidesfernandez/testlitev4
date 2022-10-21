package co.com.ies.smolplus.context.orchestrator.modulebingodataoperator.domain.registro;

import java.time.ZonedDateTime;

import co.com.ies.smolplus.context.orchestrator.modulebingodataoperator.infrastructure.primary.dto.RegistroDTO;

public class GetRegistro {

	public GetRegistro() {
		super();
	}

	public RegistroDTO getRegistroById(Long idRegistro) {
		final RegistroDTO registroFull = new RegistroDTO();
		final long id = idRegistro == null ? 1234L : idRegistro;
		
		registroFull.setCreation(ZonedDateTime.now());
		registroFull.setId(id);
		registroFull.setTablaIni(1L);
		registroFull.setTablaFin(2L);
		return registroFull;
	}

}
