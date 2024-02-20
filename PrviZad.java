import java.util.*; 

public class PrviZad { 

public static void main(String[] args) { 

int n; 

 Scanner ulaz = new Scanner(System.in); 

 

System.out.println("Unesite broj:"); 

 n = ulaz.nextInt(); 

  

 System.out.println("Brojevi izmedju 1 i " + n + " koji su djeljivi sa sumom svojih cifara: "); 

 for (int i = 1; i <= n; i++) { 

 if (i % sumaCifara(i) == 0) { 

 System.out.println(i); 

 } 

} 

 } 
 public static int sumaCifara(int broj) { 

 int suma = 0; 
 while (broj != 0) { 

 suma += broj % 10; 

 broj /= 10; 

 } 

 return suma; 
 } 

} 