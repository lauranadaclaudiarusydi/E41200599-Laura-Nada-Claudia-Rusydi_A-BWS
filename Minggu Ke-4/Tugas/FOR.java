package tugasMinggu4;

/**
 *
 * @author AUDY
 */
import java.util.Scanner;
public class FOR {
    public static void main(String[] args) {
        int n;
        Scanner scan = new Scanner(System.in);
        //perintah di awal
        System.out.print("Masukkan nilai max: ");
        n=scan.nextInt();
        //masukkan perulangan for
        for(int i=2; i <= n; i += 2){
            System.out.print(i + " ");
            
        }
    }
    
}
