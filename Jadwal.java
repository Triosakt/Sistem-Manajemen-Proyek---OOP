
package ui_sistemmanajemenproyek;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;


public class Jadwal {
    private Proyek proyek;
    private Tugas tugas;
    private Tugas tglMulai;
    private Tugas tglSelesai;
    private Status_Tugas statusTugas;

    public Jadwal(Proyek proyek, Tugas tugas, Tugas tglMulai, Tugas tglSelesai, Status_Tugas statusTugas) {
        this.proyek = proyek;
        this.tugas = tugas;
        this.tglMulai = tglMulai;
        this.tglSelesai = tglSelesai;
        this.statusTugas = statusTugas;
    }

    public Proyek getProyek() {
        return proyek;
    }

    public void setProyek(Proyek proyek) {
        this.proyek = proyek;
    }

    public Tugas getTugas() {
        return tugas;
    }

    public void setTugas(Tugas tugas) {
        this.tugas = tugas;
    }

    public Tugas getTglMulai() {
        return tglMulai;
    }

    public void setTglMulai(Tugas tglMulai) {
        this.tglMulai = tglMulai;
    }

    public Tugas getTglSelesai() {
        return tglSelesai;
    }

    public void setTglSelesai(Tugas tglSelesai) {
        this.tglSelesai = tglSelesai;
    }

    public Status_Tugas getStatusTugas() {
        return statusTugas;
    }

    public void setStatusTugas(Status_Tugas statusTugas) {
        this.statusTugas = statusTugas;
    }
    
    public int getIdProyek() {
        return proyek.getIdProyek();
    }

    public String getNamaTugas() {
        return tugas.getNamaTugas();
    }

    public LocalDate getTanggalMulai() {
        return tglMulai.getTanggalMulai();
    }

    public Date getTanggalSelesai() {
        return tglSelesai.getTanggalSelesai();
    }


    

}
