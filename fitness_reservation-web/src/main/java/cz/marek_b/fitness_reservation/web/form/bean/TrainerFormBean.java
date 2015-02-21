package cz.marek_b.fitness_reservation.web.form.bean;

public class TrainerFormBean {

    private String fullName;
    private ContactFormBean contactFormBean;
    
    public TrainerFormBean() {
        contactFormBean = new ContactFormBean();
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public ContactFormBean getContactFormBean() {
        return contactFormBean;
    }

    public void setContactFormBean(ContactFormBean contactFormBean) {
        this.contactFormBean = contactFormBean;
    }

}
