package com.afbb.balakrishna.parsingtechinques.SAX;

import android.util.Log;

import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.DefaultHandler;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParserFactory;


public class SAXXMLParser {
    public void parsingTheXml(String fileData) {
        InputStream is = new ByteArrayInputStream(fileData.getBytes(StandardCharsets.UTF_8));
        try {
            XMLReader xmlReader = SAXParserFactory.newInstance().newSAXParser().getXMLReader();
            MyXMlHandler xMlHandler = new MyXMlHandler();
            xmlReader.setContentHandler(xMlHandler);
            xmlReader.parse(new InputSource(is));
            List<Employee> employees = xMlHandler.getEmployees();
            Log.d("SAXXMLParser", "parsingTheXml 60 " + employees);

        } catch (SAXException e) {
            e.printStackTrace();
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private class MyXMlHandler extends DefaultHandler {

        List<Employee> employees;
        Employee tempEmployee;
        String tmpVal;

        private MyXMlHandler() {
            employees = new ArrayList<Employee>();
        }

        public List<Employee> getEmployees() {
            return employees;
        }

        @Override
        public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
            super.startElement(uri, localName, qName, attributes);
            tmpVal = "";
            if (qName.equalsIgnoreCase("employee")) {
                tempEmployee = new Employee();
            }
        }

        @Override
        public void characters(char[] ch, int start, int length) throws SAXException {
            super.characters(ch, start, length);
            tmpVal = new String(ch, start, length);
        }

        @Override
        public void endElement(String uri, String localName, String qName) throws SAXException {
            super.endElement(uri, localName, qName);
            if (qName.equalsIgnoreCase("employee")) {
                employees.add(tempEmployee);
            } else if (qName.equalsIgnoreCase("name")) {
                tempEmployee.setName(tmpVal);
            } else if (qName.equalsIgnoreCase("salary")) {
                tempEmployee.setSalary(tmpVal);
            }

        }
    }


}
