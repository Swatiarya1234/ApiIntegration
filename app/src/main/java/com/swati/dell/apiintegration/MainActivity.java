package com.swati.dell.apiintegration;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.TextView;

import java.util.concurrent.TimeUnit;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

public class MainActivity extends AppCompatActivity {
    SearchView searchview;
    TextView author,title,description,url;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        searchview=findViewById(R.id.Search);
        author=findViewById(R.id.Authordeatils);
        title=findViewById(R.id.titledetails);
        description=findViewById(R.id.descriptiondetails);
        url=findViewById(R.id.urldetails);
        searchview.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                findCountry(query);
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {

                findCountry(newText);

                return false;
            }
        });
        changetextcolor(searchview);
        findCountry("IN");


    }

    private void findCountry(String in) {
       Data data= new Data(this);
       data.findnews(in);

    }
    private void changetextcolor(View searchview) {
        if(searchview!=null){
            if(searchview instanceof TextView){
                ((TextView)searchview).setTextColor(Color.BLACK);
            }
            else if(searchview instanceof ViewGroup){
                ViewGroup viewGroup=(ViewGroup)searchview;
                for(int i=0;i<viewGroup.getChildCount();i++){
                    changetextcolor(viewGroup.getChildAt(i));
                }
            }

        }


    }


    public void setvalues(String author1, String headlines1, String description1, String url1) {
           author.setText(author1);
           title.setText(headlines1);
           description.setText(description1);
           url.setText(url1);


    }
}
