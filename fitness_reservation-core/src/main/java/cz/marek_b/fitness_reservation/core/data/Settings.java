package cz.marek_b.fitness_reservation.core.data;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "settings")
@NamedQueries({
    @NamedQuery(name = "Settings.findByKey", query = "SELECT s FROM Settings s WHERE s.key = ?1"),
    @NamedQuery(name = "Settings.findAll", query = "SELECT s FROM Settings s")
})
public class Settings implements Serializable {

    private static final long serialVersionUID = -8381110107566505025L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;
    @Column(name = "key", nullable = false, length = 40)
    private String key;
    @Column(name = "value", nullable = false, length = 100)
    private String value;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

}
