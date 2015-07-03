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
"age",
"salary"
})
public class Properties {

@JsonProperty("age")
private String age;
@JsonProperty("salary")
private String salary;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

/**
* 
* @return
* The age
*/
@JsonProperty("age")
public String getAge() {
return age;
}

/**
* 
* @param age
* The age
*/
@JsonProperty("age")
public void setAge(String age) {
this.age = age;
}

/**
* 
* @return
* The salary
*/
@JsonProperty("salary")
public String getSalary() {
return salary;
}

/**
* 
* @param salary
* The salary
*/
@JsonProperty("salary")
public void setSalary(String salary) {
this.salary = salary;
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