package uinbdg.developer.silatin.Model;

/**
 * Created by Nikko Eka Saputra on 27/01/2018.
 */

public class Pelatih {

    private int imagePelatih = NO_IMAGE_PROVIDED;
    private String namaPelatih;
    private String aliranPelatih;
    private String alamatPelatih;
    private String noTelpPelatih;

    private static final int NO_IMAGE_PROVIDED = -1;

    public Pelatih(int imagePelatih, String namaPelatih, String aliranPelatih, String alamatPelatih, String noTelpPelatih) {
        this.imagePelatih = imagePelatih;
        this.namaPelatih = namaPelatih;
        this.aliranPelatih = aliranPelatih;
        this.alamatPelatih = alamatPelatih;
        this.noTelpPelatih = noTelpPelatih;
    }

    public int getImagePelatih() {
        return imagePelatih;
    }

    public String getNamaPelatih() {
        return namaPelatih;
    }

    public String getAliranPelatih() {
        return aliranPelatih;
    }

    public String getAlamatPelatih() {
        return alamatPelatih;
    }

    public String getNoTelpPelatih() {
        return noTelpPelatih;
    }

    public boolean hasImage() {
        return imagePelatih != NO_IMAGE_PROVIDED;
    }
}
