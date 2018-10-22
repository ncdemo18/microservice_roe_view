package ru.rakh.microservice_roe_view;

import java.util.List;

public class Offer {

    private String name;
    private List<Offer> child;

    public Offer() {
    }

    public Offer(String name) {
        this.name = name;
    }

    public Offer(String name, List<Offer> child) {
        this.name = name;
        this.child = child;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Offer> getChild() {
        return child;
    }

    public void setChild(List<Offer> child) {
        this.child = child;
    }
}
