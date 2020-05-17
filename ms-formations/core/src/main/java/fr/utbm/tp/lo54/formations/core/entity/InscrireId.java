package fr.utbm.tp.lo54.formations.core.entity;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class InscrireId implements Serializable {

    @Column(name = "clientid")
    private Client clientId;

    @Column(name = "sessionid")
    private Session sessionId;

    public InscrireId() {
    }

    public InscrireId(Client clientId, Session sessionId) {
        this.clientId = clientId;
        this.sessionId = sessionId;
    }

    public Client getClientId() {
        return clientId;
    }

    public void setClientId(Client clientId) {
        this.clientId = clientId;
    }

    public Session getSessionId() {
        return sessionId;
    }

    public void setSessionId(Session sessionId) {
        this.sessionId = sessionId;
    }

    @Override
    public String toString() {
        return "InscrireId{" + "clientId=" + clientId + ", sessionId=" + sessionId + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 47 * hash + Objects.hashCode(this.clientId);
        hash = 47 * hash + Objects.hashCode(this.sessionId);
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
        final InscrireId other = (InscrireId) obj;
        if (!Objects.equals(this.clientId, other.clientId)) {
            return false;
        }
        if (!Objects.equals(this.sessionId, other.sessionId)) {
            return false;
        }
        return true;
    }

}
