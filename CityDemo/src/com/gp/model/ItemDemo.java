/**
 * Author: GP
 * URL:
 * twitter:
 * */
package com.gp.model;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.orm.SugarRecord;
import com.orm.dsl.Table;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@Table
public class ItemDemo extends SugarRecord{

    @SerializedName("geonames")
    @Expose
    
    private List<Geoname> geonames = new ArrayList<Geoname>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public ItemDemo() {
    }

    /**
     * 
     * @param geonames
     */
    public ItemDemo(List<Geoname> geonames) {
        this.geonames = geonames;
    }

    /**
     * 
     * @return
     *     The geonames
     */
    public List<Geoname> getGeonames() {
        return geonames;
    }

    /**
     * 
     * @param geonames
     *     The geonames
     */
    public void setGeonames(List<Geoname> geonames) {
        this.geonames = geonames;
    }

    public ItemDemo withGeonames(List<Geoname> geonames) {
        this.geonames = geonames;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(geonames).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ItemDemo) == false) {
            return false;
        }
        ItemDemo rhs = ((ItemDemo) other);
        return new EqualsBuilder().append(geonames, rhs.geonames).isEquals();
    }

}
