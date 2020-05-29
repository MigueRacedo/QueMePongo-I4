package main.java;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public class ClimaService {

    List<Clima> apiClimaList; // si no quiero alguna de la api que estoy usando porque no me combiene economicamente, la saco de la lista
    int temperatura;
    int temperaturaAnterior;
    LocalDate ultimaConsulta;

    public int obtenerClima(String ciudad){

        if (ultimaConsulta != null)
        {
            return temperatura;
        }

        for (int i = 0; i < apiClimaList.size(); i++)
        {
            var temp = apiClimaList.get(i).getWeather(ciudad).get(0).get("Temperature").get(0).get("Value");
            //si retorna algo y no fallo entonces lo almacenamos y guardamos la hora de la ultima consulta para cachear el clima
            //si falla va a agarrar otra api de la lista
            if (temp != null)
            {
                temperaturaAnterior = temperatura;
                temperatura = temp;
                ultimaConsulta = LocalDate.now();
                break;
            }
        }

        return temperatura;

    }
}
