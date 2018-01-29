/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.portonvictor.errno.test;

/**
 *
 * @author porton
 */
public class PrintError {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Error err = new org.portonvictor.errno.Errno(Integer.parseInt(args[0]));
        System.out.println(err.getMessage());
    }

}
