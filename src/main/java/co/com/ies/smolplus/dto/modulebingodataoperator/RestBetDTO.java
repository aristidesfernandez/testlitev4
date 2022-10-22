package co.com.ies.smolplus.dto.modulebingodataoperator;

import java.io.Serializable;

import co.com.ies.smolplus.dto.moduleoperator.AccountOperatorDTO;

public class RestBetDTO implements Serializable {    
    
    public RestBetDTO() {
    }

    private String gameCode;
    private Integer quantityCartons;
    private AccountOperatorDTO account;

    public String getGameCode() {
        return gameCode;
    }
    public void setGameCode(String gameCode) {
        this.gameCode = gameCode;
    }
    public Integer getQuantityCartons() {
        return quantityCartons;
    }
    public void setQuantityCartons(Integer quantityCartons) {
        this.quantityCartons = quantityCartons;
    }

    public AccountOperatorDTO getAccount() {
        return account;
    }
    public void setAccount(AccountOperatorDTO account) {
        this.account = account;
    }

    public RestBetDTO(String gameCode, Integer quantityCartons, AccountOperatorDTO account) {
        this.gameCode = gameCode;
        this.quantityCartons = quantityCartons;
        this.account = account;
    }  

}
