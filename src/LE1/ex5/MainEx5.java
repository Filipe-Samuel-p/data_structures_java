package LE1.ex5;

import java.util.ArrayList;
import java.util.List;

public class MainEx5 {

    private static ArrayList<Integer> posicoes = new ArrayList<>();

    public static int totalSubstring(String[] string, String subString, int indexStart, int totalOcorrencias){

        if(indexStart == string.length){
            return totalOcorrencias;
        }
        else{
            if(string[indexStart].equals(subString)){
                posicoes.add(indexStart);
                totalOcorrencias++;
            }
            return totalSubstring(string,subString,indexStart + 1,totalOcorrencias);
        }
    }


    public static void main(String[] args) {

        String string = "Uma vez flamengo sempre flamengo flamengo flamengo";
        String[] vetorString = string.split(" ");
        String subString = "flamengo";
        int totalOcorrencia = totalSubstring(vetorString,"flamengo",0,0);
        System.out.println("Ocorrencias: " + totalOcorrencia);
        System.out.println("Posições das substrings: " + posicoes);
    }
}
