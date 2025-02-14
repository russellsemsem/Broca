package repl;

import lexer.*;
import parser.*;

import java.util.Scanner;

public class Repl {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Broca > ");
            String line = scanner.nextLine();

            if(line.equalsIgnoreCase("stop")){
                System.out.println("Exiting Broca...");
                break;
            }
            
            if(line == null) break;

            Lexer lexer = new Lexer(line);
            Parser parser = new Parser(lexer.scanTokens());
            //Root node of AST
            ASTNode rootNode = parser.parse();
            Interpreter interpreter = new Interpreter();
            Object result = interpreter.interpret(rootNode);
            System.out.println(result);

        }

        scanner.close();
    }
}
