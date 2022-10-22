package co.com.ies.smolplus.context.orchestrator.moduletransaction.application.impl;

import org.springframework.stereotype.Service;

import co.com.ies.smolplus.context.orchestrator.moduletransaction.application.InternalManagerTransaction;
import co.com.ies.smolplus.context.orchestrator.moduletransaction.application.ManagerRequestTransactionService;
import co.com.ies.smolplus.context.orchestrator.moduletransaction.domain.ForeingTransactionDomain;
import co.com.ies.smolplus.dto.modulebingodataoperator.RegistroDTO;
import co.com.ies.smolplus.dto.moduletransaction.EventLogDTO;

@Service
public class ManagerRequestTransactionServiceImpl implements ManagerRequestTransactionService {

	private final InternalManagerTransaction internalManagerTransactionImpl;
	private final ForeingTransactionDomain foreingTransactionDomain;

	public ManagerRequestTransactionServiceImpl(InternalManagerTransaction internalManagerTransactionImpl,
			ForeingTransactionDomain foreingTransactionDomain) {
		this.internalManagerTransactionImpl = internalManagerTransactionImpl;
		this.foreingTransactionDomain = foreingTransactionDomain;
	}

	@Override
	public RegistroDTO getRegistroByEventLog(EventLogDTO eventLog) {
		return foreingTransactionDomain.getRegistroByEventLogId(eventLog);
	}

}
