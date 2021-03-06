package me.jwenzel.habittracker.database.async_tasks;

import android.os.AsyncTask;

import me.jwenzel.habittracker.business_objects.BaseHabit;
import me.jwenzel.habittracker.business_objects.DailyHabit;
import me.jwenzel.habittracker.business_objects.RegularHabit;
import me.jwenzel.habittracker.database.DatabaseManager;


public class HabitInsertAsyncTask extends AsyncTask<BaseHabit, Void, Boolean> {

    private DatabaseManager mDatabaseManager;

    public HabitInsertAsyncTask(DatabaseManager databaseManager) {
        mDatabaseManager = databaseManager;
    }

    @Override
    protected Boolean doInBackground(BaseHabit... habits) {
        for (int i = 0; i < habits.length; ++i) {
            if (habits[i] instanceof RegularHabit) {
                mDatabaseManager.insert((RegularHabit) habits[i]);
            }
            else if (habits[i] instanceof DailyHabit) {
                mDatabaseManager.insert((DailyHabit) habits[i]);
            }
        }

        return true;
    }
}
