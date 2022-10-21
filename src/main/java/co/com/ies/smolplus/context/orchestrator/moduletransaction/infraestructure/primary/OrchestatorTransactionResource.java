package co.com.ies.smolplus.context.orchestrator.moduletransaction.infraestructure.primary;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.com.ies.smolplus.context.orchestrator.modulebingodataoperator.infrastructure.primary.dto.RegistroDTO;
import co.com.ies.smolplus.context.orchestrator.moduletransaction.application.ManagerRequestTransactionService;
import co.com.ies.smolplus.context.orchestrator.moduletransaction.infraestructure.primary.dto.EventLogDTO;

@RestController
@RequestMapping("/api/orchestrator/transaction")
public class OrchestatorTransactionResource {

	private static final Logger log = LoggerFactory.getLogger(OrchestatorTransactionResource.class);

	private final ManagerRequestTransactionService managerRequestTransactionService;

	public OrchestatorTransactionResource(ManagerRequestTransactionService managerRequestTransactionService) {
		this.managerRequestTransactionService = managerRequestTransactionService;
	}

	@PostMapping("/registro")
	public ResponseEntity<RegistroDTO> getRegistroByTransaction(@RequestBody EventLogDTO eventLog) {
		log.info("REST request to get registro by eventLog : {}", eventLog);

		return ResponseEntity.ok(managerRequestTransactionService.getRegistroByEventLog(eventLog));
	}

}
