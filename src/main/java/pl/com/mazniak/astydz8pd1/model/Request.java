package pl.com.mazniak.astydz8pd1.model;


import com.fasterxml.jackson.annotation.JsonProperty;

public class Request{
    @JsonProperty("type")
    public String getType() {
        return this.type; }
    public void setType(String type) {
        this.type = type; }
    String type;
    @JsonProperty("query")
    public String getQuery() {
        return this.query; }
    public void setQuery(String query) {
        this.query = query; }
    String query;
    @JsonProperty("language")
    public String getLanguage() {
        return this.language; }
    public void setLanguage(String language) {
        this.language = language; }
    String language;
    @JsonProperty("unit")
    public String getUnit() {
        return this.unit; }
    public void setUnit(String unit) {
        this.unit = unit; }
    String unit;
}
