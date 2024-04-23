package operadoreslogicos;
public class OperadoresLogicos {
    public static void main(String[] args) {
        boolean esVerdadero = true;
        boolean esFalso = false;
        
        //OPERDAOR AND (&&)
        boolean resultadoAnd = esVerdadero && esFalso;
        System.out.println("AND: "+ resultadoAnd);
        
        //OPERDOR OR (||)
        boolean resultadoOr = esVerdadero || esFalso;
        System.out.println("OR: "+ resultadoOr);
         
        //OPERADOR NOT (!) 
        boolean resultadoNot = !esVerdadero;
        System.out.println("NOT: "+ resultadoNot);
    }
    
}
