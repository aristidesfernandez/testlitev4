package co.com.ies.smolplus.context.device.domain;

import java.io.Serializable;
import java.util.UUID;

public class Device implements Serializable {

    private static final long serialVersionUID = 1L;

    public Device(UUID id, String serial) {
        this.id = id;
        this.serial = serial;
    }

    public Device() {
    	super();
    }

    private UUID id;

    private String serial;

    public UUID getId() {
        return this.id;
    }

    public Device id(UUID id) {
        this.setId(id);
        return this;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getSerial() {
        return this.serial;
    }

    public Device serial(String serial) {
        this.setSerial(serial);
        return this;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Device)) {
            return false;
        }
        return id != null && id.equals(((Device) o).id);
    }

    @Override
    public int hashCode() {
        // see https://vladmihalcea.com/how-to-implement-equals-and-hashcode-using-the-jpa-entity-identifier/
        return getClass().hashCode();
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "Device{" +
            "id=" + getId() +
            ", serial='" + getSerial() + "'" +
            "}";
    }
}
