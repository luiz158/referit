package org.cejug.referit.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 *
 * @author Hildeberto Mendonca
 */
@Entity
public class Link implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    @JoinColumn(name="classification")
    private Classification classification;
    
    @ManyToOne
    @JoinColumn(name="target")
    private Terminology target;
    
    @ManyToOne
    @JoinColumn(name="source")
    private Terminology source;
    
    private Boolean valid;
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Classification getClassification() {
        return classification;
    }

    public void setClassification(Classification classification) {
        this.classification = classification;
    }

    public Terminology getTarget() {
        return target;
    }

    public void setTarget(Terminology target) {
        this.target = target;
    }

    public Terminology getSource() {
        return source;
    }

    public void setSource(Terminology source) {
        this.source = source;
    }

    public Boolean getValid() {
        return valid;
    }

    public void setValid(Boolean valid) {
        this.valid = valid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Link)) {
            return false;
        }
        Link other = (Link) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "be.uclouvain.referit.entity.Link[ id=" + id + " ]";
    }
    
}
