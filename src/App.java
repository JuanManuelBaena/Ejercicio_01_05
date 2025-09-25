public class App {
public static final String RESET = "\033[0m";  // Text Reset
    // Códigos ANSI para colores de texto
public static final String NEGRO = "\u001B[30m";
public static final String ROJO = "\u001B[31m";
public static final String VERDE = "\u001B[32m";
public static final String AMARILLO = "\u001B[33m";
public static final String AZUL = "\u001B[34m";
public static final String PURPURA = "\u001B[35m";
public static final String BLANCO = "\u001B[37m";
 public static final String CYAN = "\033[0;36m";    

// Códigos ANSI para colores de fondo
public static final String FONDO_NEGRO = "\u001B[40m";
public static final String FONDO_ROJO = "\u001B[41m";
public static final String FONDO_VERDE = "\u001B[42m";
public static final String FONDO_AMARILLO = "\u001B[43m";
public static final String FONDO_AZUL = "\u001B[44m";
public static final String FONDO_PURPURA = "\u001B[45m";
public static final String FONDO_CYAN = "\u001B[46m";
public static final String FONDO_BLANCO = "\u001B[47m";
    public static void main(String[] args) throws Exception {
String si = ROJO+"SI"+RESET;
String prog = AMARILLO+"PROG"+RESET;
String lm = CYAN+"LM"+RESET;
String bd = VERDE+"BD"+RESET;
String sos = BLANCO+"SOS"+RESET;
String ipe1 = PURPURA+"IPE1"+RESET;
String dig = NEGRO+"DIG"+RESET;
String ed = AZUL+"ED"+RESET;



        System.out.printf("%-10s%-10s%-10s%-10s%-10s%n", "Lunes", "Martes", "Miércoles", "Jueves", "Viernes");
        System.out.printf("%-10s        %-10s      %-10s        %-10s      %-10s%n", si, prog, si, ipe1, bd);
        System.out.printf("%-10s        %-10s      %-10s        %-10s      %-10s%n", si, prog, si, ipe1, bd);
        System.out.printf("%-10s        %-10s      %-10s      %-10s      %-10s%n", lm, prog, ipe1, prog, si);
        System.out.printf("%-10s        %-10s        %-10s       %-10s      %-10s%n", lm, bd, dig, prog, ed);
        System.out.printf("%-10s        %-10s        %-10s      %-10s      %-10s%n", bd, bd, prog, prog, ed);
        System.out.printf("%-10s        %-10s       %-10s      %-10s        %-10s%n", bd, sos, prog, lm, ed);
        }
}
