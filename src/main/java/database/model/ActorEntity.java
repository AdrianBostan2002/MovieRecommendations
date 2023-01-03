package database.model;

import javax.persistence.*;

@Entity
@Table(name = "actor", schema = "public", catalog = "proiect_mip")
public class ActorEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "actor_id", nullable = false)
    private long actorId;
    @Basic
    @Column(name = "surname", nullable = false, length = 50)
    private String surname;
    @Basic
    @Column(name = "forename", nullable = false, length = 50)
    private String forename;

    public long getActorId() {
        return actorId;
    }

    public void setActorId(long actorId) {
        this.actorId = actorId;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getForename() {
        return forename;
    }

    public void setForename(String forename) {
        this.forename = forename;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ActorEntity that = (ActorEntity) o;

        if (actorId != that.actorId) return false;
        if (surname != null ? !surname.equals(that.surname) : that.surname != null) return false;
        if (forename != null ? !forename.equals(that.forename) : that.forename != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (actorId ^ (actorId >>> 32));
        result = 31 * result + (surname != null ? surname.hashCode() : 0);
        result = 31 * result + (forename != null ? forename.hashCode() : 0);
        return result;
    }
}
