package net.tanoshi.example.shared.test;

import org.junit.Test;

import com.google.gwt.junit.client.GWTTestCase;
import com.google.gwt.xml.client.Document;
import com.google.gwt.xml.client.Element;
import com.google.gwt.xml.client.XMLParser;

public class DocumentGwtTest extends GWTTestCase {

    @Test
    public void testDocumentToString() {
        Document document = XMLParser.createDocument();
        Element e = document.createElement("ThisIsATest");
        e.appendChild(document.createTextNode("SomeTextNode"));
        document.appendChild(e);

        assertEquals("<ThisIsATest>SomeTextNode</ThisIsATest>", document.toString());
    }

    @Test
    public void testElementToString() {
        Document document = XMLParser.createDocument();
        Element e = document.createElement("ThisIsATest");
        e.appendChild(document.createTextNode("SomeTextNode"));
        document.appendChild(e);

        assertEquals("<ThisIsATest>SomeTextNode</ThisIsATest>", e.toString());
    }

    @Override
    public String getModuleName() {
        return "net.tanoshi.example.GwtUnitExample";
    }

}
