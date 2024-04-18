/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.eniso.tp5ex2;


public class UserValidator  {
    public void validateAge(int num) throws UserAgeException{
    if (num<18){
     throw new UserAgeException ("votre age est inférieur a 18");
     
    }
    }
}
