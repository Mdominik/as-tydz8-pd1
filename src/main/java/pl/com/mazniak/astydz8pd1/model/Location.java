package pl.com.mazniak.astydz8pd1.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Location{
    @JsonProperty("name")
    public String getName() {
        return this.name; }
    public void setName(String name) {
        this.name = name; }
    String name;
    @JsonProperty("country")
    public String getCountry() {
        return this.country; }
    public void setCountry(String country) {
        this.country = country; }
    String country;
    @JsonProperty("region")
    public String getRegion() {
        return this.region; }
    public void setRegion(String region) {
        this.region = region; }
    String region;
    @JsonProperty("lat")
    public String getLat() {
        return this.lat; }
    public void setLat(String lat) {
        this.lat = lat; }
    String lat;
    @JsonProperty("lon")
    public String getLon() {
        return this.lon; }
    public void setLon(String lon) {
        this.lon = lon; }
    String lon;
    @JsonProperty("timezone_id")
    public String getTimezone_id() {
        return this.timezone_id; }
    public void setTimezone_id(String timezone_id) {
        this.timezone_id = timezone_id; }
    String timezone_id;
    @JsonProperty("localtime")
    public String getLocaltime() {
        return this.localtime; }
    public void setLocaltime(String localtime) {
        this.localtime = localtime; }
    String localtime;
    @JsonProperty("localtime_epoch")
    public int getLocaltime_epoch() {
        return this.localtime_epoch; }
    public void setLocaltime_epoch(int localtime_epoch) {
        this.localtime_epoch = localtime_epoch; }
    int localtime_epoch;
    @JsonProperty("utc_offset")
    public String getUtc_offset() {
        return this.utc_offset; }
    public void setUtc_offset(String utc_offset) {
        this.utc_offset = utc_offset; }
    String utc_offset;
}