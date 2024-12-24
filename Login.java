/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tracker_package;

/**
 *
 * @author Poorna
 */
public class Login {
    private String userName;
    private double income;
    private double save;
    
    public Login(){
        this.userName = null;
        this.income = 0;
        this.save = 0;
    }
    
    public void createUser(String name, double income, double save){
        this.userName = name;
        this.income = income;
        this.save = save;
    }
}
