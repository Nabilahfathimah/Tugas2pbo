import java.util.Scanner;

public class pemesanan
{
   public String Nama;
    public String Alamat;
    public String Telp;
    public String Email;
    public int Jasa;
    public int Team;
    public String keterangan;
    public int HargaJasa;
    public int HargaAlat;
    public int HargaBahan;
    public int HargaTransportasi;
    public String pesananJasa;
    public String pesananTeam;
    public int Biaya;

   public void dataPeserta() {
     Scanner input = new Scanner(System.in);

     System.out.println("--------------------oOo-------------------");
     System.out.println("*Masukan Data Pemesanan*");
     System.out.print("Masukan Nama             ");
     this.Nama = input.nextLine();

     System.out.print("Masukan Alamat           ");
     this.Alamat = input.nextLine();

     System.out.print("Masukan No.Telp          ");
     this.Telp = "+62" + input.nextLine();

     System.out.print("Masukan Email            ");
     this.Email = input.nextLine();
   }

   public void jenisJasa() {
       System.out.println("*Jenis Jasa*");
       System.out.println("1. Cuci Mobil");
       System.out.println("2. Salon Mobil Interior");
       System.out.println("3. Salon Mobil Exterior");
        System.out.println("");
       Scanner input = new Scanner(System.in);
       //System.out.println("");
       System.out.print("Pilih Jasa: ");
       this.Jasa = input.nextInt();
       //System.out.println("");

       if(this.Jasa == 1) {
          this.pesananJasa = "Cuci Mobil";
       } else if(this.Jasa == 2) {
          this.pesananJasa = "Salon Mobil Interior";
       } else if(this.Jasa == 3) {
          this.pesananJasa = "Salon Mobil Exterior";
       } else {
          System.out.print("Jenis Jasa Tidak Tersedia");
       }
       System.out.println("");
   }
   
   public void teamPenyediaJasa() {
       System.out.println("*Team Penyedia Jasa*");
       System.out.println("1. Team Sea (2 Orang)");
       System.out.println("2. Team Mountain (4 Orang)");
       System.out.println("3. Team Forest (5 Orang)");
      System.out.println("");
      Scanner input = new Scanner(System.in);
      //System.out.println("");
       System.out.print("Pilih Jasa: ");
       this.Team = input.nextInt();
      //System.out.println("");

       if(this.Team == 1) {
          this.pesananTeam = "Team Sea (2 Orang)";
       } else if(this.Team == 2) {
          this.pesananTeam = "Team Mountain (4 Orang)";
       } else if(this.Team == 3) {
          this.pesananTeam = "Team Forest (5 Orang)";
       } else {
          System.out.print("Team Layanan Jasa Tidak Tersedia");
       }
      System.out.println("");
   }

   public void keteranganPemesanan() {
    Scanner input = new Scanner(System.in);

    System.out.println("Berikan Keterangan Pemesanan: ");
    this.keterangan = input.nextLine();
  }

   public void biayaPenyediaJasa() {
     Scanner input = new Scanner(System.in);

     System.out.print("Masukan Biaya Penyedia Jasa          Rp. ");
     this.HargaJasa = input.nextInt();

     System.out.print("Masukan Biaya Jasa Alat              Rp. ");
     this.HargaAlat = input.nextInt();

     System.out.print("Masukan Biaya Bahan Jasa             Rp. ");
     this.HargaBahan = input.nextInt();

     System.out.print("Masukan Biaya Transportasi           Rp. ");
     this.HargaTransportasi = input.nextInt();
    System.out.println("--------------------oOo-------------------");
   }
}

