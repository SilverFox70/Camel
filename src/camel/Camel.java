/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package camel;

/**
 *
 * @author William
 */
interface Rideable {
String getGait();
}

public class Camel implements Rideable{
    int weight = 2;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        new Camel().go(8);
        
        boolean tf = java.util.regex.Pattern.matches("b.b", "bob");
        System.out.println("Does b_b equal bob? :" + tf);
        String str = "abcbob";
        System.out.println(str.substring(3,6)+ ", str length = " + str.length());
        tf = bobThere("abcbob");
        System.out.println("passing 'abcbob':" + tf);
    }
    
    void go(int speed) {
        ++speed;
        weight++;
        int walkrate = speed * weight;
        System.out.println(walkrate + getGait());
    }
    public String getGait() {
        return " mph, lope";
    }
    
    public static boolean bobThere(String str) {
        boolean b = false;
        System.out.println("entering method, str.length = " + str.length());
        for ( int i = 3; i <= str.length(); i++){
            String sub = str.substring(i-3, i);
            System.out.println("index:" + (i-3)+"," + i + ", " + sub);
            if (java.util.regex.Pattern.matches("b.b", sub)) return true;
        }
        System.out.println("for loop done");
        return b;  
    }
    
}
