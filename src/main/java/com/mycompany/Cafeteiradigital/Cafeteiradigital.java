package com.mycompany.Cafeteiradigital;

public class Cafeteiradigital {
    public static void main(String args[]){
    //sensor que indentifica se a água está na temperatura certa
    boolean sensorAguaOK = true;

    //sensor que indentifica se a cápsula está na máquina
    boolean sensorCapsulaOK = false;

        if( sensorAguaOK ){
        System.out.println("A água está na temperatura certa");
    }else{
        System.out.println("Aguarde a água chegar na temperatura certa");
    }
    
    if (sensorCapsulaOK){
        System.out.println("voçê já pode fazer café");  
    }else{
        System.out.println("Coloque uma cápsula de café na máquina");
    }
}
}
