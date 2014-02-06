package com.mycompany.ostrogothia.model;

import java.io.Serializable;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;

/**
 *
 * @author bogdasya
 */
@Entity
@Table(name = "Monuments ")
public class Monuments implements Serializable {

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    @Column(name = " idMonument ")
    private Integer idMonument;
    @Column(name = "  Name ")
    private String name;
    @Column(name = "  Type_Monument ")
    private String type;
    @Column(name = "  Nature_research ")
    private String character;
    @Column(name = "  Finding ")
    private String founding;
    @OneToOne
    @JoinColumn(name = "Authors")
    private AuthorYear Authors;
    @OneToOne
    @JoinColumn(name = "Articles")
    private Publications Articles;
//Error or no 
    @OneToMany
    @JoinColumn(name = "idMonument")
    private Set<Documents> Files;
    @Column(name = "   Nl ")
    private Double latitude;
    @Column(name = "   El ")
    private Double longitude;
    @Column(name = "   Hydraulic ")
    private String hydraulics;
    @Column(name = "   River_order  ")
    private Integer orderRiver;
    @Column(name = "   Topographical   ")
    private String topographi;
    @Column(name = "   Region  ")
    private String region;
    @Column(name = "   District  ")
    private String district;

    public Monuments() {
    }

    public Monuments(Integer idMonument, String name, String type, String character, String founding, AuthorYear Authors, Publications Articles, Documents Documents, Double latitude, Double longitude, String hydraulics, Integer orderRiver, String topographi, String region, String district) {
        this.idMonument = idMonument;
        this.name = name;
        this.type = type;
        this.character = character;
        this.founding = founding;
        this.Authors = Authors;
        this.Articles = Articles;
        this.Files = (Set<Documents>) Documents;
        this.latitude = latitude;
        this.longitude = longitude;
        this.hydraulics = hydraulics;
        this.orderRiver = orderRiver;
        this.topographi = topographi;
        this.region = region;
        this.district = district;
    }

    public Monuments(Integer Id) {
        this.idMonument = Id;
    }

    /**
     *
     * @return idMonumen
     */
    public Integer getIdMonument() {
        return idMonument;
    }

    /**
     *
     * @param idMonument
     */
    public void setIdMonument(Integer idMonument) {
        this.idMonument = idMonument;
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
     * @return type
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
     * @return character
     */
    public String getCharacter() {
        return character;
    }

    /**
     *
     * @param character
     */
    public void setCharacter(String character) {
        this.character = character;
    }

    /**
     *
     * @return founding
     */
    public String getFounding() {
        return founding;
    }

    /**
     *
     * @param founding
     */
    public void setFounding(String founding) {
        this.founding = founding;
    }

    /**
     *
     * @return Authors
     */
    public AuthorYear getAuthorYear() {
        return Authors;
    }

    /**
     *
     * @param Authors
     */
    public void setAuthorYear(AuthorYear Authors) {
        this.Authors = Authors;
    }

    /**
     *
     * @return Articles
     */
    public Publications getPublications() {
        return Articles;
    }

    /**
     *
     * @param Articles
     */
    public void setPublications(Publications Articles) {
        this.Articles = Articles;
    }

    /**
     *
     * @return Files
     */
    public Set<Documents> getDocuments() {
        return Files;

    }

    /**
     *
     * @param documents
     */
    public void setDocuments(Set<Documents> documents) {
        this.Files = documents;
    }

    /**
     *
     * @return latitude
     */
    public Double getLatitude() {
        return latitude;
    }

    /**
     *
     * @param latitude
     */
    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    /**
     *
     * @return longitude
     */
    public Double getLongitude() {
        return longitude;
    }

    /**
     *
     * @param longitude
     */
    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    /**
     *
     * @return hydraulics
     */
    public String getHydraulics() {
        return hydraulics;
    }

    /**
     *
     * @param hydraulics
     */
    public void setHydraulics(String hydraulics) {
        this.hydraulics = hydraulics;
    }

    /**
     *
     * @return orderRiver
     */
    public Integer getOrderRiver() {
        return orderRiver;
    }

    /**
     *
     * @param orderRiver
     */
    public void setOrderRiver(Integer orderRiver) {
        this.orderRiver = orderRiver;
    }

    /**
     *
     * @return topographi
     */
    public String getTopographi() {
        return topographi;
    }

    /**
     *
     * @param topographi
     */
    public void setTopographi(String topographi) {
        this.topographi = topographi;
    }

    /**
     *
     * @return region
     */
    public String getRegion() {
        return region;
    }

    /**
     *
     * @param region
     */
    public void setRegion(String region) {
        this.region = region;
    }

    /**
     *
     * @return district
     */
    public String getDistrict() {
        return district;
    }

    /**
     *
     * @param district
     */
    public void setDistrict(String district) {
        this.district = district;
    }

    /**
     *
     * @param documents
     */
    public void setDocuments(Documents documents) {
        this.Files = (Set<Documents>) documents;
    }

}
