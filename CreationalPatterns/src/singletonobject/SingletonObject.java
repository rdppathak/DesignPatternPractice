/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singletonobject;

/**
 *
 * @author Rushikesh
 */
public class SingletonObject {
    
    private static SingletonObject instance;
    private SingletonObject(){
        System.out.println("Singleton object created");
    }
    
    public static SingletonObject GetInstance(){
        if (instance == null){
            System.out.println("Creating Singleton object instance");
            instance = new SingletonObject();
            return instance;
        }
        System.out.println("Using already created instance again!!!");
        return instance;
    }
    
    public void DoSomething(){
        System.out.println("DoSomething() function invoked");
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        SingletonObject.GetInstance().DoSomething();
        
        SingletonObject.GetInstance().DoSomething();
    }
    
}
