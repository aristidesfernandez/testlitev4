package co.com.ies.smolplus.context.orchestrator.modulebingodataoperator.application;

import co.com.ies.smolplus.dto.modulebingodataoperator.RegistroDTO;

public interface InternalManagerBingoDataService {
	
	public RegistroDTO getRegistroById(Long idRegistro);
    
}
