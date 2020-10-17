import java.util.*;

public class Prac1_califi{
    
	public static void main(String args[]){

	    Scanner sc= new Scanner(System.in);
       Scanner Teclado= new Scanner(System.in);
       CapturasEntra captura = new CapturasEntra();
       ImprimirTodo imprimir = new ImprimirTodo();
     
       int opcion;
       String Nombre=""; 
       double Califi[];
       Califi =new double[7];

    do
    {
        System.out.println("--------MENU-------");
        System.out.println("\n 1-Captura de nombre y calificaciones \n");
        System.out.println("2-Imprimir calificaciones y promedio de calificaciones \n");
        System.out.println("3-Imprimir calificaciones y calificacion mas baja \n");
        System.out.println("4-Imprimir calificaciones y calificacion mas alta \n");
        System.out.println("5-salir \n");

        System.out.println("\n Introduce el numero del menu \n");
        opcion=Teclado.nextInt();
        
        if(opcion==1){
            captura.captura_Cal_Alum( Califi , Nombre, Teclado,sc );  
         }
         else if(opcion==2){
           ImprimirTodo.imprimir_Cal( Califi , Teclado,sc );
         }
         else if(opcion==3){
            ImprimirTodo.imprimir_baja(Califi, Teclado, sc);
         }
         else if(opcion==4){
            ImprimirTodo.imprimir_mayor(Califi, Teclado, sc);
         }
           
    }while(opcion!=5);
        
		}
        
}


class CapturasEntra{

     public static void  captura_Cal_Alum( double Califi[],String Nombre,Scanner Teclado,Scanner sc )
     {
         for(int i=1;i<=6;i++)
         {
            System.out.print("\nColoca la calificacion ["+i+"]=");
            Califi[i]=Teclado.nextDouble();
         }
         System.out.print("\n Coloca tu nombres:  ");
         Nombre = sc.nextLine(); 
         
         
     }
          
}

class ImprimirTodo
{
    public static void imprimir_Cal(double Califi[],Scanner Teclado,Scanner sc)
    {
        float prom=0,suma=0;
        
       
        for(int i=1;i<=6;i++)
         {
            System.out.printf("\n la calificacion es: %f", Califi[i]);
         }
         for(int i=1;i<=6;i++)
         {
            suma+=Califi[i];
         }
         prom=suma/6;
         System.out.println("\n la calificacion promediada es: "+ prom + "\n");
    }

    public static void imprimir_baja(double Califi[],Scanner Teclado,Scanner sc)
    {
         double baja;
         double mayor;
       
        for(int i=1;i<=6;i++)
         {
            System.out.printf("\n la calificacion es: %f", Califi[i]);
         }
         baja=mayor=Califi[1];
         for(int j=1;j<=6;j++)
         {
            if(Califi[j]>mayor)
            {
            mayor=Califi[j];
            }
            if(Califi[j]<baja)
            {
            baja=Califi[j];
            }
         }
          System.out.println("\n la calificacion mas baja es: "+ baja + "\n" );
    }

    public static void imprimir_mayor(double Califi[],Scanner Teclado,Scanner sc)
    {
       double mayor=0;  
            for(int i=1;i<=6;i++)
            {
               System.out.printf("\n la calificacion es: %f", Califi[i]);
            }
            for(int j=1;j<=6;j++)
            {
               if(Califi[j]>mayor)
               {
               mayor=Califi[j];
               }
            }
         System.out.println("\n la calificacion mayor es: "+ mayor + "\n" );
    }
  

}