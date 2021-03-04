/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package passwordstrength;

/**
 *
 * @author lanek
 */
public class PasswordClient {
    public static void main(String[] args){
        //start of password creator
        StrengthChecker checker = new StrengthChecker();
        String candidatePswd = "base";
       
       String message = checker.verifyCandidatePass(candidatePswd);
       
    }
        
}
