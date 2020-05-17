package fr.utbm.tp.lo54.formations.core.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Session implements Serializable {
    @Id
    @GeneratedValue
    private int id_session;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "courseId")
    private Course course;
    
    private Date start_date;
    private Date end_date;
    private int nbre_place;
    @ManyToOne
    @JoinColumn(name = "CODE_LOCATION")
    @Column(unique = true)
    private Location location;

    @OneToMany(mappedBy = "session")
    private List<Inscrire> clients;

    public Session() {
    }

    
    public Session(Date start_date, Date end_date, int nbre_place, Location location) {
        this.start_date = start_date;
        this.end_date = end_date;
        this.nbre_place = nbre_place;
        this.location = location;
    }

    public int getId_session() {
        return id_session;
    }

    public void setId_session(int id_session) {
        this.id_session = id_session;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public Date getStart_date() {
        return start_date;
    }

    public void setStart_date(Date start_date) {
        this.start_date = start_date;
    }

    public Date getEnd_date() {
        return end_date;
    }

    public void setEnd_date(Date end_date) {
        this.end_date = end_date;
    }

    public int getNbre_place() {
        return nbre_place;
    }

    public void setNbre_place(int nbre_place) {
        this.nbre_place = nbre_place;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public List<Inscrire> getClients() {
        return clients;
    }

    public void setClients(List<Inscrire> clients) {
        this.clients = clients;
    }

    @Override
    public String toString() {
        return "Session{" + "id_session=" + id_session + ", course=" + course + ", start_date=" + start_date + ", end_date=" + end_date + ", nbre_place=" + nbre_place + ", location=" + location + ", clients=" + clients + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + this.id_session;
        hash = 37 * hash + Objects.hashCode(this.course);
        hash = 37 * hash + Objects.hashCode(this.start_date);
        hash = 37 * hash + Objects.hashCode(this.end_date);
        hash = 37 * hash + this.nbre_place;
        hash = 37 * hash + Objects.hashCode(this.location);
        hash = 37 * hash + Objects.hashCode(this.clients);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Session other = (Session) obj;
        if (this.id_session != other.id_session) {
            return false;
        }
        if (this.nbre_place != other.nbre_place) {
            return false;
        }
        if (!Objects.equals(this.course, other.course)) {
            return false;
        }
        if (!Objects.equals(this.start_date, other.start_date)) {
            return false;
        }
        if (!Objects.equals(this.end_date, other.end_date)) {
            return false;
        }
        if (!Objects.equals(this.location, other.location)) {
            return false;
        }
        if (!Objects.equals(this.clients, other.clients)) {
            return false;
        }
        return true;
    }
    
    
    
    
    

}
