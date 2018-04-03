package me.jwenzel.habittracker.presenter.dashboard;

import java.util.List;

import me.jwenzel.habittracker.business_objects.DailyHabit;
import me.jwenzel.habittracker.presenter.BasePresenterImpl;
import me.jwenzel.habittracker.view.dashboard.DailyHabitDashboardView;

public class DailyHabitDashboardPresenterImpl extends BasePresenterImpl<DailyHabitDashboardView> implements DailyHabitDashboardPresenter {
    /**
     * Creates the BasePresenter and sets the view for the rest of the presenter classes
     * to access
     *
     * @param view
     */
    public DailyHabitDashboardPresenterImpl(DailyHabitDashboardView view) {
        super(view);
    }

    @Override
    public void onStartCalled() {
        getView().startDatabaseTask();
    }

    @Override
    public void onPostExecuteCalled(List<DailyHabit> dailyHabit) {
        getView().updateDailyHabitList(dailyHabit);
    }
}
