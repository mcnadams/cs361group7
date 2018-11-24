package com.pronunciation_match.pronunciationmatch;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import java.util.List;

public class PhonemeAdapter extends ArrayAdapter<Phoneme> {
    public PhonemeAdapter(@NonNull Context context, int resource, @NonNull List<Phoneme> phonemes) {
        super(context, resource, phonemes);
    }
}
