/* 
Teniendo en cuenta que var1, var2 y var3 son variables de tipo boolean y están inicializadas a los siguientes valores: var1=true, var2=true y var3=false y que las variables X, Y y Z son variables enteras con valores: X=5, Y=-8 y Z=10, indica si las siguientes operaciones se evaluan a true o false.:

var1 || var2 && var3.
(var1 || var3) && (var2 && !var1).
(var2 || !var1 || !var3) && var1.
(X > 3 || Y > 3) && Z < -3.
(X+Z == 15) && (Y != 2). */ 


 var1 || var2 && var3.
  
  public static void main(String[] args) {
        
     boolean var1 = true; 
     boolean var2 = true; 
     boolean var3 = false; 
   
     // true && true && false = false
     // true || true && false = true
        
     if (var1 || var2 && var3) {
          System.out.println("El resultado es: True");   
      }else{
          System.out.println("El resultado es: False"); 
        }
    }
 
   
/* ================================== */
  (var1 || var3) && (var2 && !var1).
   
   public static void main(String[] args) {
        
        boolean var1 = true; 
        boolean var2 = true; 
        boolean var3 = false; 
        
        // true && true && false = false
        // true || true && false = true
        
        if ((var1 || var3) && (var2 && !var1)) {
            System.out.println("El resultado es: True");   
        }else{
            System.out.println("El resultado es: False"); 
        }
    }
   
 
 /* ================================== */
    (var2 || !var1 || !var3) && var1
    
     public static void main(String[] args) {
        
        boolean var1 = true; 
        boolean var2 = true; 
        boolean var3 = false; 
        
        // true && true && false = false
        // true || true && false = true
        
        if ((var2 || !var1 || !var3) && var1){
            System.out.println("El resultado es: True");   
        }else{
            System.out.println("El resultado es: False"); 
        }
    }
  
  
 /* ================================== */
   (X > 3 || Y > 3) && Z < -3.
   
   public class PROG02_Ejerc3 {

    public static void main(String[] args) {
        
        int numeroX = 7; 
        int numeroY = 9; 
        int numeroZ = 5;
        
        // * || operador (or / o)
        // * && operador (and / y)
        // * ! operador  (not / no)
        
        if ((numeroX > 3 || numeroY > 3) && numeroZ < -3){
            System.out.println("El resultado es: True");   
        }else{
            System.out.println("El resultado es: False"); 
        }
    }
}
   
/* ================================== */
   
   (X+Z == 15) && (Y != 2)
 
    public class PROG02_Ejerc3 {

    public static void main(String[] args) {
        
        int numeroX = 5; 
        int numeroY = 8; 
        int numeroZ = 10;
        
        // * || operador (or / o)
        // * && operador (and / y)
        // * ! operador  (not / no)
        
        if ((numeroX +numeroZ == 15) && (numeroY !=2)){
            System.out.println("El resultado es: True");   
        }else{
            System.out.println("El resultado es: False"); 
        }
    }
}
     
     
