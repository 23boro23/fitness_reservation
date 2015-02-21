package cz.marek_b.fitness_reservation.core.data;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "gym_class")
@NamedQuery(name = "GymClass.findAll", query = "SELECT gc FROM GymClass gc WHERE gc.start >= ?1 AND gc.start < ?2 ORDER BY gc.start")
public class GymClass implements Serializable {

    private static final long serialVersionUID = 8099128636408415676L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "start")
    private Date start;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "end")
    private Date end;
    @ManyToOne
    @JoinColumn(name = "trainer_id")
    private Trainer trainer;
    @ManyToOne
    private GymClassType classType;
    @ManyToOne
    private Gym gym;
    private int capacity;
    
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getStart() {
        return start;
    }

    public void setStart(Date start) {
        this.start = start;
    }

    public Date getEnd() {
        return end;
    }

    public void setEnd(Date end) {
        this.end = end;
    }

    public Trainer getTrainer() {
        return trainer;
    }

    public void setTrainer(Trainer trainer) {
        this.trainer = trainer;
    }

    public GymClassType getClassType() {
        return classType;
    }

    public void setClassType(GymClassType classType) {
        this.classType = classType;
    }

    public Gym getGym() {
        return gym;
    }

    public void setGym(Gym gym) {
        this.gym = gym;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

}
