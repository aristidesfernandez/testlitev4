package co.com.ies.smolplus.context.orchestrator.modulebingodataoperator.infrastructure.primary.dto;

import java.time.ZonedDateTime;
import java.util.Objects;

import javax.validation.constraints.NotNull;

public class RegistroDTO {

	private Long id;

	@NotNull
	private Long tablaIni;

	private Long tablaFin;

	@NotNull
	private ZonedDateTime creation;

	@NotNull
	private String idUserOperator;

	private Long sorteoId;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getTablaIni() {
		return tablaIni;
	}

	public void setTablaIni(Long tablaIni) {
		this.tablaIni = tablaIni;
	}

	public Long getTablaFin() {
		return tablaFin;
	}

	public void setTablaFin(Long tablaFin) {
		this.tablaFin = tablaFin;
	}

	public ZonedDateTime getCreation() {
		return creation;
	}

	public void setCreation(ZonedDateTime creation) {
		this.creation = creation;
	}

	public String getIdUserOperator() {
		return idUserOperator;
	}

	public void setIdUserOperator(String idUserOperator) {
		this.idUserOperator = idUserOperator;
	}

	public Long getSorteoId() {
		return sorteoId;
	}

	public void setSorteoId(Long sorteoId) {
		this.sorteoId = sorteoId;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (!(o instanceof RegistroDTO)) {
			return false;
		}

		RegistroDTO registroDTO = (RegistroDTO) o;
		if (this.id == null) {
			return false;
		}
		return Objects.equals(this.id, registroDTO.id);
	}

	@Override
	public int hashCode() {
		return Objects.hash(this.id);
	}

	// prettier-ignore
    @Override
    public String toString() {
        return "RegistroDTO{" +
            "id=" + getId() +
            ", tablaIni=" + getTablaIni() +
            ", tablaFin=" + getTablaFin() +
            ", creation='" + getCreation() + "'" +
            ", idUserOperator='" + getIdUserOperator() + "'" +
            ", sorteo=" + getSorteoId() +
            "}";
    }

}
