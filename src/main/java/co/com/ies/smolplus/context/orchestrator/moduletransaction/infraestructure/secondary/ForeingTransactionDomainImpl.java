package co.com.ies.smolplus.context.orchestrator.moduletransaction.infraestructure.secondary;

import org.springframework.stereotype.Service;

import co.com.ies.smolplus.context.orchestrator.modulebingodataoperator.application.InternalManagerBingoDataService;
import co.com.ies.smolplus.context.orchestrator.moduletransaction.domain.ForeingTransactionDomain;
import co.com.ies.smolplus.dto.modulebingodataoperator.RegistroDTO;
import co.com.ies.smolplus.dto.moduletransaction.EventLogDTO;

@Service
public class ForeingTransactionDomainImpl implements ForeingTransactionDomain {

	private final InternalManagerBingoDataService internalManagerBingoDataService;

	public ForeingTransactionDomainImpl(InternalManagerBingoDataService internalManagerBingoDataService) {
		this.internalManagerBingoDataService = internalManagerBingoDataService;
	}

	@Override
	public RegistroDTO getRegistroByEventLogId(EventLogDTO eventLog) {
		return internalManagerBingoDataService.getRegistroById(eventLog.getId());
	}

}
