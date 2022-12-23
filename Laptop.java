public class Laptop extends Komputer implements Mouse , Keyboard , Printer {

    public String merkLaptop = "Asus Vivobook S14 S433 productnation";
    public String hargaLaptop = "Rp13.632.000";
    public String processor = "Intel® Core™ i7-1165G7 Processor 2.8 GHz "; 

  
    public void hidupkan_os(){
        System.out.println("Sistem sedang menghidupkan laptop ");
    }
    public void matikan_os(){
        System.out.println("Sistem sedang mematikan laptop ");
    }
    public void klik_kanan(){
        System.out.println("Sistem sedang melakukan klik kanan pada laptop ");
    }
    public void klik_kiri(){
        System.out.println("Sistem sedang melakukan klik kiri pada laptop ");
    }
    public void klik_enter(){
        System.out.println("Sistem sedang melakukan klik enter pada laptop  ");
    }
    public void cetak_data(){
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("Data telah dicetak oleh laptop  ");
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("Merk Laptop" + merkLaptop);
        System.out.println("Harga Laptop" + hargaLaptop);
        System.out.println("Processor Laptop" + processor);
      
    }
    
}
