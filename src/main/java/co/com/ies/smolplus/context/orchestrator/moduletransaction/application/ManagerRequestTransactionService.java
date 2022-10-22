package co.com.ies.smolplus.context.orchestrator.moduletransaction.application;

import co.com.ies.smolplus.dto.modulebingodataoperator.RegistroDTO;
import co.com.ies.smolplus.dto.moduletransaction.EventLogDTO;

public interface ManagerRequestTransactionService {
	
	RegistroDTO getRegistroByEventLog(EventLogDTO eventLog);

}
