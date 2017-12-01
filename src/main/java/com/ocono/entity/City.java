package com.ocono.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.CompletionField;
import org.springframework.data.elasticsearch.annotations.Document;

@Document(indexName = "geonames", type = "geoname")
public class City {
    @Id
    private String id;

    @CompletionField
    private String name;

    private String country_code2;

    private int geonameid;


    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCountry() {
        return country_code2;
    }

    public int getGeoNameId() {
        return geonameid;
    }
}
