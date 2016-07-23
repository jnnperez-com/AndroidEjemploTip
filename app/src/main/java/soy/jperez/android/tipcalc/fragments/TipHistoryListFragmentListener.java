package soy.jperez.android.tipcalc.fragments;

import soy.jperez.android.tipcalc.models.TipRecord;

/**
 * Created by Jonatan on 12/07/2016.
 */
public interface TipHistoryListFragmentListener {
    void addToList(TipRecord record);
    void clearList();
}
