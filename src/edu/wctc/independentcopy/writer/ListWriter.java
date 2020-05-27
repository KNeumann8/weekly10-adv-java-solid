package edu.wctc.independentcopy.writer;

import java.util.ArrayList;
import java.util.List;

public class ListWriter implements Writer{
    @Override
    public void writeln(String line) {
        char[] charArray = line.toCharArray();
        List<Character> charList = new ArrayList();
        for (char c : charArray){
            charList.add(c);
        }
        System.out.println(charList);
    }
}
