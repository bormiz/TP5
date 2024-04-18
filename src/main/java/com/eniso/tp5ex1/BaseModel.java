/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.eniso.tp5ex1;

/**
 *
 * @author aziz
 */
abstract class BaseModel implements MachineLearningModel {

   protected String name;
    int version ;
    String description ;
    String device ;
    
    public BaseModel (String name,int version,String description,String device){
    this.name=name;
    this.description=description;
    this.device=device;
    this.version=version;
    }
    
    public void displayDetails(){
        System.out.println(this.name);
        System.out.println(this.description);
        System.out.println(this.device);
        System.out.println(this.version);
    }
}

