package com.swati.dell.apiintegration;

import android.view.View;
import android.widget.ListView;
import android.widget.SearchView;

import io.reactivex.subjects.PublishSubject;

public class RxSearchable {
    public static PublishSubject<String> fromView(SearchView Searchview) {

        final PublishSubject<String> subject = PublishSubject.create();

        Searchview.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                subject.onComplete();
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                if(newText == null){
                }
                else
                {
                    subject.onNext(newText);
                }
                return false;
            }
        });
        SearchView.OnCloseListener closeListener = new SearchView.OnCloseListener(){

            @Override
            public boolean onClose() {
                return true;
            }
        };
        return subject;
    }
}
