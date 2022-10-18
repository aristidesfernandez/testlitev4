package co.com.ies.smolplus.context.device.infrastructure.secondary;

import java.io.Serializable;
import java.util.UUID;

import javax.persistence.*;
import javax.validation.constraints.*;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import co.com.ies.smolplus.context.device.domain.Device;
import co.com.ies.smolplus.error.domain.Assert;


@Entity
@Table(name = "device")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@SuppressWarnings("common-java:DuplicatedBlocks")
public class DeviceEnity implements Serializable {

    private static final long serialVersionUID = 1L;

    public DeviceEnity(UUID id, @NotNull String serial) {
        this.id = id;
        this.serial = serial;
    }

    public DeviceEnity() {
    }

    @Id
    @Column(name = "id")
    private UUID id;

    @NotNull
    @Column(name = "serial", nullable = false)
    private String serial;

    // jhipster-needle-entity-add-field - JHipster will add fields here

    public UUID getId() {
        return this.id;
    }

    public DeviceEnity id(UUID id) {
        this.setId(id);
        return this;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getSerial() {
        return this.serial;
    }

    public DeviceEnity serial(String serial) {
        this.setSerial(serial);
        return this;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    public static DeviceEnity from(Device device) {
        Assert.notNull("device", device);
    
        return new DeviceEnity().id(device.getId()).serial(device.getSerial());
      }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DeviceEnity)) {
            return false;
        }
        return id != null && id.equals(((DeviceEnity) o).id);
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
