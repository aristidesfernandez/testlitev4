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
public class DeviceEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    public DeviceEntity(UUID id, @NotNull String serial) {
        this.id = id;
        this.serial = serial;
    }

    public DeviceEntity() {
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

    public DeviceEntity id(UUID id) {
        this.setId(id);
        return this;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getSerial() {
        return this.serial;
    }

    public DeviceEntity serial(String serial) {
        this.setSerial(serial);
        return this;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    public static DeviceEntity from(Device device) {
        Assert.notNull("device", device);
    
        return new DeviceEntity().id(device.getId()).serial(device.getSerial());
      }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DeviceEntity)) {
            return false;
        }
        return id != null && id.equals(((DeviceEntity) o).id);
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
