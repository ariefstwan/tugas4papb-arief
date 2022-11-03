package com.example.tugas4papbg.database;

import android.os.Parcel;

public interface Parceable {
    int describeContents();

    void writeToParcel(Parcel dest, int flags);
}
