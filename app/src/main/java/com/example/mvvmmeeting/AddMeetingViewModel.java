package com.example.mvvmmeeting;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;
import android.content.Context;
import android.content.Intent;

import com.example.mvvmmeeting.Activities.AddMeetingActivity;
import com.example.mvvmmeeting.Models.MeetingModel;

import ir.hamsaa.persiandatepicker.PersianDatePickerDialog;

public class AddMeetingViewModel extends ViewModel {


    Context context;

    public MutableLiveData<String> meetingName = new MutableLiveData<>();
    public MutableLiveData<String> meetingInformation = new MutableLiveData<>();
    public MutableLiveData<String> meetingDate = new MutableLiveData<>();

    public AddMeetingViewModel() {
    }

    public MutableLiveData<MeetingModel> meetingModelMutableLiveData;


    public LiveData<MeetingModel>getMeetingModelLiveData() {
        if (meetingModelMutableLiveData == null) {
            meetingModelMutableLiveData = new MutableLiveData<>();
        }
        return meetingModelMutableLiveData;
    }

    public void OnClick(){
        MeetingModel meetingModel = new MeetingModel(meetingName.getValue(),
                meetingInformation.getValue(),
                meetingDate.getValue());
        meetingModelMutableLiveData.setValue(meetingModel);
    }

    public void OnBtnGetDateClick(){
     /*   Intent intent = new Intent(context, AddMeetingActivity.class);
        context.startActivity(intent);*/
    }

}
