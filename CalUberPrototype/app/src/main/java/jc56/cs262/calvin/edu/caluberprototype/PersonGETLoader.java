package jc56.cs262.calvin.edu.caluberprototype;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.AsyncTaskLoader;
import android.util.Log;

public class PersonGETLoader extends AsyncTaskLoader<String> {

    private static final String LOG_TAG = PersonGETLoader.class.getSimpleName();
    private String mQueryString;

    @Override
    protected void onStartLoading() {
        super.onStartLoading();
        forceLoad();
    }

    public PersonGETLoader(@NonNull Context context, String mQueryString) {
        super(context);
        this.mQueryString = mQueryString;
    }

    /**
     * Method performs the task in the background
     *
     * @return
     */
    @Nullable
    @Override
    public String loadInBackground() {
        if(mQueryString.length() == 0) {
            Log.e(LOG_TAG, "getPersonListInfo called");
            return PersonNetworkUtils.getPersonListInfo(mQueryString);
        } else {
            Log.e(LOG_TAG, "getPersonIdInfo called");
            return PersonNetworkUtils.getPersonIdInfo(mQueryString);
        }
    }
}
