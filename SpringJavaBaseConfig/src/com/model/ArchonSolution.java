package com.model;

public class ArchonSolution {

    private  String name;
    private String behaviour;
    private  String status;


    public ArchonSolution(){
        super();
    }

    public ArchonSolution(String behaviour, String name, String status) {
        this.behaviour = behaviour;
        this.name = name;
        this.status = status;
    }

    public String getBehaviour() {
        return behaviour;
    }

    public void setBehaviour(String behaviour) {
        this.behaviour = behaviour;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "ArchonSolution{" +
                "behaviour='" + behaviour + '\'' +
                ", name='" + name + '\'' +
                ", status='" + status + '\'' +
                '}';
    }

    public void  display(){

        System.out.println("behaviour= "+behaviour);
        System.out.println("name= "+name);
        System.out.println("status= "+status);
    }
}
