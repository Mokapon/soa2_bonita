package fr.polytech.soa2.tp.pojos.catalogue;

import java.util.Date;

public class CatalogueOffer {

    private String id;
    private String type;
    private String location;
    private Date startDate;
    private Date endDate;
    private double price;
    private String provider;
    private String description;
    private Date availability;
    private Date talksLimit;
    private boolean litigation;

    public CatalogueOffer(String id, String type, String location, Date startDate, Date endDate, String description, Date talksLimit) {
        this.id = id;
        this.type = type;
        this.location = location;
        this.startDate = startDate;
        this.endDate = endDate;
        this.description = description;
        this.talksLimit = talksLimit;
    }

    public String getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public String getLocation() {
        return location;
    }

    public Date getStartDate() {
        return startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getAvailability() {
        return availability;
    }

    public void setAvailability(Date availability) {
        this.availability = availability;
    }

    public Date getTalksLimit() {
        return talksLimit;
    }

    public void setTalksLimit(Date talksLimit) {
        this.talksLimit = talksLimit;
    }

    public boolean isLitigation() {
        return litigation;
    }

    public void setLitigation(boolean litigation) {
        this.litigation = litigation;
    }
}
