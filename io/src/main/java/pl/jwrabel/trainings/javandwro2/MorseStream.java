package pl.jwrabel.trainings.javandwro2;

/**
 * Created by RENT on 2017-03-20.
 */



import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;

import java.util.Arrays;
import java.util.stream.Collectors;


public class MorseStream {
        public static void main(String[] args) {
            System.out.println(translateToMorse("Ratunku"));
        }

        public static String[] alpha = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j",
                "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v",
                "w", "x", "y", "z", "1", "2", "3", "4", "5", "6", "7", "8",
                "9", "0", " "};
        public static String[] dottie = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.",
                "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.",
                "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-",
                "-.--", "--..", ".----", "..---", "...--", "....-", ".....",
                "-....", "--...", "---..", "----.", "-----", "|"};

        public static BiMap<String, String> biMap = HashBiMap.create();

        static {
            for (int i = 0; i < alpha.length; i++) {
                biMap.put(alpha[i], dottie[i]);
            }
        }



        public static String translateToMorse(String text) {
            return Arrays.stream(text.split("")).map(p-> biMap.get(p.toLowerCase())).collect(Collectors.joining("  "));}}

            //String[] split = text.split("");}

     //       StringBuilder morseString = new StringBuilder();

//            for (String element : split) {
//                String convertedChar = convertChar(element, true);
//                morseString.append(convertedChar);
//                morseString.append(" ");
//            }
//
//            return morseString.toString();
//        }
//
//        public static String convertChar(String charToConvert, boolean toMorse) {
//            return biMap.get(charToConvert);
//        }
//    }

