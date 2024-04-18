/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.eniso.tp5ex2;

import java.io.File;
import java.io.FileNotFoundException;

/**
 *
 * @author aziz
 */
public class FileManager {
    public void readFile(String invalidfilepathtxt) throws FileNotFoundException{
    
        File file=new File("dffzrfr");
    if(!file.exists()){
    throw new FileNotFoundException("le fichier n'existe pas");
    
    }
    }
}
