import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Map;

public class Comanda implements ServiciiClient{
    private int id;
    private int numar;
    private double valoareTotala;
    private Date dataPlasare;
    private String adresaLivrare;
    private String tipPlata;
    private int idClient;
    private int nrProduse;
    private int[] idProduse;

    public Comanda() {
    }

    public Comanda(int id, int numar, double valoareTotala, Date dataPlasare, String adresaLivrare, String tipPlata, int idClient, int nrProduse, int[] idProduse) {
        this.id = id;
        this.numar = numar;
        this.valoareTotala = valoareTotala;
        this.dataPlasare = dataPlasare;
        this.adresaLivrare = adresaLivrare;
        this.tipPlata = tipPlata;
        this.idClient = idClient;
        this.nrProduse = nrProduse;
        this.idProduse = idProduse;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumar() {
        return numar;
    }

    public void setNumar(int numar) {
        this.numar = numar;
    }

    public double getValoareTotala() {
        return valoareTotala;
    }

    public void setValoareTotala(double valoareTotala) {
        this.valoareTotala = valoareTotala;
    }

    public Date getDataPlasare() {
        return dataPlasare;
    }

    public void setDataPlasare(Date dataPlasare) {
        this.dataPlasare = dataPlasare;
    }

    public String getAdresaLivrare() {
        return adresaLivrare;
    }

    public void setAdresaLivrare(String adresaLivrare) {
        this.adresaLivrare = adresaLivrare;
    }

    public String getTipPlata() {
        return tipPlata;
    }

    public void setTipPlata(String tipPlata) {
        this.tipPlata = tipPlata;
    }

    public int getIdClient() {
        return idClient;
    }

    public void setIdClient(int idClient) {
        this.idClient = idClient;
    }

    public int getNrProduse() {
        return nrProduse;
    }

    public void setNrProduse(int nrProduse) {
        this.nrProduse = nrProduse;
    }

    public int[] getIdProduse() {
        return idProduse;
    }

    public void setIdProduse(int[] idProduse) {
        this.idProduse = idProduse;
    }

    @Override
    public String toString() {
        return "Comanda{" +
                "id=" + id +
                ", numar=" + numar +
                ", valoareTotala=" + valoareTotala +
                ", dataPlasare=" + dataPlasare +
                ", adresaLivrare='" + adresaLivrare + '\'' +
                ", tipPlata='" + tipPlata + '\'' +
                ", idClient=" + idClient +
                ", nrProduse=" + nrProduse +
                ", idProduse=" + Arrays.toString(idProduse) +
                '}';
    }

    @Override
    public void aplicaDiscount(float discount) {

    }

    @Override
    public List<Comanda> vizualizeazaIstoricComenzi(int idClient) {
        return null;
    }

    @Override
    public Map<String, Object> obtineStatisticiClient(int idClient) {
        return null;
    }
}
