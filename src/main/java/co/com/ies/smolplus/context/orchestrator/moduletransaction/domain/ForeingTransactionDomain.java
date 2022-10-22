package co.com.ies.smolplus.context.orchestrator.moduletransaction.domain;

import co.com.ies.smolplus.dto.modulebingodataoperator.RegistroDTO;
import co.com.ies.smolplus.dto.moduletransaction.EventLogDTO;

public interface ForeingTransactionDomain {

	RegistroDTO getRegistroByEventLogId(EventLogDTO eventLog);

}
