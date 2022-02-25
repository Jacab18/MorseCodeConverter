package Morsecode;

import java.util.HashMap;

public class Converter {
    private HashMap<String, String> myHashMap;

    public Converter() {
        myHashMap = new HashMap<String, String>();
        myHashMap.put("*-", "A");
        myHashMap.put("-***", "B");
        myHashMap.put("-*-*", "C");
        myHashMap.put("-**", "D");
        myHashMap.put("*", "E");
        myHashMap.put("**-*", "F");
        myHashMap.put("--*", "G");
        myHashMap.put("****", "H");
        myHashMap.put("**", "I");
        myHashMap.put("*---", "J");
        myHashMap.put("-*-", "K");
        myHashMap.put("*-**", "L");
        myHashMap.put("--", "M");
        myHashMap.put("-*", "N");
        myHashMap.put("---", "O");
        myHashMap.put("*--*", "P");
        myHashMap.put("--*-", "Q");
        myHashMap.put("*-*", "R");
        myHashMap.put("***", "S");
        myHashMap.put("-", "T");
        myHashMap.put("**-", "U");
        myHashMap.put("***-", "V");
        myHashMap.put("*--", "W");
        myHashMap.put("-**-", "X");
        myHashMap.put("-*--", "Y");
        myHashMap.put("--**", "Z");
        myHashMap.put("*----", "1");
        myHashMap.put("**---", "2");
        myHashMap.put("***--", "3");
        myHashMap.put("****-", "4");
        myHashMap.put("*****", "5");
        myHashMap.put("-****", "6");
        myHashMap.put("--***", "7");
        myHashMap.put("---**", "8");
        myHashMap.put("----*", "9");
        myHashMap.put("-----", "0");
        myHashMap.put("*-*-*-", ".");
        myHashMap.put("--**--", ",");
        myHashMap.put("**--**", "?");

        myHashMap.put("A", "*-");
        myHashMap.put("B", "-***");
        myHashMap.put("C", "-*-*");
        myHashMap.put("D", "-**");
        myHashMap.put("E", "*");
        myHashMap.put("F", "**-*");
        myHashMap.put("G", "--*");
        myHashMap.put("H", "****");
        myHashMap.put("I", "**");
        myHashMap.put("J", "*---");
        myHashMap.put("K", "-*-");
        myHashMap.put("L", "*-**");
        myHashMap.put("M", "--");
        myHashMap.put("N", "-*");
        myHashMap.put("O", "---");
        myHashMap.put("P", "*--*");
        myHashMap.put("Q", "--*-");
        myHashMap.put("R", "*-*");
        myHashMap.put("S", "***");
        myHashMap.put("T", "-");
        myHashMap.put("U", "**-");
        myHashMap.put("V", "***-");
        myHashMap.put("W", "*--");
        myHashMap.put("X", "-**-");
        myHashMap.put("Y", "-*--");
        myHashMap.put("Z", "--**");
        myHashMap.put("1", "*----");
        myHashMap.put("2", "**---");
        myHashMap.put("3", "***--");
        myHashMap.put("4", "****-");
        myHashMap.put("5", "*****");
        myHashMap.put("6", "-****");
        myHashMap.put("7", "--***");
        myHashMap.put("8", "---**");
        myHashMap.put("9", "----*");
        myHashMap.put("0", "-----");
        myHashMap.put(".", "*-*-*-");
        myHashMap.put(",", "--**--");
        myHashMap.put("?", "**--**");
    }

    public String toEnglish(String s) {

        //Skapa en tom sträng att returnera (result)
        String summary = "";
        //Splitta s till en String[]

        String[] result = s.split("\\s");

        //loopa igenom nya String[] och decryptera ifrån hashmappen och spara i result

        for (int i = 0; i < result.length; i++) {
            summary += myHashMap.get(result[i]);
        }

        //returnera resultatet
        return summary;
    }

    public String toMorse(String a) {
        //Skapa en tom sträng att returnera (result)
        String summary = "";
        //Splitta s till en String[]

        String[] result = a.split("");

        //loopa igenom nya String[] och decryptera ifrån hashmappen och spara i result

        for (int i = 0; i < result.length; i++) {
            summary += myHashMap.get(result[i]);
            if (i != result.length -1) {
                summary += " ";
            }
        }

        //returnera resultatet
        return summary;
    }
}
