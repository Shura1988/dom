package str449BlinovElectroinstrumenti;

import org.w3c.dom.*;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.TransformerFactoryConfigurationError;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.FileOutputStream;
import java.io.IOException;


/**1. Создать файл XML и соответствующую ему схему XSD.
4. Создать приложение для разбора XML-документа и инициализации кол-
лекции объектов информацией из XML-файла. Для разбора использовать
SAX, DOM и StAX парсеры. Для сортировки объектов использовать интер-
фейс Comparator.
5. Произвести проверку XML-документа с привлечением XSD.
6. Определить метод, производящий преобразование разработанного XML-
документа в документ, указанный в каждом задании.
**
 Электроинструменты.
 Электроинструменты можно структурировать по следующей схеме:
 ——Model — название модели;
 ——Handy — одно- или двуручное;
 ——Origin — страна производства;
 ——TC (должно быть несколько) — технические характеристики: энергопо-
 требление (низкое, среднее, высокое), производительность (в единицах
 в час), возможность автономного функционирования и т. д.;
 ——Material — материал изготовления.
 Корневой элемент назвать PowerTools или Power.
 С помощью XSL преобразовать XML-файл в формат XML, при выводе
 корневым элементом сделать страну производства.
*/

public class Electrotechic {
    public static void main(String[] args) {
        try {
            DocumentBuilder catalog = DocumentBuilderFactory.newInstance().newDocumentBuilder();
            Document doc = catalog.parse("Electro.xml");
            Node root = doc.getDocumentElement();

            System.out.println("List Electroinstrument :");
           // System.out.println();
            NodeList electroTecnics = root.getChildNodes();
            for (int i = 0; i < electroTecnics.getLength(); i++) {
                Node electroTecnic = electroTecnics.item(i);
                if (electroTecnic.getNodeType() != Node.TEXT_NODE) {
                    NodeList tecnics = electroTecnic.getChildNodes();
                    for (int j = 0; j < tecnics.getLength(); j++) {
                        Node tecnic = tecnics.item(j);
                        if (tecnic.getNodeType() != Node.TEXT_NODE) {
                            NodeList manual = tecnic.getChildNodes();
                            for (int k = 0; k < manual.getLength(); k++) {
                                Node manuals = manual.item(k);
                                if (manuals.getNodeType() != Node.TEXT_NODE) {
                                    System.out.print(manuals.getNodeName() + " : " + manuals.getChildNodes().item(0).getTextContent());System.out.println();
                                }

                            }System.out.println(tecnic.getNodeName() + " : "+ tecnic.getChildNodes().item(0).getTextContent());
                            }
                    }System.out.println(electroTecnic.getNodeName() + " : " + electroTecnic.getChildNodes().item(0).getTextContent());
                }
            }
          //  addElectroistrument(doc);
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
  /*private static void addElectroistrument(Document doc) throws TransformerFactoryConfigurationError, DOMException{
       Node root = doc.getDocumentElement();
    Element PowerTool = doc.createElement("PowerTool");
    Element Model = doc.createElement("Model");
    Model.setTextContent(" Электролобзик Wortex JS 8008-2 LE");
    Element Handi = doc.createElement("Handi");
    Handi.setTextContent("Одноручный");
    Element Origin = doc.createElement("Origin");
    Origin.setTextContent(" Chaina");
    Element Manual = doc.createElement("Manual");
    Element Energy_consumption= doc.createElement("Energy_consumption");
    Energy_consumption.setTextContent(" Среднее ");
    Element Power = doc.createElement(" Power ");
    Power.setTextContent(" 850Vt ");
    Element Time_working = doc.createElement("Time_working");
    Time_working.setTextContent("7h");
    Element Material = doc.createElement("Material");
    Material.setTextContent("Plastic");
    Manual.appendChild(Energy_consumption);
    Manual.appendChild(Power);
    Manual.appendChild(Time_working);

    root.appendChild(PowerTool);
    writeDocument(doc);
}
private static void  writeDocument(Document doc) throws TransformerFactoryConfigurationError{
    try{
        Transformer tr = TransformerFactory.newInstance().newTransformer();
        DOMSource source = new DOMSource(doc);
        FileOutputStream fos = new FileOutputStream("new.xml");
        StreamResult result = new StreamResult(fos);
        tr.transform(source, result);

    }catch (TransformerException | IOException e){
        e.printStackTrace(System.out);
    }


    }
}*/



