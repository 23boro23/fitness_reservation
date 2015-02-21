package cz.marek_b.fitness_reservation.core.data;

public enum Role {

    ADMINISTRATOR(999, "administrator"),
    TRAINER(3, "trainer"),
    CUSTOMER(1, "customer"),
    SERVICE_DESK(2, "service desk");

    private final int id;
    private final String name;

    private Role(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

}
