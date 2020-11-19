package pl.com.mazniak.astydz8pd1.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class WeatherInfoAPI{
    @JsonProperty("request")
    public Request getRequest() {
        return this.request; }
    public void setRequest(Request request) {
        this.request = request; }
    Request request;
    @JsonProperty("location")
    public Location getLocation() {
        return this.location; }
    public void setLocation(Location location) {
        this.location = location; }
    Location location;
    @JsonProperty("current")
    public Current getCurrent() {
        return this.current; }
    public void setCurrent(Current current) {
        this.current = current; }
    Current current;
}