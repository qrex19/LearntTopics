package com.nishant;

public class Strings {
    public static void main(String[] args) {    
        //code

        String var = new String("this is a string");

        System.out.println(substring(var, 0, 3)); //output

        System.out.println(replace(var, ' ', ',')); //output

        System.out.println(deletechar(var, 's')); //output

    }

    static String substring(String str, int start, int end) { //start will be inclusive and end will be exclusive.
        
        return new String(str.substring(start, end)); //returns the substring with "beginindex" as inclusive and "endindex" as exclusive.

    }

    static String replace(String str, char a, char b) {

        return new String(str.replace(a, b)); //replaces every char 'a' with char 'b'.

    }

    static String deletechar(String str, char ch) {

        StringBuilder strbuild = new StringBuilder(str);

        for (int i = 0; i < strbuild.length(); i++) {
            if(strbuild.charAt(i) == ch) {
                strbuild.delete(i, i + 1);
                i--;
            }
        }

        return new String(strbuild);     //deletes all the ch from the string.

    }
}
