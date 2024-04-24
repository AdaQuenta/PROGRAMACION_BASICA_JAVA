package operadoresaritmeticos;
public class OperadoresAritmeticos {
    public static void main(String[] args) {
        int variableUno = 50;
        int variableDos = 20;
        
        //INCREMENTO
      //  variableUno =variableUno + 1;
       variableUno++;
       System.out.println("Incremento: "+variableUno);
       
       //DECREMENTO
       //variableDos = variableDos - 1;
       variableDos -- ;
       System.out.println("Decremento: "+variableDos);
       
       //SUMA
       int suma =variableUno + variableDos;
       System.out.println(" resultado Suma: " + suma);
       //RESTA
       int resta =variableUno - variableDos;
       System.out.println("resultado resta: " + resta);
       //MULTIPLICACION
       int multiplicacion = variableUno * variableDos;
       System.out.println("resultado multiplicacion: " + multiplicacion);
       //DIVISION
       int division = variableUno / variableDos;
       System.out.println("Division " + division);
       //MODULO
       int modulo = variableUno % variableDos;
       System.out.println("Modulo: " + modulo);
       
       //int resultadoModulo = variableUno / variableDos;
       //System.out.println("Modulo: " + resultado Modulo);
       
           }
    
}
