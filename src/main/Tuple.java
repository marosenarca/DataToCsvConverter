/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package main;

import java.util.Date;

/**
 *
 * @author MaRose
 */
public class Tuple {
    private Date date;
    private double latitude_n, longitude_e, depth, magnitude;
    private String location;

    public Tuple(Date d, double lat, double lo, double de, double mag, String loc) {
        this.date = d;
        this.latitude_n = lat;
        this.longitude_e = lo;
        this.depth = de;
        this.magnitude = mag;
        this.location = loc;
    }
    
    /**
     * @return the date
     */
    public Date getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * @return the latitude_n
     */
    public double getLatitude_n() {
        return latitude_n;
    }

    /**
     * @param latitude_n the latitude_n to set
     */
    public void setLatitude_n(double latitude_n) {
        this.latitude_n = latitude_n;
    }

    /**
     * @return the longitude_e
     */
    public double getLongitude_e() {
        return longitude_e;
    }

    /**
     * @param longitude_e the longitude_e to set
     */
    public void setLongitude_e(double longitude_e) {
        this.longitude_e = longitude_e;
    }

    /**
     * @return the location
     */
    public String getLocation() {
        return location;
    }

    /**
     * @param location the location to set
     */
    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * @return the depth
     */
    public double getDepth() {
        return depth;
    }

    /**
     * @param depth the depth to set
     */
    public void setDepth(double depth) {
        this.depth = depth;
    }

    /**
     * @return the magnitude
     */
    public double getMagnitude() {
        return magnitude;
    }

    /**
     * @param magnitude the magnitude to set
     */
    public void setMagnitude(double magnitude) {
        this.magnitude = magnitude;
    }
}
