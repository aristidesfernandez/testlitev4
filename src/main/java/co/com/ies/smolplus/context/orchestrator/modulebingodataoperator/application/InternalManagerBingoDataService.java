package co.com.ies.smolplus.context.orchestrator.modulebingodataoperator.application;

import co.com.ies.smolplus.context.orchestrator.modulebingodataoperator.infrastructure.primary.dto.RegistroDTO;

public interface InternalManagerBingoDataService {
	
	public RegistroDTO getRegistroById(Long idRegistro);
    
}
