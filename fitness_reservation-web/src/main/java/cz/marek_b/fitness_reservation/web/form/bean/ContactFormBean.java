package cz.marek_b.fitness_reservation.web.form.bean;

import java.io.Serializable;

public class ContactFormBean implements Serializable {
    
    private static final long serialVersionUID = 948442049203583372L;

    private String email;
    private String phoneNo;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

}
