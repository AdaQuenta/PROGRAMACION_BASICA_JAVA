package tipodato;
public class TipoDato {

    public static void main(String[] args) {
        //cadenas o strings
        //DECLARANDO
        String Nombre;
        int Edad;
        Boolean Estado;
        double Saldo;
        Object TodoTipoDato;
        //ASIGNANDO
        Nombre = "Ada Elizabeth Quenta Huanca";
        Edad = 20;
        Saldo = 1000.34;
        TodoTipoDato = "Cadena";
        TodoTipoDato = 2;
        TodoTipoDato = true;
        TodoTipoDato = 23.23;
        //IMPRIMIENDO
        System.out.println("Nombre: " + Nombre);
        System.out.println("Edad: " + Edad);
        System.out.println("Saldo: " + Saldo);
        System.out.println("Dinamico: " + TodoTipoDato);
    }
    
}
