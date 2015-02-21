package cz.marek_b.fitness_reservation.web.form.bean;

import java.io.Serializable;

public class SettingsFormBean implements Serializable {

    private static final long serialVersionUID = -7604341620506429116L;

    private String start;
    private String end;

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

}
