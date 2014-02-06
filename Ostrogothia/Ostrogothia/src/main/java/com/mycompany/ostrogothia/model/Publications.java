package com.mycompany.ostrogothia.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;

/**
 *
 * @author bogdasya
 */
@Entity
@Table(name = "Articles ")
public class Publications implements Serializable {

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    @Column(name = " idArticle ")
    private Integer id;
    @Column(name = " Name ")
    private String name;
    @Column(name = " Year ")
    private Integer year;
    @Column(name = " NameAuthor ")
    private String naming; // look in test
    @OneToOne
    @PrimaryKeyJoinColumn
    private Monuments monuments;

    public Publications() {
    }

    public Publications(Integer id, String name, Integer year, String naming, Monuments monuments) {
        this.id = id;
        this.name = name;
        this.year = year;
        this.naming = naming;
        this.monuments = monuments;

    }

    /**
     *
     * @param id
     */
    public Publications(Integer id) {
        this.id = id;
    }

    /**
     *
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     *
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return year
     */
    public Integer getYear() {
        return year;
    }

    /**
     *
     * @param year
     */
    public void setYear(Integer year) {
        this.year = year;
    }

    /**
     *
     * @return naming
     */
    public String getNaming() {
        return naming;
    }

    /**
     *
     * @param naming
     */
    public void setNaming(String naming) {
        this.naming = naming;
    }

    /**
     *
     * @return monuments
     */
    public Monuments getMonuments() {
        return monuments;
    }

    /**
     *
     * @param monuments
     */
    public void setMonuments(Monuments monuments) {
        this.monuments = monuments;
    }
}
