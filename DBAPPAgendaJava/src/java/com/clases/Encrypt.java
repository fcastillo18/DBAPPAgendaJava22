/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.clases;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 *
 * @author Franklin
 */
public class Encrypt {
    
    //PROBANDO EFECTIVIDAD DEL CODIGO, ESTE ENCRIPTA LA CLAVE EN 128 CARACTERES
//    public static void main(String[] args) {
//        System.out.println(sha512("clave") + " LEN " +sha512("clave").length());
//    }
    
    public static String sha512(String cadena){
    
        StringBuilder sb = new StringBuilder();
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-512");
            md.update(cadena.getBytes());
            byte[] mb = md.digest();
            
            for (int i = 0; i < mb.length; i++) {
                sb.append(Integer.toString((mb[i] & 0xff)+0x100, 16).substring(1));
            }
        } catch (NoSuchAlgorithmException ex) {
            
        }
        
        return sb.toString();
    } 
}
