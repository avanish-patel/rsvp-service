package ai.karma.rsvpservice.domain;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Table(name = "rsvp")
@Entity
public class RSVP {

    @Id
    @NotNull
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;
    private String name;
    private int number;
    private boolean iscoming;

    public RSVP() {
    }

    public RSVP(@NotNull long id, String name, int number, boolean iscoming) {
        this.id = id;
        this.name = name;
        this.number = number;
        this.iscoming = iscoming;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public boolean isIscoming() {
        return iscoming;
    }

    public void setIscoming(boolean iscoming) {
        this.iscoming = iscoming;
    }
}
