package operadoresdecomparacion;
public class OperadoresDeComparacion {
    public static void main(String[] args) {
        //operador igualdad 
       int variableUno = 70;
       int variableDos = 83; 
        //Operador igual(==)
       boolean igual = variableUno == variableDos;
        System.out.println("Igual: " +igual);
        
          //Operador no igual(!=)
       boolean noIgual = variableUno != variableDos;
        System.out.println("No igual: " + noIgual);
        
          //Operador mayor que (>)
       boolean mayorQue = variableUno > variableDos;
        System.out.println("Mayo que: " + mayorQue);
        
        //Operador menor que (<)
       boolean menorQue = variableUno < variableDos;
        System.out.println("Menor que: " + menorQue);
        
          //Operador mayor o igual que (>=)
       boolean mayorOIgualQue = variableUno >= variableDos;
        System.out.println("mayor O Igual Que: " + mayorOIgualQue);
        
         //Operador menor o igual que (<=)
       boolean menorOIgualQue = variableUno <= variableDos;
        System.out.println("menor O Igual Que: " + menorOIgualQue);
    }
}
            
