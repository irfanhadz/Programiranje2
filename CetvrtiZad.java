import java.util.*; 

 

public class CetvrtiZad { 

public static void main(String[] args) { 

int niz[] = new int[5];  

int suma = 0;  

Scanner ulaz = new Scanner(System.in);  

 

for(int i = 0; i < 5; i++)  

{ 
System.out.println("Unesi broj: ");  

 niz[i] = ulaz.nextInt();  

 suma += niz[i]; 

 } 

 

System.out.println("Suma unesenih brojeva je: " + suma); 

} 

} 