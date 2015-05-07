package com.konduto.sdk.models;

import com.konduto.sdk.annotations.Required;
import com.konduto.sdk.annotations.ValidateFormat;

/**
 * Created by rsampaio on 07/05/15.
 */
public class KondutoFlightTravelLeg extends KondutoTravelLeg {
    @ValidateFormat(format = "[A-Z]{3}")
    @Required
    private String originAirport;

    @ValidateFormat(format = "[A-Z]{3}")
    @Required
    private String destinationAirport;

    private String originCity;
    private String destinationCity;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        KondutoFlightTravelLeg that = (KondutoFlightTravelLeg) o;

        if (!originAirport.equals(that.originAirport)) return false;
        if (!destinationAirport.equals(that.destinationAirport)) return false;
        if (originCity != null ? !originCity.equals(that.originCity) : that.originCity != null) return false;
        return !(destinationCity != null ? !destinationCity.equals(that.destinationCity) : that.destinationCity != null);

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + originAirport.hashCode();
        result = 31 * result + destinationAirport.hashCode();
        result = 31 * result + (originCity != null ? originCity.hashCode() : 0);
        result = 31 * result + (destinationCity != null ? destinationCity.hashCode() : 0);
        return result;
    }

    public String getOriginAirport() {
        return originAirport;
    }

    public void setOriginAirport(String originAirport) {
        this.originAirport = originAirport;
    }

    public String getDestinationAirport() {
        return destinationAirport;
    }

    public void setDestinationAirport(String destinationAirport) {
        this.destinationAirport = destinationAirport;
    }

    public String getOriginCity() {
        return originCity;
    }

    public void setOriginCity(String originCity) {
        this.originCity = originCity;
    }

    public String getDestinationCity() {
        return destinationCity;
    }

    public void setDestinationCity(String destinationCity) {
        this.destinationCity = destinationCity;
    }
}
