import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        var nota = Integer.parseInt(scanner.nextLine());
        var calificacion = "Valor desconocido";

        if ((nota>=9)&& (nota<=10)) {
            calificacion = "A";
        }else if ((nota>=8) && (nota<9)){
            calificacion ="B";

        }else if ((nota>=7)&& (nota<8)){
            calificacion="C";

        }else if ((nota>=6)&&(nota<7)){
            calificacion="D";
        }else if ((nota>=0)&&(nota<6)){
            calificacion="F";
        }else {
            calificacion = "Valor desconocido";
        }
        System.out.println("calificacion = " + calificacion);
    }
}
