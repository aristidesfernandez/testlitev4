package co.com.ies.smolplus.context.orchestrator.moduletransaction.application;

import co.com.ies.smolplus.context.orchestrator.modulebingodataoperator.infrastructure.primary.dto.RegistroDTO;
import co.com.ies.smolplus.context.orchestrator.moduletransaction.infraestructure.primary.dto.EventLogDTO;

public interface ManagerRequestTransactionService {
	
	RegistroDTO getRegistroByEventLog(EventLogDTO eventLog);

}
