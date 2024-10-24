import java.util.List;
import java.util.Map;

public interface ServiciiClient {
    void aplicaDiscount(float discount);
    List<Comanda> vizualizeazaIstoricComenzi(int idClient);
    Map<String, Object> obtineStatisticiClient(int idClient);
}
