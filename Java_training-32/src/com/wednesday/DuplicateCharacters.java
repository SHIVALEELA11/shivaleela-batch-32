package com.wednesday;

import java.util.HashSet;

public class DuplicateCharacters {

    public static void main(String[] args) {
            String input = "Hello Welcome to the World!";
            String output = duplicateCharacters(input);
            System.out.println("first string: " + input);
            System.out.println("String without duplicates characters: " + output);
        }

        public static String duplicateCharacters(String str) {
            HashSet<Character> uniqueChars = new HashSet<>();

            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);
                if (uniqueChars.add(c)) {
                    sb.append(c);
                }
            }

            return sb.toString();
        }
    }



