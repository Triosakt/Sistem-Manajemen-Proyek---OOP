
package ui_sistemmanajemenproyek;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.util.List;

public class Proyek {
    private int idProyek;
    private String namaProyek;
    private String tujuanProyek;
    private LocalDate deadline;
    private BigDecimal anggaranProyek;

    public Proyek(int idProyek, String namaProyek, String tujuanProyek, LocalDate deadline, BigDecimal anggaranProyek) {
        this.idProyek = idProyek;
        this.namaProyek = namaProyek;
        this.tujuanProyek = tujuanProyek;
        this.deadline = deadline;
        this.anggaranProyek = anggaranProyek;
    }

    public Proyek(int idProyek) {
        this.idProyek = idProyek;
    }
    
    

    public Proyek(String namaProyek) {
        this.namaProyek = namaProyek;
    }

    public int getIdProyek() {
        return idProyek;
    }

    public void setIdProyek(int idProyek) {
        this.idProyek = idProyek;
    }

    public String getNamaProyek() {
        return namaProyek;
    }

    public void setNamaProyek(String namaProyek) {
        this.namaProyek = namaProyek;
    }

    public String getTujuanProyek() {
        return tujuanProyek;
    }

    public void setTujuanProyek(String tujuanProyek) {
        this.tujuanProyek = tujuanProyek;
    }

    public LocalDate getDeadline() {
        return deadline;
    }

    public void setDeadline(LocalDate deadline) {
        this.deadline = deadline;
    }

    public BigDecimal getAnggaranProyek() {
        return anggaranProyek;
    }

    public void setAnggaranProyek(BigDecimal anggaranProyek) {
        this.anggaranProyek = anggaranProyek;
    }

//    public void tambahAnggota(Tim tim, Anggota anggota) {
//        tim.tambahAnggota(anggota);
//    }

//    public void alokasiTugas(Tugas tugas, Tim tim) {
//        tim.alokasiTugas(tugas);
//    }
}

