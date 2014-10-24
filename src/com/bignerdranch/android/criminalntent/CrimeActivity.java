package com.bignerdranch.android.criminalntent;


import android.support.v4.app.Fragment;


public class CrimeActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
    	return new CrimeFragment();
    }

}
