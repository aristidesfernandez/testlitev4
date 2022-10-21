package co.com.ies.smolplus.context.orchestrator.moduletransaction.infraestructure.primary.dto;

import java.util.Objects;

import javax.validation.constraints.NotNull;

public class EventLogDTO {
	
	    private Long id;

	    @NotNull
	    private String app;

	    public Long getId() {
	        return id;
	    }

	    public void setId(Long id) {
	        this.id = id;
	    }

	    public String getApp() {
	        return app;
	    }

	    public void setApp(String app) {
	        this.app = app;
	    }

	    @Override
	    public boolean equals(Object o) {
	        if (this == o) {
	            return true;
	        }
	        if (!(o instanceof EventLogDTO)) {
	            return false;
	        }

	        EventLogDTO eventLogDTO = (EventLogDTO) o;
	        if (this.id == null) {
	            return false;
	        }
	        return Objects.equals(this.id, eventLogDTO.id);
	    }

	    @Override
	    public int hashCode() {
	        return Objects.hash(this.id);
	    }

	    // prettier-ignore
	    @Override
	    public String toString() {
	        return "EventLogDTO{" +
	            "id=" + getId() +
	            ", app='" + getApp() + "'" +
	            "}";
	    }

}
