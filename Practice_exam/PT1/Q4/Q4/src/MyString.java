/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HAI DUONG
 */
public class MyString implements IString{
    
    public int isPrime(char n){
        double a = Character.getNumericValue(n);
        if(a < 2) return 0;
        for(int i = 2; i <= Math.sqrt(a) ; i++){
            if(a % i == 0) return 0;
        }
        return 1;
    }
    @Override
    public int f1(String str) {
        int cout = 0;
        for (char c : str.toCharArray()) {
            if(isPrime(c) == 1 && Character.isDigit(c)){
                cout++;
            }
        }
        return cout;
        
    }

    @Override
    public String f2(String str) {
        String[] newStr = str.split(" ");
        String st = "";
        for (int i = newStr.length - 1; i >= 0; i--) {
            st += newStr[i] + " ";
        }
        return st.trim();
    }
    
}
