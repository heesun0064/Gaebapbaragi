package com.example.dsm2017.gaebapbaragi;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class InfoDrugActivity extends AppCompatActivity {

    RecyclerView infoDrugActivity;
    RecyclerView.Adapter infoDrugAdapter;
    RecyclerView.LayoutManager infoDrugLayoutManager;

    private ArrayList<item> infoDrugArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_infodrug);
        infoDrugActivity = (RecyclerView) findViewById(R.id.infodrug_recycler);

        infoDrugArrayList = new ArrayList<>();
        infoDrugArrayList.add(new item("약1","01/28"));
        infoDrugArrayList.add(new item("약2","02/28"));
        infoDrugArrayList.add(new item("약3","03/28"));
        infoDrugArrayList.add(new item("약4","04/28"));
        infoDrugArrayList.add(new item("약5","05/28"));
        infoDrugArrayList.add(new item("약6","06/28"));
        infoDrugArrayList.add(new item("약7","07/28"));
        infoDrugArrayList.add(new item("약8","07/28"));
        infoDrugArrayList.add(new item("약9","07/28"));
        infoDrugArrayList.add(new item("약10","07/28"));
        infoDrugArrayList.add(new item("약11","07/28"));
        infoDrugArrayList.add(new item("약12","07/28"));
        infoDrugArrayList.add(new item("약13","07/28"));
        infoDrugArrayList.add(new item("약14","07/28"));

//        infoDrugActivity.setHasFixedSize(true);

        infoDrugLayoutManager = new LinearLayoutManager(this);
        infoDrugActivity.setLayoutManager(infoDrugLayoutManager);

        infoDrugAdapter = new InfoDrugAdapter(infoDrugArrayList);
        infoDrugActivity.setAdapter(infoDrugAdapter);
    }

    public class item {
        String drugdate;
        String drugcnt;

        public item(String drugdate, String drugcnt) {
            this.drugdate = drugdate;
            this.drugcnt = drugcnt;
        }

        public String getDrugdate() {
            return drugdate;
        }

        public void setDrugdate(String drugdate) {
            this.drugdate = drugdate;
        }

        public String getDrugcnt() {
            return drugcnt;
        }

        public void setDrugcnt(String drugcnt) {
            this.drugcnt = drugcnt;
        }
    }
}