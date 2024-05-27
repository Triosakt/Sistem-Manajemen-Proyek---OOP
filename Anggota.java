
package ui_sistemmanajemenproyek;

public class Anggota {
    private int idAnggota;
    private String namaAnggota;
    private Tim tim;

    public Anggota(int idAnggota, String namaAnggota, Tim tim) {
        this.idAnggota = idAnggota;
        this.namaAnggota = namaAnggota;
        this.tim = tim;
    }

    public Anggota(String namaAnggota) {
        this.namaAnggota = namaAnggota;
    }

    public int getIdAnggota() {
        return idAnggota;
    }

    public void setIdAnggota(int idAnggota) {
        this.idAnggota = idAnggota;
    }

    public String getNamaAnggota() {
        return namaAnggota;
    }

    public void setNamaAnggota(String namaAnggota) {
        this.namaAnggota = namaAnggota;
    }

    public Tim getTim() {
        return tim;
    }

    public void setTim(Tim tim) {
        this.tim = tim;
    }
    
    @Override
    public String toString() {
        return getNamaAnggota(); // Menggunakan namaTim atau atribut lain sesuai kebutuhan
    }
//    
//    public String toStringIdAnggota() {
//        return String.valueOf(idAnggota);
//    }
    
        
    
    //    public String getPeran() {
//        return peran;
//    }
//
//    public void setPeran(String peran) {
//        this.peran = peran;
//    }
}
