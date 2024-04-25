///////////////////OPERADORES CON CADEMAS
package operacionesconcadenas;
public class OperacionesConCadenas {
    public static void main(String[] args) {
        String Nombres = "Ada Elizabeth";
        String Apellidos = "Quenta Huanca";
        //CONCATENAR
        String NombreCompleto = Nombres +" "+ Apellidos;
        System.out.println("Nombre completo: "+ NombreCompleto);
        
        //Mayusculas
        String NombreCompleto1 = Nombres +" "+ Apellidos;
        System.out.println("Nombre completo: "+ NombreCompleto1.toUpperCase());
        
        //Minusculas
        String NombreCompleto2 = Nombres +" "+ Apellidos;
        System.out.println("Nombre completo: "+ NombreCompleto2.toLowerCase());
        
        //Contar cadenas
        String NombreCompleto3 = Nombres +" "+ Apellidos;
        System.out.println("Cantidad de caracteres: "+ NombreCompleto3.length());
        
        //cortar cadenas
        String NombreCompleto4 = Nombres +" "+ Apellidos;
        
        //["Ada","Elizabeth","Quenta","Huanca"]
        
        String[] NombreCortado = NombreCompleto4.split(" ");        
        //for(int i =0 ; i<NombreCortado.length ; i++){
           ///System.out.println(NombreCortado[i]);
        //}
        for(String nombre : NombreCortado){
            System.out.println(nombre);
        }
        //System.out.println("Nombre cortado: "+ NombreCortado);
        
        //EQUALS
        //boolean comparacion = Nombres.equals(Apellidos);
        boolean comparacion = Nombres == Apellidos;
        System.out.println("comparcion: "+comparacion);
        
        //INTERPOLACION DE VARIABLES
        String n = "Ada";
        String a = "Huanca";
        int e = 90;
        
        String mensaje = String.format( "Mi nombre es %s y mi apellido es %s y tengo %d años", n, a, e );
        System.out.println(mensaje);
    }
}


