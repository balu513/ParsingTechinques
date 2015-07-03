package com.afbb.balakrishna.parsingtechinques;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.afbb.balakrishna.parsingtechinques.Gson.GsonParser;
import com.afbb.balakrishna.parsingtechinques.Jackson.Student;
import com.afbb.balakrishna.parsingtechinques.Json.JsonParse;
import com.afbb.balakrishna.parsingtechinques.SAX.SAXXMLParser;
import com.afbb.balakrishna.parsingtechinques.Utils.Utils;
import com.afbb.balakrishna.parsingtechinques.XMLPULL.Employee;
import com.afbb.balakrishna.parsingtechinques.XMLPULL.XmlPullParserHandler;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.List;


public class MainActivity extends ActionBarActivity implements View.OnClickListener {

    private Button btn_json;
    private Button btn_gson;
    private Button btn_jackson;
    private Button btn_xmlpull;
    private Button btn_sax;
    private Button btn_dom;
    private String fileData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init() {
        btn_json = (Button) findViewById(R.id.btn_json);
        btn_gson = (Button) findViewById(R.id.btn_gsonparsing);
        btn_jackson = (Button) findViewById(R.id.btn_jackson);
        btn_xmlpull = (Button) findViewById(R.id.btn_xmlpullparser);
        btn_sax = (Button) findViewById(R.id.btn_saxparser);
        btn_dom = (Button) findViewById(R.id.btn_domparser);
        btn_json.setOnClickListener(this);
        btn_gson.setOnClickListener(this);
        btn_jackson.setOnClickListener(this);
        btn_xmlpull.setOnClickListener(this);
        btn_sax.setOnClickListener(this);
        btn_dom.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_saxparser:
                fileData = Utils.getInstance().readFile(this, "file_one.txt");
                new SAXXMLParser().parsingTheXml(fileData);
                break;
            case R.id.btn_gsonparsing:
                fileData = Utils.getInstance().readFile(this, "gsonparse.txt");
                new GsonParser().parseData(fileData);
                break;
            case R.id.btn_jackson:
                fileData = Utils.getInstance().readFile(this, "jackson_employee.txt");
                ObjectMapper mapper = new ObjectMapper();
                try {
                    Student student = mapper.readValue(fileData.getBytes(), Student.class);
                    Log.d("MainActivity", "onClick JACKSON " + student);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            case R.id.btn_json:
                fileData = Utils.getInstance().readFile(this, "json_whether.txt");
                new JsonParse().jsonParsing(fileData);
            case R.id.btn_xmlpullparser:
                fileData = Utils.getInstance().readFile(this, "xmlpull_employee.txt");
                List<Employee> employees = new XmlPullParserHandler().parse(fileData);
                Log.d("MainActivity", "onClick 85 "+employees);

        }

    }


}
