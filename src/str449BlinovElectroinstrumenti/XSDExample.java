package str449BlinovElectroinstrumenti;

import org.xml.sax.SAXException;
import javax.xml.XMLConstants;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;
import java.io.File;
import java.io.IOException;

public class XSDExample {
    public static void main(String[] args) {
        boolean answer = validateXMLShema("Electro.xsd" , "Electro.XML");
        System.out.println("Result :" + answer);

    }

    private static boolean validateXMLShema(String xsdPath, String xmlPath) {
        try {
            SchemaFactory factory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
            Schema schema = factory.newSchema(new File(xsdPath));
            Validator validator = schema.newValidator();
            validator.validate(new StreamSource(new File(xmlPath)));
        }catch (IOException | SAXException e){
            System.out.println("Exeption" + e.getMessage());
            return false;

        }return true;
    }



}
