/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chavevalor;

import io.atomix.copycat.Command;

/**
 *
 * @author Tiago
 */
public class RemoveArestaCommand implements Command<Boolean>{
    
    int nome;

    public RemoveArestaCommand(int nome) {
        this.nome = nome;
    }
    
}
