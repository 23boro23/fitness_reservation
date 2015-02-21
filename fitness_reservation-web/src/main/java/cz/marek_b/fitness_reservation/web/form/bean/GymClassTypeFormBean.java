package cz.marek_b.fitness_reservation.web.form.bean;

import java.io.Serializable;

public class GymClassTypeFormBean implements Serializable {

    private static final long serialVersionUID = 2549740410107314103L;

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
