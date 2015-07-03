package com.afbb.balakrishna.parsingtechinques.Jackson;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"id",
"name",
"permanent",
"address",
"phoneNumbers",
"role",
"cities",
"properties"
})
public class Student {

@JsonProperty("id")
private Integer id;
@JsonProperty("name")
private String name;
@JsonProperty("permanent")
private Boolean permanent;
@JsonProperty("address")
private Address address;
@JsonProperty("phoneNumbers")
private List<Integer> phoneNumbers = new ArrayList<Integer>();
@JsonProperty("role")
private String role;
@JsonProperty("cities")
private List<String> cities = new ArrayList<String>();
@JsonProperty("properties")
private Properties properties;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

/**
* 
* @return
* The id
*/
@JsonProperty("id")
public Integer getId() {
return id;
}

/**
* 
* @param id
* The id
*/
@JsonProperty("id")
public void setId(Integer id) {
this.id = id;
}

/**
* 
* @return
* The name
*/
@JsonProperty("name")
public String getName() {
return name;
}

/**
* 
* @param name
* The name
*/
@JsonProperty("name")
public void setName(String name) {
this.name = name;
}

/**
* 
* @return
* The permanent
*/
@JsonProperty("permanent")
public Boolean getPermanent() {
return permanent;
}

/**
* 
* @param permanent
* The permanent
*/
@JsonProperty("permanent")
public void setPermanent(Boolean permanent) {
this.permanent = permanent;
}

/**
* 
* @return
* The address
*/
@JsonProperty("address")
public Address getAddress() {
return address;
}

/**
* 
* @param address
* The address
*/
@JsonProperty("address")
public void setAddress(Address address) {
this.address = address;
}

/**
* 
* @return
* The phoneNumbers
*/
@JsonProperty("phoneNumbers")
public List<Integer> getPhoneNumbers() {
return phoneNumbers;
}

/**
* 
* @param phoneNumbers
* The phoneNumbers
*/
@JsonProperty("phoneNumbers")
public void setPhoneNumbers(List<Integer> phoneNumbers) {
this.phoneNumbers = phoneNumbers;
}

/**
* 
* @return
* The role
*/
@JsonProperty("role")
public String getRole() {
return role;
}

/**
* 
* @param role
* The role
*/
@JsonProperty("role")
public void setRole(String role) {
this.role = role;
}

/**
* 
* @return
* The cities
*/
@JsonProperty("cities")
public List<String> getCities() {
return cities;
}

/**
* 
* @param cities
* The cities
*/
@JsonProperty("cities")
public void setCities(List<String> cities) {
this.cities = cities;
}

/**
* 
* @return
* The properties
*/
@JsonProperty("properties")
public Properties getProperties() {
return properties;
}

/**
* 
* @param properties
* The properties
*/
@JsonProperty("properties")
public void setProperties(Properties properties) {
this.properties = properties;
}

@JsonAnyGetter
public Map<String, Object> getAdditionalProperties() {
return this.additionalProperties;
}

@JsonAnySetter
public void setAdditionalProperty(String name, Object value) {
this.additionalProperties.put(name, value);
}

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", permanent=" + permanent +
                ", address=" + address +
                ", phoneNumbers=" + phoneNumbers +
                ", role='" + role + '\'' +
                ", cities=" + cities +
                ", properties=" + properties +
                ", additionalProperties=" + additionalProperties +
                '}';
    }
}