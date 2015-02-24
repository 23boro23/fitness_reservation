package cz.marek_b.fitness_reservation.bean;

public class GymClassBean {

    private long id;
    private String start;
    private int length;
    
    public GymClassBean() {}
    
    public GymClassBean(long id, String start, int length) {
        this.id = id;
        this.start = start;
        this.length = length;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
    
    
    
}
