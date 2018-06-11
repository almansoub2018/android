package com.example.android.miwok;

public class Word {
    private String mMiwokTranslation;
    private String mDefaultTranslation;

    public Word(String mDefaultTranslation,String mMiwokTranslation){
        mDefaultTranslation=mDefaultTranslation;
        mMiwokTranslation=mMiwokTranslation;
    }

    public String getDefaultTranslation(){
        return mDefaultTranslation;
    }
    public String getmMiwokTranslation(){
        return mMiwokTranslation;
    }
}
