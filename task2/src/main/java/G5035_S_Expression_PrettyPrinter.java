/*
    A basic pretty-printer for expressions involving commas and balanced square brackets.

    Usage:
    ------
    outputString = G5035_S_Expression_PrettyPrinter.prettyPrint( inputString );

    It takes a String as input, and produces a String as output. It ignores all whitespace in the input string,
    producing (possibly different) whitespace in the output.

    The whitespace which is introduced consists of spaces and newlines.
    --- A newline is introduced between any consecutive pair of '[' characters, or between any consecutive pair
        of ']' characters.
    --- A space is introduced after a comma, if it is the only comma in its scope, and there is no '[' character
        fortcoming before the next ']' character. Otherwise, a newline is introduced after a comma.
    --- After each newline, it adds a number of space characters, proportional to the level of nestedness
        of the expression between square brackets (i.e., the number of un-balanced open bracket characters).

    This code was written in haste, and might possibly be improved.
    Please do not change it, but contact me to suggest improvements / point out errors.
    --- JRNB (2021-10-28, ca 12.30 BST)
*/
package main.java;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class G5035_S_Expression_PrettyPrinter {
    // A depth parameter
    static int d;
    // An indentation size. Do not change this!
    final static int ind = 2;

    // booleans to indicate whether the last characters read were open or closed brackets
    static boolean lastCharOpenBracket;
    static boolean lastCharCloseBracket;

    // boolean to indicate whether we have seen a comma at the current level of scope
    static boolean seenComma;
    static boolean escaped;

    // a procedure to control line breaks: add a line-break and d*ind spaces to outs
    static String addLinebreak(String outs) {
        // add a newline
        outs += "\n";
        // add d*ind spaces
        for (int i = 1; i <= d*ind; i++) outs += " ";
        // return the result
        return outs;
    }

    // check whether there is another comma or open bracket in the string after position i,
    // before the next close bracket
    static boolean furtherStructure(String ins, int i) {
        // point at the next char in ins
        i += 1;
        // continue the following so long as we do not reach the end of the string
        while (i < ins.length()) {
            // fetch the next character
            char c = ins.charAt(i);
            // return true if the result is a comma or an open bracket
            if (c == ',' || c == '[') return true;
            // return false if the result is a closed bracket
            if (c == ']') return false;
            // otherwise, point to the next char
            i += 1;
        }

        // if we have run out of string, return false
        return false;
    }

    static String prettyPrint(String ins) {
        // initialise the depth, and flags
        d = 0;
        lastCharOpenBracket = false;
        lastCharCloseBracket = false;
        seenComma = false;
        escaped = false;
        // an output string
        String outs = new String("");
        // a character for reading the current character
        char c;

        // iterate over the characters in s
        for (int i = 0; i < ins.length(); i++) {
            c = ins.charAt(i);
            // do something nontrivial only for non-whitespace
            if (!Character.isWhitespace(c)) {
                // add a linebreak if appropriate

                if (c == '\u001B') {
                    outs += c;
                    escaped = true;
                    continue;
                }

                if (escaped) {
                    outs += c;
                    escaped = false;
                    continue;
                }

                if (c == ',') {
                    outs += ",";
                    if (seenComma || furtherStructure(ins,i) || lastCharCloseBracket)
                        outs = addLinebreak(outs);  // add a line break if appropriate
                    else
                        outs += " "; // otherwise add a space
                    lastCharCloseBracket = false;
                    lastCharOpenBracket = false;
                    seenComma = true; }
                else if (c == ']') {
                    d -= 1;
                    if (lastCharCloseBracket)
                        outs = addLinebreak(outs);
                    outs += ']';
                    lastCharCloseBracket = true;
                    lastCharOpenBracket = false;  }
                else if (c == '[') {
                    if (lastCharOpenBracket)
                        outs = addLinebreak(outs);
                    d += 1;
                    outs += '[';
                    lastCharCloseBracket = false;
                    lastCharOpenBracket = true;
                    seenComma = false; }
                else {
                    outs += c;
                    lastCharCloseBracket = false;
                    lastCharOpenBracket = false; }
            }
        }
        return outs;
    }
}

