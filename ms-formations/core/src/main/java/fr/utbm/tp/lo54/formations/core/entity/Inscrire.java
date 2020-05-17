package fr.utbm.tp.lo54.formations.core.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;

@Entity
public class Inscrire implements Serializable {

    @EmbeddedId
    private InscrireId id;

    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("clientId")
    @JoinColumn(name = "clientId")
    private Client client;

    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("sessionId")
    @JoinColumn(name = "sessionId")
    private Session session;

    private Date date_inscription;

    public Inscrire() {
    }

    public Inscrire(InscrireId id, Client client, Session session, Date date_inscription) {
        this.id = id;
        this.client = client;
        this.session = session;
        this.date_inscription = date_inscription;
    }

    public InscrireId getId() {
        return id;
    }

    public void setId(InscrireId id) {
        this.id = id;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Session getSession() {
        return session;
    }

    public void setSession(Session session) {
        this.session = session;
    }

    public Date getDate_inscription() {
        return date_inscription;
    }

    public void setDate_inscription(Date date_inscription) {
        this.date_inscription = date_inscription;
    }

    @Override
    public String toString() {
        return "Inscrire{" + "id=" + id + ", client=" + client + ", session=" + session + ", date_inscription=" + date_inscription + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + Objects.hashCode(this.id);
        hash = 89 * hash + Objects.hashCode(this.client);
        hash = 89 * hash + Objects.hashCode(this.session);
        hash = 89 * hash + Objects.hashCode(this.date_inscription);
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
        final Inscrire other = (Inscrire) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.client, other.client)) {
            return false;
        }
        if (!Objects.equals(this.session, other.session)) {
            return false;
        }
        if (!Objects.equals(this.date_inscription, other.date_inscription)) {
            return false;
        }
        return true;
    }

}
