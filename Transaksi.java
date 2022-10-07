

public class Transaksi extends pemesanan
{
   public Transaksi() {
       super();
    }

   public String namaPeserta()  {
    return this.Nama;
   }

   public String tampilkanJenisJasa() {
    return this.pesananJasa;
   }

   public String tampilkanPenyediaJasa() {
    return this.pesananTeam;
   }

   public String tampilkanKeterangan() {
     return this.keterangan;
   }

   public int jumlahkanBiayaJasa() {
      this.Biaya = this.HargaJasa + this.HargaBahan + this.HargaAlat + this.HargaTransportasi;
      return this.Biaya;
   }
}