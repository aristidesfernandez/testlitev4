package co.com.ies.smolplus.context.orchestrator.modulebingodataoperator.application.impl;

import org.springframework.stereotype.Service;

import co.com.ies.smolplus.context.orchestrator.modulebingodataoperator.application.InternalManagerBingoDataService;
import co.com.ies.smolplus.context.orchestrator.modulebingodataoperator.domain.registro.GetRegistro;
import co.com.ies.smolplus.dto.modulebingodataoperator.RegistroDTO;

@Service
public class InternalManagerBingoDataServiceImpl implements InternalManagerBingoDataService {

	private final GetRegistro getRegistro;

	public InternalManagerBingoDataServiceImpl() {
		this.getRegistro = new GetRegistro();
	}

	@Override
	public RegistroDTO getRegistroById(Long idRegistro) {
		return getRegistro.getRegistroById(idRegistro);
	}

}
