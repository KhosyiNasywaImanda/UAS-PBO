final class KomputerCetak {
    final static void cetak(Komputer[] obj){
        for(Komputer komputer : obj){
            if(komputer instanceof PC){
                System.out.println("------------------------------");
                System.out.println("1. Sistem pada perangkat PC");
                System.out.println("------------------------------");
                komputer.hidupkan_os();
                komputer.matikan_os();
                komputer.klik_kanan();
                komputer.klik_kiri();
                komputer.klik_enter();
                komputer.cetak_data();
                System.out.println("");
            }else if(komputer instanceof Netbook){
                System.out.println("------------------------------");
                System.out.println("2. Sistem pada perangkat Netbook");
                System.out.println("--------------------------------");
                komputer.hidupkan_os();
                komputer.matikan_os();
                komputer.klik_kanan();
                komputer.klik_kiri();
                komputer.klik_enter();
                komputer.cetak_data();
                System.out.println("");
            }else if(komputer instanceof Laptop){
                System.out.println("------------------------------");
                System.out.println("3. Sistem pada perangkat Laptop");
                System.out.println("--------------------------------");
                komputer.hidupkan_os();
                komputer.matikan_os();
                komputer.klik_kanan();
                komputer.klik_kiri();
                komputer.klik_enter();
                komputer.cetak_data();
                System.out.println("");
            }
        }
    }
    public static void main(String[] args) {
        PC pc = new PC();
        Netbook netbook = new Netbook();
        Laptop laptop = new Laptop();
        Komputer[] komputer = {pc , netbook , laptop};

        System.out.println("==============================================================");
        System.out.println("\t\t\t  UAS PRAKTIKUM PBO  \t\t");
        System.out.println("\t\t  by : Khosyi Nasywa Imanda \t");
        System.out.println("==============================================================");
        cetak(komputer);
        
    }
}
