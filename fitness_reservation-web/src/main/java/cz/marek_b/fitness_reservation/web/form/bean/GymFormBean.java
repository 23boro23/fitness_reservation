package cz.marek_b.fitness_reservation.web.form.bean;

import java.io.Serializable;

public class GymFormBean implements Serializable {

    private static final long serialVersionUID = 6356820077841276366L;

    private String name;
    private int capacity;

    public GymFormBean() {
    }

    public GymFormBean(String name, int capacity) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

}
