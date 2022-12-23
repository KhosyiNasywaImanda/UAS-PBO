public class PC extends Komputer implements Mouse , Keyboard , Printer {

    public String merkPC = "Apple iMac Pro MQ2Y2ID/A 27″";
    public String hargaPC = " Rp78.000.000.";
    public String processor = "10th-generation Intel Core i9 processor "; 

    public void hidupkan_os(){
        System.out.println("Sistem sedang menghidupkan PC ");
    }
    public void matikan_os(){
        System.out.println("Sistem sedang mematikan PC ");
    }
    public void klik_kanan(){
        System.out.println("Sistem sedang melakukan klik kanan pada PC ");
    }
    public void klik_kiri(){
        System.out.println("Sistem sedang melakukan klik kiri pada PC ");
    }
    public void klik_enter(){
        System.out.println("Sistem sedang melakukan klik enter pada PC  ");
    }
    public void cetak_data(){
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("Data telah dicetak oleh Netbook  ");
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("Merk PC : " + merkPC);
        System.out.println("Harga PC : " + hargaPC);
        System.out.println("Processor PC : " + processor);
        
    }
     
}
