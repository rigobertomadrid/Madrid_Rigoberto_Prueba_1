/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package madrid_rigoberto_prueba_1;

/**
 *
 * @author Josue
 */
public class RentItem {
    int Codigo;
    String Nombre;
    double Renta;
    double Copias;

    public RentItem(int codigo, String name, double renta){
        this.Codigo=codigo;
        this.Nombre=name;
        this.Renta=renta;
        Copias=0;
    }
    public String toString(){
        return "Codigo: "+Codigo+"\nNombre: "+Nombre+"\nPrecio de Renta: "+Renta;
    }
    public double pagoRenta(int dias){
        return 0;
    }
    public String getNombre(){
        return Nombre;
    }
    public int getCodigo(){
        return Codigo;
    }
    public double getRenta(){
        return Renta;
    }
    public double getCopias(){
        return Copias;
    }
    public String submenu(){
        return "1-Imprimir";
    }
    public void ejecutarOpcion(int opcion){
        if(opcion==1){
            System.out.println("Codigo: "+Codigo);
            System.out.println("Nombre: "+Nombre);
            System.out.println("Renta: "+Renta);
            System.out.println("Copias: "+Copias);
        }else{
            System.out.println("Opcion no valida");
        }
    }
}