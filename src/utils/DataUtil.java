package src.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * Ao usar o static, queremos dizer que o método pode ser utilizado sem ser instanciado.
 * Métodos estáticos só servem para tomar uma ação, eles não armazenam valor.
 */
public class DataUtil {
    // dd - dia     //MM - mês      //YYYY - ano        //DD - dia no ano
    // HH - horas em 24h //hh - horas em 12h //mm - minutos //ss - segundos
    public static String converterDateParaDataEHora(Date data) {
        SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/YYYY HH:mm");
        return formatador.format(data);
    }

    public static String converterDateParaData(Date data) {
        SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/YYYY");
        return formatador.format(data);
    }

    public static String converterDateParaHora(Date data) {
        SimpleDateFormat formatador = new SimpleDateFormat("HH:mm:ss");
        return formatador.format(data);
    }
}

