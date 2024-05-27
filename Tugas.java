package ui_sistemmanajemenproyek;

import java.sql.Date;
import java.time.LocalDate;
import javafx.beans.property.SimpleObjectProperty;

public class Tugas {
    private int idTugas;
    private Anggota anggota;
    private String namaTugas;
    private LocalDate tanggalMulai;
    private Date tanggalSelesai;

    public Tugas(int idTugas, Anggota anggota, String namaTugas, LocalDate tanggalMulai, Date tanggalSelesai) {
        this.idTugas = idTugas;
        this.anggota = anggota;
        this.namaTugas = namaTugas;
        this.tanggalMulai = tanggalMulai;
        this.tanggalSelesai = tanggalSelesai;
    }
    
    public Tugas(String namaTugas) {
        this.namaTugas = namaTugas;
    }

    public Tugas(LocalDate tanggalMulai) {
        this.tanggalMulai = tanggalMulai;
    } 

    public Tugas(Date tanggalSelesai) {
        this.tanggalSelesai = tanggalSelesai;
    }
    
    

    public int getIdTugas() {
        return idTugas;
    }

    public void setIdTugas(int idTugas) {
        this.idTugas = idTugas;
    }

    public Anggota getAnggota() {
        return anggota;
    }

    public void setNamaAnggota(Anggota anggota) {
        this.anggota = anggota;
    }

    public String getNamaTugas() {
        return namaTugas;
    }

    public void setNamaTugas(String namaTugas) {
        this.namaTugas = namaTugas;
    }

    public LocalDate getTanggalMulai() {
        return tanggalMulai;
    }

    public void setTanggalMulai(LocalDate tanggalMulai) {
        this.tanggalMulai = tanggalMulai;
    }

    public Date getTanggalSelesai() {
        return tanggalSelesai;
    }

    public void setTanggalSelesai(Date tanggalSelesai) {
        this.tanggalSelesai = tanggalSelesai;
    }
    
//    @Override
//    public String toString() {
//        return namaAnggota != null ? namaAnggota.toString() : "";
//    }
//
//    public SimpleObjectProperty<Anggota> getPropertyIdAnggota() {
//        return new SimpleObjectProperty<>(namaAnggota);
//    }


}
