
package infernus;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Expresiones {
    
    String palabra= new String();
    
    public String getToken(String token){        
        switch(token){
            case "Origin":
                palabra = "Inicio de programa";
                break;
            case "death":
                palabra = "Fin de programa";
                break;
            case "int":
                palabra = "Variable tipo entero";
                break;
            case "fly":
                palabra = "variable tipo flotante";
                break;
            case "bool":
                palabra = "variable tipo boleano";
                break; 
            case "txt":
                palabra = "variable tipo texto";
                break; 
            case "asc":
                palabra = "variable tipo char";
                break;
            case "shoot":
                palabra = "Impresora";
                break;  
            case "read":
                palabra = "Lector de variables";
                break;
            case "kill":
                palabra = "Instruccion break";
                break; 
            case "true":
                palabra = "Verdadero";
                break;
            case "Falso":
                palabra = "Falso";
                break;  
            case "wild":
                palabra = "Ciclo while";
                break;  
            case "for":
                palabra = "Ciclo for";
                break;  
            case "if":
                palabra = "Desicion if";
                break;  
            case "else":
                palabra = "Sino";
                break; 
            case "<<":
                palabra = "Llave de control de inicio";
                break;  
            case ">>":
                palabra = "Llave de control final";
                break;  
            case "(":
                palabra = "Inicio parentesis";
                break; 
            case ")":
                palabra = "Fin parentesis";
                break;
            case "==":
                palabra = "Comparacion igual";
                break;
            case "+":
                palabra = "Signo aritmetico de suma";
                break;
            case "-":
                palabra = "Signo aritmetico de menos";
                break;
            case "*":
                palabra = "Signo aritmetico de multiplicacion";
                break;
            case "/":
                palabra = "Signo aritmetico de division";
                break;
            case ";":
                palabra = "Termino de linea";
                break;
            case "=":
                palabra = "Signo de igual";
                break;
            case "<":
                palabra = "Signo menor que";
                break;
            case ">":
                palabra = "Signo mayor que";
                break;
            case "<>":
                palabra = "Signo diferente que";
                break;
            case "&":
                palabra = "Signo Si";
                break;
            case "|":
                palabra = "Signo O";
                break;                
            default:
                
                if(token.matches("[0-9]+[.][0-9]+")){
                    return palabra = "Valor flotante";
                }
                if(token.matches("[0-9]+")){
                        return palabra = "Valor entero";                   
                }
                if(token.matches("[A-Za-z]+[0-9]*[A-Za-z]*")){//000009
                    return palabra = "Variable";
                }
        }
        return palabra;
    }
    
}
