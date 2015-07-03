package com.afbb.balakrishna.parsingtechinques.Gson;

import com.google.gson.annotations.Expose;

import java.util.ArrayList;
import java.util.List;

public class Subject {

@Expose
private List<Topic> topics = new ArrayList<Topic>();
@Expose
private String auther;
@Expose
private String price;
@Expose
private String subject;

    @Override
    public String toString() {
        return "Subject{" +
                "topics=" + topics +
                ", auther='" + auther + '\'' +
                ", price='" + price + '\'' +
                ", subject='" + subject + '\'' +
                '}';
    }

    /**
* 
* @return
* The topics
*/
public List<Topic> getTopics() {
return topics;
}

/**
* 
* @param topics
* The topics
*/
public void setTopics(List<Topic> topics) {
this.topics = topics;
}

/**
* 
* @return
* The auther
*/
public String getAuther() {
return auther;
}

/**
* 
* @param auther
* The auther
*/
public void setAuther(String auther) {
this.auther = auther;
}

/**
* 
* @return
* The price
*/
public String getPrice() {
return price;
}

/**
* 
* @param price
* The price
*/
public void setPrice(String price) {
this.price = price;
}

/**
* 
* @return
* The subject
*/
public String getSubject() {
return subject;
}

/**
* 
* @param subject
* The subject
*/
public void setSubject(String subject) {
this.subject = subject;
}

}
