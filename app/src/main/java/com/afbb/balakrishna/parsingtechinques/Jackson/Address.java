package com.afbb.balakrishna.parsingtechinques.Jackson;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"street",
"city",
"zipcode"
})
public class Address {

@JsonProperty("street")
private String street;
@JsonProperty("city")
private String city;
@JsonProperty("zipcode")
private Integer zipcode;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

/**
* 
* @return
* The street
*/
@JsonProperty("street")
public String getStreet() {
return street;
}

/**
* 
* @param street
* The street
*/
@JsonProperty("street")
public void setStreet(String street) {
this.street = street;
}

/**
* 
* @return
* The city
*/
@JsonProperty("city")
public String getCity() {
return city;
}

/**
* 
* @param city
* The city
*/
@JsonProperty("city")
public void setCity(String city) {
this.city = city;
}

/**
* 
* @return
* The zipcode
*/
@JsonProperty("zipcode")
public Integer getZipcode() {
return zipcode;
}

/**
* 
* @param zipcode
* The zipcode
*/
@JsonProperty("zipcode")
public void setZipcode(Integer zipcode) {
this.zipcode = zipcode;
}

@JsonAnyGetter
public Map<String, Object> getAdditionalProperties() {
return this.additionalProperties;
}

@JsonAnySetter
public void setAdditionalProperty(String name, Object value) {
this.additionalProperties.put(name, value);
}

}