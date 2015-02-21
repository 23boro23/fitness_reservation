package cz.marek_b.fitness_reservation.core.data;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "gym_class_type")
@NamedQuery(name = "GymClassType.findAll", query = "SELECT gt FROM GymClassType gt ORDER BY gt.className")
public class GymClassType implements Serializable {
    
    private static final long serialVersionUID = 6247817588925566787L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;
    @Column(name = "class_name")
    private String className;
    @Column(name = "class_color", length = 7)
    private String classColor;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getClassColor() {
        return classColor;
    }

    public void setClassColor(String classColor) {
        this.classColor = classColor;
    }

}
