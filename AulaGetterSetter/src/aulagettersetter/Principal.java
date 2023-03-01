/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aulagettersetter;

public class Principal {

    public static void main(String[] args) {
        
        /*
        Teclado waser = new Teclado("FJDHGR", true, "Mecânico");
        System.out.println(waser.getModelo());
        System.out.println(waser.getWireless());
        System.out.println(waser.getTipo());
        System.out.println("\n");
        
        Teclado dell = new Teclado("7851296", false, "Membrana");
        System.out.println(dell.getModelo());
        System.out.println(dell.getWireless());
        System.out.println(dell.getTipo());
        System.out.println("\n");
        
        Teclado inspiron = new Teclado("TE5445D", true, "TesteFail");
        System.out.println(inspiron.getModelo());
        System.out.println(inspiron.getWireless());
        System.out.println(inspiron.getTipo());
        System.out.println("\n");
        */
        
        Teclado waser = new Teclado();
        waser.setModelo("FDSFE455");
        System.out.println(waser.getModelo());
        waser.setWireless(true);
        System.out.println(waser.getWireless());
        waser.setTipo("Mecânico");
        System.out.println(waser.getTipo());
        System.out.println("\n");
        
        Teclado dell = new Teclado();
        dell.setModelo("TX346G");
        System.out.println(dell.getModelo());
        dell.setWireless(false);
        System.out.println(dell.getWireless());
        dell.setTipo("Membrana");
        System.out.println(dell.getTipo());
        System.out.println("\n");
        
        Teclado inspiron = new Teclado();
        inspiron.setModelo("I54GE88");
        System.out.println(inspiron.getModelo());
        inspiron.setWireless(false);
        System.out.println(inspiron.getWireless());
        inspiron.setTipo("TesteFail");
        System.out.println(inspiron.getTipo());
        System.out.println("\n");
        
    }
    
}
