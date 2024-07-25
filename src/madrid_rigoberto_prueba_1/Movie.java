/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package madrid_rigoberto_prueba_1;

/**
 *
 * @author Josue
 */
public class Movie extends RentItem{
    private String estado;

    public Movie(int Codigo, String Nombre, double Renta){
        super(Codigo,Nombre,Renta);
        this.estado="Estreno";
    }
    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado=estado;
    }
    public String toString() {
        return super.toString()+",Estado: "+estado+" - Movie";
    }
   
}
