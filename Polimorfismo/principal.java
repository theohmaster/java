/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Polimorfismo;

/**
 *
 * @author OHMASTER
 */
public class principal {
    public static void main(String[] args) {
        animales NAnimal[] = new animales [3];
        NAnimal[0]= new vaca("la vaca lola","pasto","mooo",'G',4);
        
        NAnimal[1]= new gato("silvestre el gato ","miau",'C',4);
        
        NAnimal[2]= new leon("alex el leon","otros animales"," groar",'M',4);
        
        for(animales nanimales:NAnimal){
            System.out.println(nanimales.datos());
        }
    } 
}
