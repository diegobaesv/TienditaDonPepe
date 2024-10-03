/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

import java.sql.Date;

/**
 *
 * @author Alumno
 */
public class Util {

    public static boolean isOnlyLetters(String name) {
        return name.matches("[a-zA-Z]+");
    }
    
    public static boolean isValidDate(String date){
        try {
            Date.valueOf(date);
            return true;
        } catch (Exception e) {
            return false;
        }
    }   
}