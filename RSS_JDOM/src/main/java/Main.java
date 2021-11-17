import jdom.JDOMController;
import jdom.model.Noticia;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException, JDOMException {
        String OUTPUT_XML = System.getProperty("user.dir") +File.separator+"data" + File.separator + "holi.xml";
        String xmlDescargado = System.getProperty("user.dir") +File.separator+"data"+File.separator+"portada.xml";
        System.out.println("Cargamos nuestros Datos usando JDOM desde fichero");
        JDOMController controller = JDOMController.getInstance(xmlDescargado);
        controller.loadData();
        controller.writeXMLFile(OUTPUT_XML);
        System.out.println();


        for (Noticia noticia: controller.getNoticias()){
            noticia.printData();

        }
        System.out.println("SÓLO LOS CREADORES, POR XPATH");
        for (String creador: controller.getCreadores()){
            System.out.println(creador);

        }







    }

}
