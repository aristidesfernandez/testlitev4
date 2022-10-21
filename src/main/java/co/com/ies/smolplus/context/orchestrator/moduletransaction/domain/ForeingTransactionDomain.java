package co.com.ies.smolplus.context.orchestrator.moduletransaction.domain;

import co.com.ies.smolplus.context.orchestrator.modulebingodataoperator.infrastructure.primary.dto.RegistroDTO;
import co.com.ies.smolplus.context.orchestrator.moduletransaction.infraestructure.primary.dto.EventLogDTO;

public interface ForeingTransactionDomain {

	RegistroDTO getRegistroByEventLogId(EventLogDTO eventLog);

}
