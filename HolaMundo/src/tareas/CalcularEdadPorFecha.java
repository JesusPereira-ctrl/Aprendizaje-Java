package tareas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class CalcularEdadPorFecha {
    public static void main() {
        Scanner s = new Scanner(System.in);
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");

        try {
            System.out.println("Ingrese su fecha de nacimiento en formato yyyy-MM-dd");

            Calendar fechaNacimiento = Calendar.getInstance();
            fechaNacimiento.setTime(df.parse(s.nextLine()));

            Calendar fechaActual = Calendar.getInstance();

            fechaActual.setTime(new Date());

            Integer anioNacimiento = fechaNacimiento.get(Calendar.YEAR);
            Integer anioActual = fechaActual.get(Calendar.YEAR);

            Integer mesNacimiento = fechaNacimiento.get(Calendar.MONTH);
            Integer mesActual = fechaActual.get(Calendar.MONTH);

            Integer diaNacimiento = fechaNacimiento.get(Calendar.DAY_OF_MONTH);
            Integer diaActual = fechaActual.get(Calendar.DAY_OF_MONTH);

            Boolean yaPasoMiCumple = false;

            if (mesActual > mesNacimiento ) {
                yaPasoMiCumple = true;
            } else if (mesActual == mesNacimiento && diaActual >= diaNacimiento) {
                yaPasoMiCumple = true;
            }


            if (!yaPasoMiCumple) {
                anioActual -= 1;
            }

            Integer edad = anioActual - anioNacimiento;

            System.out.println("Tienes " + edad + " años de edad!");
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

        Calendar calendar = Calendar.getInstance();
    }
}
