package com.vishwajeeth.dosemate.alarm;

import com.vishwajeeth.dosemate.BasePresenter;
import com.vishwajeeth.dosemate.BaseView;
import com.vishwajeeth.dosemate.data.source.History;
import com.vishwajeeth.dosemate.data.source.MedicineAlarm;

/**
 * Created by vishwajeeth on 13/07/17.
 */

public interface ReminderContract {

    interface View extends BaseView<Presenter> {

        void showMedicine(MedicineAlarm medicineAlarm);

        void showNoData();

        boolean isActive();

        void onFinish();

    }

    interface Presenter extends BasePresenter {

        void finishActivity();

        void onStart(long id);

        void loadMedicineById(long id);

        void addPillsToHistory(History history);

    }
}
