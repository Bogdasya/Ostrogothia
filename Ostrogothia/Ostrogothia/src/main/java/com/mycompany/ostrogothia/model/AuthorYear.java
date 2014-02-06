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
@Table(name = "Authors")
public class AuthorYear implements Serializable {

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    @Column(name = " idAuthors ")
    private Integer id;
    @Column(name = " Name ")
    private String name;
    @Column(name = " Year  ")
    private Integer year;
    @Column(name = " NameAuthor  ")
    private String AuthorName;
    @OneToOne
    @PrimaryKeyJoinColumn
    private Monuments monuments;

    public AuthorYear() {
    }

    public AuthorYear(Integer id) {
        this.id = id;
    }

    public AuthorYear(Integer id, String AuthorName, String name, Integer year, Monuments monuments) {
        this.id = id;
        this.name = name;
        this.AuthorName = AuthorName;
        this.year = year;
        this.monuments = monuments;
    }

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
     * @return the AuthorName
     */
    public String getAuthorName() {
        return AuthorName;
    }

    /**
     * @param AuthorName
     */
    public void setAuthorName(String AuthorName) {
        this.AuthorName = AuthorName;
    }

    /**
     * @return the Monuments
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
