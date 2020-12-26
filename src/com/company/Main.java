package com.company;

import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws ParseException {
        Scanner in = new Scanner(System.in);

        String input = in.nextLine();

        Lexer lexer = new Lexer(input);

        List<Token> output = lexer.getAllTokens();
        Parser1 parser = new Parser1(output);
        parser.matchExpression();
    }
}

