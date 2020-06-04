import java.util.*;

public class Main {

    public static void main(String[] args) {


    //Introduceti aici caracterele dorite:
    String input="apples, pears # and bananas\ngrapes\nbananas !apples\ncacao :) cu lapte";
        //String input2="Tudor merge la scoala\n<h>Informatica</h>\nRegexs unt super";

    String[] commentMarkers2={"</h>","x","<h>","."};
    String[] commentMarkers={"!","#"};

    System.out.println(input);

    System.out.println("\n");

    solution(input,commentMarkers);

    }

    public static String solution(String input,String[] symbols){

        String[] linesOfText=input.split("\n");

        /*for(String s:linesOfText){
            System.out.println(s+"\n");
            break;
        }*/

        // buffer in care o sa adaug fiecare linie procesata
       StringBuilder buffer=new StringBuilder();

       //parcurg fiecare linie pe rand
       for(String s:linesOfText){

           //iau fiecare symbol pe rand si elimin cu un regex toate aparitiile textului de dupa el
           for(int j=0;j<symbols.length;j++) {

               s = s.replaceAll("[ ]*["+symbols[j]+"].*$","");
               //am folosit [] sa formez grupuri
               //0 sau mai multe spatii pana urmate de simbolul introdus, si toate caracterele pana la sfarsitul string-ului

           }

           // Dau append la fiecare linie de text in buffer iar la sfarsit il printez

           if(!s.equals(""))
            buffer.append(s + "\n");

       }

        System.out.println(buffer.toString());

        return input;
    }

}
