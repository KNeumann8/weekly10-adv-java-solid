package edu.wctc.independentcopy.reader;

import java.util.ArrayList;
import java.util.List;

public class ListReader implements Reader {
    @Override
    public String readln() {

        //Making the list
        String line = "This is the default message";
        char[] charArray = line.toCharArray();
        List<Character> charList = new ArrayList();
        for (char c : charArray){
            charList.add(c);
        }


        //Reading the list
        String output = "";
        for (char c : charList){
            output += c;
        }
        return output;
    }
}
