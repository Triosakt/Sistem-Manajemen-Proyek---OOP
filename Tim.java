
package ui_sistemmanajemenproyek;


public class Tim {
    private int idTim;
    private String namaTim;
    private Proyek idProyek;
    private Proyek namaProyek;

    public Tim(int idTim, String namaTim, Proyek namaProyek) {
        this.idTim = idTim;
        this.namaTim = namaTim;
        this.namaProyek = namaProyek;
    }

    public Tim(String namaTim) {
        this.namaTim = namaTim;
    }

    public int getIdTim() {
        return idTim;
    }

    public void setIdTim(int idTim) {
        this.idTim = idTim;
    }

    public String getNamaTim() {
        return namaTim;
    }

    public void setNamaTim(String namaTim) {
        this.namaTim = namaTim;
    }

    public Proyek getIdProyek() {
        return idProyek;
    }

    public void setIdProyek(Proyek idProyek) {
        this.idProyek = idProyek;
    }

    public Proyek getNamaProyek() {
        return namaProyek;
    }

    public void setNamaProyek(Proyek namaProyek) {
        this.namaProyek = namaProyek;
    }
    
    @Override
    public String toString() {
        return getNamaTim(); // Menggunakan namaTim atau atribut lain sesuai kebutuhan
    }

}


