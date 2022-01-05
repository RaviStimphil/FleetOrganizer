/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fleetorganizer;

/**
 *
 * @author Ravi
 */
public class FleetOrganizer {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        
        Car yark = new Car(2015,"Honda","Pilot Touring","Sport Utility Vehicle");
        Car york = new Car(2003,"Mazda","Protege 5","Hatchback");
        if (york.year < yark.year){
            System.out.println(york + "\n" + yark);
        }
        if (york.year > yark.year){
            System.out.println(yark + "\n" + york);
        }
        
    }
    
}
