public class Netbook extends Komputer implements Mouse , Keyboard , Printer {

    public String merkNetbook = "IdeaPad Flex 3i";
    public String hargaNetbook = "Rp 6.353.000,00";
    public String processor = "Intel Celeron N4020 "; 

    public void hidupkan_os(){
        System.out.println("Sistem sedang menghidupkan Netbook ");
    }
    public void matikan_os(){
        System.out.println("Sistem sedang mematikan Netbook ");
    }
    public void klik_kanan(){
        System.out.println("Sistem sedang melakukan klik kanan pada Netbook ");
    }
    public void klik_kiri(){
        System.out.println("Sistem sedang melakukan klik kiri pada Netbook ");
    }
    public void klik_enter(){
        System.out.println("Sistem sedang melakukan klik enter pada Netbook  ");
    }
    public void cetak_data(){
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("Data telah dicetak oleh Netbook  ");
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("Merk Netbook : " + merkNetbook);
        System.out.println("Harga Netbook : " + hargaNetbook);
        System.out.println("Processor Netbook : " + processor);
        
    }
    
}
