/*
 * LICENSE: GPLv3
 * https://www.gnu.org/licenses/gpl-3.0.pt-br.html
 */
package hardware;

/**
 *
 * @author Davi
 */

import java.util.List;
import oshi.SystemInfo;
import oshi.hardware.CentralProcessor;
import oshi.hardware.GlobalMemory;
import oshi.hardware.HardwareAbstractionLayer;
import oshi.hardware.PhysicalMemory;
import oshi.hardware.HWDiskStore;


public class HardwareInfo {

    public static void main(String[] args){
        GetAll();
    }
    
    public static void GetAll(){
        
        //Instanciando as classes;**********************************************//
        SystemInfo systemInfo = new SystemInfo();
        HardwareAbstractionLayer hardware = systemInfo.getHardware();
        //**********************************************************************//
        
        
        /*Pegando os atributos de nossos objetos********************************/
            CentralProcessor processor = hardware.getProcessor();
                
            System.out.println("\n\n***********Processador***********\n");        
            System.out.println(processor.toString());
                
            //**********************************************************************//
        
            //Mostrando os valores colhidos;****************************************//;
            GlobalMemory memoria = hardware.getMemory();
                
            System.out.println("\n\n***********Memoria***********\n");        
            List<PhysicalMemory> physicalMemories = memoria.getPhysicalMemory();
            physicalMemories.forEach(physicalMemory -> {
                System.out.println("Total Capacity: "+physicalMemory.getCapacity()/1048576+"Mb");
                System.out.println("Clock speed: "+physicalMemory.getClockSpeed()/1000000+"MHz");
                System.out.println("Memory Type: "+physicalMemory.getMemoryType());
            });
                    
            List<HWDiskStore> disco = hardware.getDiskStores();
            //for each disk storage
                for(HWDiskStore item : disco){
                    System.out.println("\n\n***********Disco***********\n");        
                    System.out.println(disco.toString()+"\n\n\n");
                }
    }
}