package co.com.ies.smolplus.context.orchestrator.modulebingodataoperator.infrastructure.primary;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.com.ies.smolplus.context.orchestrator.modulebingodataoperator.application.ManagerRequestBingoDataService;
import co.com.ies.smolplus.dto.modulebingodataoperator.RestBetDTO;


@RestController
@RequestMapping("/api/orchestrator/bingo")
public class OrchestratorBingoDataResource {

    private final Logger log = LoggerFactory.getLogger(OrchestratorBingoDataResource.class);

    private final ManagerRequestBingoDataService requestBingoDataService;

    public OrchestratorBingoDataResource(ManagerRequestBingoDataService requestBingoDataService) {
        this.requestBingoDataService = requestBingoDataService;
    }


    @PostMapping("/bet")
    public ResponseEntity<RestBetDTO> createDevice(@Valid @RequestBody RestBetDTO restBetDto) {
        log.debug("REST request to generate bet : {}", restBetDto);
        
        return ResponseEntity.ok(requestBingoDataService.generateBetBingo(restBetDto));
    }


}
