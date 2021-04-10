/**
 *
 * @author AUDY
 */
public class for_each {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // membuat array
        int angka[] = {6,2,32,5,10};
        
        //menggunakan perulangan For each untuk menampilkan angka
        for( int x : angka ) {
            System.out.print(x + " ");
        }
    }
    
}
