/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.stringa;

import java.util.Scanner;

/**
 *
 * @author Davide
 */
public class Stringa {
 Scanner scanner = new Scanner(System.in);
    public String stringa=scanner.nextLine();
    public void conta_a(){     
        for(int i=0; i<stringa.length(); i++){  
          if(stringa.charAt(i) == 'a' || stringa.charAt(i) == 'A'){ 
              System.out.print("A");  
          }
        }
    }
    
}
