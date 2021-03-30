package tugasMinggu4;

/**
 *
 * @author AUDY
 */
import java.util.Scanner;
public class TugasC {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.print("Masukkan banyaknya data nilai = ");
       int banyakData = input.nextInt();
       //membuat array baru untuk menampung nilai
       int nilai[] = new int[banyakData];
       
       //mencari total nilai
       int total =0;
       for (int i=0; i<banyakData; i++){
           System.out.print("Masukkan data nilai ke-" + (i+1)+"=");
           nilai[i] = input.nextInt();
           total+= nilai[i];
           
       }
       //mencari max dan min
       int max = nilai[0];
       int min = nilai[0];
       for(int i =0; i<banyakData; i++){
           if(min > nilai[i]){
               min = nilai[i];   
           }
           else if (max < nilai[i] ){
               max = nilai[i];
           }
       }
       int ratarata = total/banyakData;
       
       //output
       System.out.println(" ");
       System.out.println("Nilai minimum = " + min);
       System.out.println("Nilai maximum = " + max);
       System.out.println("Nilai rata-ratanya adalah = " +ratarata);
       
            
            
    }
    
}
