/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smrexamen;

/**
 *
 * @author T-107
 */
public class Thread1 {
    Thread1 t1= new Thread1();
    public void run(){
    while(true){
    try{
    Thread.sleep(5000); 
    System.out.println("THREAD1");
    }catch(InterruptedException e){ 
    }
  }
}  
 void start() {
        }
}