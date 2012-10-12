package net.tanoshi.example.shared.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.google.gwt.xml.client.Document;
import com.google.gwt.xml.client.Element;
import com.google.gwt.xml.client.XMLParser;
import com.googlecode.gwt.test.GwtModule;
import com.googlecode.gwt.test.GwtTest;

@GwtModule("net.tanoshi.example.GwtUnitExample")
public class DocumentTest extends GwtTest {
    
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
}
