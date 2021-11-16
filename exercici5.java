import java.util.Scanner;
public class exercici5 {
    public static void main(String[] args) {

    char caracter;
    int num;
    int multi = 0;
    int contador = 2;
        
    Scanner teclat = new Scanner (System.in);
    System.out.println("introdueixi caracter");
    caracter = teclat.nextInt();
       
    
    while( contador<=10){

        System.out.println("el caracter es " + caracter);
        System.out.println("introdueixi caracter");
        caracter = teclat.next().charAt(0);
    if(caracter =='a' || caracter=='A'){
        System.out.println("A numero " + contador);   
        contador++;
            
        }
        if(contador>10){
            System.out.println("has superat 10 'A'");
        }
     
           

}
System.out.println("introdueixi caracter");

}
}
