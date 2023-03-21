
/**
 *
 * @author Edvaldo Silva
 * Valor máximo no modificable: 35000.
 * Si el nuevo empleado tiene carnet de conducir o no.
 * Un mes del año en formato numérido y como cadena.
 * El nombre y apellidos de una persona.
 * Sexo: con dos valores posibles 'V' o 'M'.
 * Milisegundos transcurridos desde el 01/01/1970 hasta nuestros días.
 * Saldo de una cuenta bancaria.
 * Distancia en kms desde la Tierra a Júpiter.
 */
 

 public class PROG02_Ejerc1 {
   
    // Se utiliza enum para definir los conjuntos de valores para las clases
    // Puede hacerlo dentro o fuera de una clase, pero nunca dentro de un método
    
    public enum sexo {V, M}
    public enum cadena {ENERO, FEBRERO, MARZO, ABRIL, MAYO, JUNIO, JULIO, AGOSTO, SEPTIEMBRE, OCTUBRE, NOVIEMBRE, DECIEMBRE}
    
    //
    public static void main(String[] args) {
        // trabajamos con la variable final int para indicar que es una constante y que no es modificable. 
        final int maximo = 35000; 
        // trabajamos con boolean para datos primitivos en Java o sea true o false.
        boolean carnedeconducir = true; 
        String NommbreApellido = "Edvaldo Silva"; 
        sexo genero = sexo.V; 
        cadena mes = cadena.MARZO; 
        // Los milisegundos transcurridos desde el 01/01/1970 son 53 años
        // 53 años x 365 dias x 24 horas x 60 min. x 60 seg. x 1000 milisegundos
        long miliseg = 1671408000000L; 
        // Para trabajar con datos de 32 bits, lo más recomendable es utilizar float 
        float ccuentabancaria = (float) 19.99; 
        
        //Distancia en kms desde la Tierra a Júpiter.
        long tierra = 715000000L; 
       
        
        // El proximo paso es ejecutar los procesos (variables); 
        // Presentar la saida (resultado). 
        // \n para imprimir los resultados en línea. 
        
        System.out.println("El valor maximo no modificable es "+maximo+"\n");
        System.out.println("El nuevo empleado tiene carnet de conducir? "+carnedeconducir+"\n");
        System.out.println("Estamos en "+mes+"\n");
       
    }
}

