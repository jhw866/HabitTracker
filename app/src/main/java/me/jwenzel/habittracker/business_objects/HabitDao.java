package me.jwenzel.habittracker.business_objects;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import java.util.List;

@Dao
public interface HabitDao {
    // Insert Daily Habits
    @Insert
    void insertAll(DailyHabit... dailyHabits);

    // Delete Daily Habits
    @Delete
    void deleteAll(DailyHabit... dailyHabits);

    // Update Daily Habits
    @Update
    void updateAll(DailyHabit... dailyHabits);

    // Get All daily habits
    @Query("SELECT * FROM dailyhabit")
    List<DailyHabit> getAllDailyHabits();

    // Insert Regular Habits
    @Insert
    void insertAll(RegularHabit... regularHabits);

    // Delete Regular Habits
    @Delete
    void deleteAll(RegularHabit... regularHabits);

    // Update Regular Habits
    @Update
    void updateAll(RegularHabit... regularHabits);

    // Get All regular Habits
    @Query("SELECT * FROM regularhabit")
    List<RegularHabit> getAllRegularHabits();
}