package com.example.neaybypeople.ui.timer;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class TimerViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public TimerViewModel() {
        mText = new MutableLiveData<>();
        //.setValue("This is timer fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}