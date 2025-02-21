import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;

import javax.crypto.EncryptedPrivateKeyInfo;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



class Result {

    public static String decryptMessage(String encryptedMessage) {
    String[] words=encryptedMessage.split(" ");
    List<String> list=new ArrayList<>();
    for(String word:words){
        list.add(expandWord(word));
    }
    Collections.reverse(list);
    return String.join(" ",list);
    }
    private static String expandWord(String word){
        StringBuilder expanded=new StringBuilder();
        int i=0;
        while(i < word.length()){
            char c=word.charAt(i);
            expanded.append(c);
            i++;
            if(i<word.length() && Character.isDigit(word.charAt(i))){
                int freq=word.charAt(i)-'0';
                for(int j=1;j<freq;j++){
                    expanded.append(c);
                }
                i++;
            }
        }
        return expanded.toString();
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String encryptedMessage = bufferedReader.readLine();

        String result = Result.decryptMessage(encryptedMessage);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
