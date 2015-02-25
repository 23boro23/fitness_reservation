package cz.marek_b.fitness_reservation.web.form.bean;

import java.io.Serializable;

public class ClassTypeFormBean implements Serializable {
    
    private static final long serialVersionUID = -8876415172157985290L;
    
    private String color;
    private String name;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}
