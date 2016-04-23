package deepmehtait.com.materialdesignnavigationdrawer.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;

import java.util.ArrayList;
import java.util.List;

import deepmehtait.com.materialdesignnavigationdrawer.R;

/**
 * Created by Deep on 19-Apr-16.
 */
public class MainActivity extends AppCompatActivity {
    DrawerLayout drawerLayout;
    Toolbar toolbar;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar=(Toolbar)findViewById(R.id.toolbar);
        drawerLayout=(DrawerLayout)findViewById(R.id.drawer_layout);
        recyclerView=(RecyclerView)findViewById(R.id.drawer_recyclerView);
        setSupportActionBar(toolbar);
       // getActionBar().setTitle("Dashboard");

        ActionBarDrawerToggle actionBarDrawerToggle=new ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.dashboard,R.string.dashboard);

        drawerLayout.addDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.syncState();
        setTitle("Main Activity");
        //toolbar.setTitle("Dashboard");
        //drawerLayout.syncState();
        List<String> rows = new ArrayList<>();
        rows.add("Dashboard");
        rows.add("Settings");


        DrawerAdapter drawerAdapter = new DrawerAdapter(getApplicationContext(),rows,"deep@gmail.com","https:");
        recyclerView.setAdapter(drawerAdapter);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));


    }
}
