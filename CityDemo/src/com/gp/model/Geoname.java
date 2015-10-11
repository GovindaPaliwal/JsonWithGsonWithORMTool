/**
 * Author: GP
 * URL:
 * twitter:
 * */
package com.gp.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.orm.SugarRecord;
import com.orm.dsl.Table;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@Table
public class Geoname extends SugarRecord{

    @SerializedName("lng")
    @Expose
    private double lng;
    @SerializedName("geonameId")
    @Expose
    private long geonameId;
    @SerializedName("countrycode")
    @Expose
    private String countrycode;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("fclName")
    @Expose
    private String fclName;
    @SerializedName("toponymName")
    @Expose
    private String toponymName;
    @SerializedName("fcodeName")
    @Expose
    private String fcodeName;
    @SerializedName("wikipedia")
    @Expose
    private String wikipedia;
    @SerializedName("lat")
    @Expose
    private double lat;
    @SerializedName("fcl")
    @Expose
    private String fcl;
    @SerializedName("population")
    @Expose
    private long population;
    @SerializedName("fcode")
    @Expose
    private String fcode;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Geoname() {
    	
    }

    
    
    /**
     * 
     * @param fcodeName
     * @param toponymName
     * @param countrycode
     * @param fcl
     * @param fclName
     * @param name
     * @param wikipedia
     * @param lng
     * @param fcode
     * @param geonameId
     * @param lat
     * @param population
     */
    public Geoname(double lng, long geonameId, String countrycode, String name, String fclName, String toponymName, String fcodeName, String wikipedia, double lat, String fcl, long population, String fcode) {
        this.lng = lng;
        this.geonameId = geonameId;
        this.countrycode = countrycode;
        this.name = name;
        this.fclName = fclName;
        this.toponymName = toponymName;
        this.fcodeName = fcodeName;
        this.wikipedia = wikipedia;
        this.lat = lat;
        this.fcl = fcl;
        this.population = population;
        this.fcode = fcode;
    }

    /**
     * 
     * @return
     *     The lng
     */
    public double getLng() {
        return lng;
    }

    /**
     * 
     * @param lng
     *     The lng
     */
    public void setLng(double lng) {
        this.lng = lng;
    }

    public Geoname withLng(double lng) {
        this.lng = lng;
        return this;
    }

    /**
     * 
     * @return
     *     The geonameId
     */
    public long getGeonameId() {
        return geonameId;
    }

    /**
     * 
     * @param geonameId
     *     The geonameId
     */
    public void setGeonameId(long geonameId) {
        this.geonameId = geonameId;
    }

    public Geoname withGeonameId(long geonameId) {
        this.geonameId = geonameId;
        return this;
    }

    /**
     * 
     * @return
     *     The countrycode
     */
    public String getCountrycode() {
        return countrycode;
    }

    /**
     * 
     * @param countrycode
     *     The countrycode
     */
    public void setCountrycode(String countrycode) {
        this.countrycode = countrycode;
    }

    public Geoname withCountrycode(String countrycode) {
        this.countrycode = countrycode;
        return this;
    }

    /**
     * 
     * @return
     *     The name
     */
    public String getName() {
        return name;
    }

    /**
     * 
     * @param name
     *     The name
     */
    public void setName(String name) {
        this.name = name;
    }

    public Geoname withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 
     * @return
     *     The fclName
     */
    public String getFclName() {
        return fclName;
    }

    /**
     * 
     * @param fclName
     *     The fclName
     */
    public void setFclName(String fclName) {
        this.fclName = fclName;
    }

    public Geoname withFclName(String fclName) {
        this.fclName = fclName;
        return this;
    }

    /**
     * 
     * @return
     *     The toponymName
     */
    public String getToponymName() {
        return toponymName;
    }

    /**
     * 
     * @param toponymName
     *     The toponymName
     */
    public void setToponymName(String toponymName) {
        this.toponymName = toponymName;
    }

    public Geoname withToponymName(String toponymName) {
        this.toponymName = toponymName;
        return this;
    }

    /**
     * 
     * @return
     *     The fcodeName
     */
    public String getFcodeName() {
        return fcodeName;
    }

    /**
     * 
     * @param fcodeName
     *     The fcodeName
     */
    public void setFcodeName(String fcodeName) {
        this.fcodeName = fcodeName;
    }

    public Geoname withFcodeName(String fcodeName) {
        this.fcodeName = fcodeName;
        return this;
    }

    /**
     * 
     * @return
     *     The wikipedia
     */
    public String getWikipedia() {
        return wikipedia;
    }

    /**
     * 
     * @param wikipedia
     *     The wikipedia
     */
    public void setWikipedia(String wikipedia) {
        this.wikipedia = wikipedia;
    }

    public Geoname withWikipedia(String wikipedia) {
        this.wikipedia = wikipedia;
        return this;
    }

    /**
     * 
     * @return
     *     The lat
     */
    public double getLat() {
        return lat;
    }

    /**
     * 
     * @param lat
     *     The lat
     */
    public void setLat(double lat) {
        this.lat = lat;
    }

    public Geoname withLat(double lat) {
        this.lat = lat;
        return this;
    }

    /**
     * 
     * @return
     *     The fcl
     */
    public String getFcl() {
        return fcl;
    }

    /**
     * 
     * @param fcl
     *     The fcl
     */
    public void setFcl(String fcl) {
        this.fcl = fcl;
    }

    public Geoname withFcl(String fcl) {
        this.fcl = fcl;
        return this;
    }

    /**
     * 
     * @return
     *     The population
     */
    public long getPopulation() {
        return population;
    }

    /**
     * 
     * @param population
     *     The population
     */
    public void setPopulation(long population) {
        this.population = population;
    }

    public Geoname withPopulation(long population) {
        this.population = population;
        return this;
    }

    /**
     * 
     * @return
     *     The fcode
     */
    public String getFcode() {
        return fcode;
    }

    /**
     * 
     * @param fcode
     *     The fcode
     */
    public void setFcode(String fcode) {
        this.fcode = fcode;
    }

    public Geoname withFcode(String fcode) {
        this.fcode = fcode;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(lng).append(geonameId).append(countrycode).append(name).append(fclName).append(toponymName).append(fcodeName).append(wikipedia).append(lat).append(fcl).append(population).append(fcode).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Geoname) == false) {
            return false;
        }
        Geoname rhs = ((Geoname) other);
        return new EqualsBuilder().append(lng, rhs.lng).append(geonameId, rhs.geonameId).append(countrycode, rhs.countrycode).append(name, rhs.name).append(fclName, rhs.fclName).append(toponymName, rhs.toponymName).append(fcodeName, rhs.fcodeName).append(wikipedia, rhs.wikipedia).append(lat, rhs.lat).append(fcl, rhs.fcl).append(population, rhs.population).append(fcode, rhs.fcode).isEquals();
    }

}
