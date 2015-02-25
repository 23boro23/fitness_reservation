package cz.marek_b.fitness_reservation.web.form.bean;

import java.io.Serializable;
import java.util.Objects;
import javax.validation.constraints.NotNull;

public class GymClassFormBean implements Serializable {

    private static final long serialVersionUID = 7264210451858729175L;

    @NotNull
    private String start;
    @NotNull
    private String end;
    private long trainer;
    private long gym;
    private long classType;

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public long getTrainer() {
        return trainer;
    }

    public void setTrainer(long trainer) {
        this.trainer = trainer;
    }

    public long getGym() {
        return gym;
    }

    public void setGym(long gym) {
        this.gym = gym;
    }

    public long getClassType() {
        return classType;
    }

    public void setClassType(long classType) {
        this.classType = classType;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 41 * hash + Objects.hashCode(this.start);
        hash = 41 * hash + Objects.hashCode(this.end);
        hash = 41 * hash + (int) (this.trainer ^ (this.trainer >>> 32));
        hash = 41 * hash + (int) (this.gym ^ (this.gym >>> 32));
        hash = 41 * hash + (int) (this.classType ^ (this.classType >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final GymClassFormBean other = (GymClassFormBean) obj;
        if (!Objects.equals(this.start, other.start)) {
            return false;
        }
        if (!Objects.equals(this.end, other.end)) {
            return false;
        }
        if (this.trainer != other.trainer) {
            return false;
        }
        if (this.gym != other.gym) {
            return false;
        }
        if (this.classType != other.classType) {
            return false;
        }
        return true;
    }

    

}
