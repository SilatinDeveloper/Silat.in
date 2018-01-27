package uinbdg.developer.silatin.Model;

/**
 * Created by Nikko Eka Saputra on 27/01/2018.
 */

public class Sanggar {

    private int imageSanggar = NO_IMAGE_PROVIDED;
    private String namaSanggar;
    private String alamatSanggar;
    private String noTelpSanggar;
    private double jarakSanggar;

    private static final int NO_IMAGE_PROVIDED = -1;

    public Sanggar(int imageSanggar, String namaSanggar, String alamatSanggar, String noTelpSanggar, double jarakSanggar) {
        this.imageSanggar = imageSanggar;
        this.namaSanggar = namaSanggar;
        this.alamatSanggar = alamatSanggar;
        this.noTelpSanggar = noTelpSanggar;
        this.jarakSanggar = jarakSanggar;
    }

    public int getImageSanggar() {
        return imageSanggar;
    }

    public String getNamaSanggar() {
        return namaSanggar;
    }

    public String getAlamatSanggar() {
        return alamatSanggar;
    }

    public String getNoTelpSanggar() {
        return noTelpSanggar;
    }

    public double getJarakSanggar() {
        return jarakSanggar;
    }

    public boolean hasImage() {
        return imageSanggar != NO_IMAGE_PROVIDED;
    }
}
