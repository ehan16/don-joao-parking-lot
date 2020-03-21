/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.ArrayList;

/**
 *
 * @author Han, Serrano
 */
public class Hashtable {

    private Vehicle[][] vehicles = new Vehicle[22][3];
    private boolean[] full = new boolean[22]; 
    
    public Hashtable() {
        for (int i = 0; i < full.length; i++) {
            this.full[i] = false;
        }
    }
    
    public static int hashFunction(String licensePlate) {

        int hash = 0; //Este sera el "codigo" que diferenciara la palabra
        licensePlate = licensePlate.toUpperCase();  //Para asegurar la consistencia

        for (int i = 0; i < licensePlate.length(); i++) {
            hash = hash + (licensePlate.charAt(i));
        }

        hash = hash % 11;

        return hash;

    }
    
    public void addVehicle(Vehicle vehicle) {
        
        int hash = Hashtable.hashFunction(vehicle.getLicensePlate());
        System.out.println("Hash es " + hash);
        
        if(full[hash] == false){    //Verifica en el vector de booleanos si el grupo esta lleno
            
            for (int j = 0; j < this.vehicles[0].length; j++) {
                
                if (this.vehicles[hash][j] == null) {   //Va verificando cual columna es la que se encuentra vacia
                    
                    this.vehicles[hash][j] = vehicle;   //Ubica el vehiculo
                    System.out.println("Se inserto en " + hash + " columna " + j);
                    System.out.println("El carro de placa " + vehicle.getLicensePlate());
                    
                    if(j == this.vehicles[0].length-1){
                        this.full[hash] = true;     
                        //Si era la ultima columna de ese grupo, se indica en el vector que ya se encuentra lleno                       
                    }
                    break;
                    
                }
                
            }    
            
        } else {    //Si el grupo esta lleno, se dirige a llenar en overflow
            
            int overflowIndex = 11; //Indice para recorrer el overflow
            boolean inserted = false;  //Para saber si se ha insertado el carro
           
            while(!inserted){   //Mientras no se haya podido insertar el carro
               
                if(!this.full[overflowIndex]) { //Si ese grupo no esta lleno, se procede a insertar
                   
                    for (int j = 0; j < this.vehicles[0].length; j++) {
                         
                        if(this.vehicles[overflowIndex][j] == null) {
                            this.vehicles[overflowIndex][j] = vehicle;  //Si la casilla se encuentra vacia, se inserta el carro
                            inserted = true;    //Se cambia el booleano a verdadero 
                            System.out.println("Se inserto en " + overflowIndex);
                            System.out.println("El carro de placa " + vehicle.getLicensePlate());
                            break;
                        }
                
                    }
                   
                } else {
                    
                    overflowIndex++;    //Si el grupo esta lleno, se avanza al siguiente
                    
                }
               
            }
               
        }
        
    }
    
    public Vehicle getVehicle(String licensePlate) {
        
        int hash = Hashtable.hashFunction(licensePlate);
        System.out.println("Se busca en " + hash);
        
        for (int j = 0; j < this.vehicles[0].length; j++) {     //Para recorrer el grupo
            
            System.out.println("En el ciclo");
            if(this.vehicles[hash][j] != null) { //Verifica si existe vehiculo para evaluar
            
                System.out.println("ENtre" + j);
                if(this.vehicles[hash][j].getLicensePlate().equalsIgnoreCase(licensePlate)){    //Se evalua
                    
                    return this.vehicles[hash][j];  //Si las placas son iguales, se retorna el vehiculo
                    
                }
                
            }
            
        }
        
        return null;    //Si no se encuentra el vehiculo, se retornara nulo
        
    }
    
    public Vehicle[][] getVehicles() {
        return this.vehicles;
    }
    
    //Metodo que retorna una lista con los vehiculos que cumplan con el modelo
    public ArrayList<Vehicle> getVehiclesByModel(String model) {
        
        model = model.toUpperCase();
        ArrayList<Vehicle> vehiclesByModel = new ArrayList();
        
        for (int i = 0; i < this.vehicles.length; i++) {
            
            for (int j = 0; j < this.vehicles[0].length; j++) {
                
                if(this.vehicles[i][j] != null) {
                    
                    String[] aux = this.vehicles[i][j].getModel().split("\\s+");    
                    //Se separan las palabras del modelo por si llegan a tener dos o mas
                    
                    for (int k = 0; k < aux.length; k++) {
                        
                        if(aux[k].equalsIgnoreCase(model)) {
                            
                            vehiclesByModel.add(this.vehicles[i][j]);
                            break;
                            
                        }
                        
                    }
                    
                }
                
            }
            
        }
        
        return vehiclesByModel;
        
    }

}
