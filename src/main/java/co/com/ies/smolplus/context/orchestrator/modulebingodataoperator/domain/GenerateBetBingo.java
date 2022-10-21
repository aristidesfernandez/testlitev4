package co.com.ies.smolplus.context.orchestrator.modulebingodataoperator.domain;

import co.com.ies.smolplus.context.orchestrator.modulebingodataoperator.infrastructure.primary.dto.RestBetDTO;

public class GenerateBetBingo {


    private final ForeingBingoDataDomain foreingBingoDataDomain;

    public GenerateBetBingo(ForeingBingoDataDomain foreingBingoDataDomain){ 
        this.foreingBingoDataDomain = foreingBingoDataDomain;
    }

    // FIXME o ASK : como se haría en estos para que el dominiono conoscan dto
    public void bet(RestBetDTO requestBet){
        if(foreingBingoDataDomain.validateOperartor(requestBet.getAccount())){
            System.out.println("Operador validado correctamente");
        }else{
            System.out.println("Operador Invalidado");
        }
    }   

    
}
