package Servlets;

import static com.sun.corba.se.spi.presentation.rmi.StubAdapter.request;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author junio
 */
public class LeerArhivoTexto extends HttpServlet {

    public static String metLeerConsola() {
        InputStreamReader vISR = new InputStreamReader(System.in);
        BufferedReader vBR = new BufferedReader(vISR);

        try {
            return vBR.readLine();
        } catch (IOException e) {
            return "";
        }
    }

    public static void main(String[] args) {
        System.out.println("Introduzca el nombre del archivo: (Ej: c:\\directorio\\archivo.txt) ");

        String vRuta = metLeerConsola();
        File vArchivo = new File(vRuta);

        if (vArchivo.exists()) {
            try {
                try (BufferedReader vBR2 = new BufferedReader(new FileReader(vArchivo))) {
                    String vRegistro;
                    while ((vRegistro = vBR2.readLine()) != null) {
                        System.out.println(vRegistro);
                    }
                }
            } catch (IOException e) {
                System.out.println("Se ha producido un error " + e.getMessage());
            }
        }
    }
}