package com.mycompany.ostrogothia.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author bogdasya
 */
@Entity
@Table(name = "Documents ")
public class Documents implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = " idDocuments ")
    private Integer idDocument;
    @Column(name = "  Type_File  ")
    private String type;
    @Column(name = "  Path_File  ")
    private String path;
    @ManyToOne
    @JoinColumn(name = "idMonument")
    private Monuments monuments;

    public Documents() {
    }

    public Documents(String type, String path, Monuments monuments, Integer idDocument, Integer Monument) {
        this.path = path;
        this.type = type;
        this.idDocument = idDocument;
        this.monuments = monuments;

    }

    public Documents(Integer id) {
        this.idDocument = id;
    }

    /**
     *
     * @return id
     */
    public String getType() {
        return type;
    }

    /**
     *
     * @param type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     *
     * @return type
     */
    public String getPath() {
        return path;
    }

    /**
     *
     * @param path
     */
    public void setPath(String path) {
        this.path = path;
    }

    /**
     * @return the idDocument
     */
    public Integer getIdDocument() {
        return idDocument;
    }

    /**
     * @param idDocument the idDocument to set
     */
    public void setIdDocument(Integer idDocument) {
        this.idDocument = idDocument;
    }

    /**
     * @return the monuments
     */
    public Monuments getMonuments() {
        return monuments;
    }

    /**
     * @param monuments the monuments to set
     */
    public void setMonuments(Monuments monuments) {
        this.monuments = monuments;
    }

}
