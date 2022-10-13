/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evaluacion2;

import java.util.ArrayList;

/**
 *
 * @author labc205
 */

public class num{
    ArrayList<Integer> myNumbers = new ArrayList<Integer>();
    
    public int myNum(int i){
        myNumbers.add(i);
        return 0;
    }
    
    public int numsize(){
        return myNumbers.size();
    }
    
    public int getnum(int i){
        return myNumbers.get(i);
    }
}
