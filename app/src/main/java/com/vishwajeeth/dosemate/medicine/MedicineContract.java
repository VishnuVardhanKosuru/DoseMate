package com.vishwajeeth.dosemate.medicine;

import android.content.Context;

import com.vishwajeeth.dosemate.BasePresenter;
import com.vishwajeeth.dosemate.BaseView;
import com.vishwajeeth.dosemate.data.source.MedicineAlarm;

import java.util.List;

/**
 * Created by vishwajeeth on 13/07/17.
 */

public interface MedicineContract {

    interface View extends BaseView<Presenter> {

        void showLoadingIndicator(boolean active);

        void showMedicineList(List<MedicineAlarm> medicineAlarmList);

        void showAddMedicine();

        void showMedicineDetails(long medId, String medName);

        void showLoadingMedicineError();

        void showNoMedicine();

        void showSuccessfullySavedMessage();

        void  showMedicineDeletedSuccessfully();

        boolean isActive();


    }

    interface Presenter extends BasePresenter {

        void onStart(int day);

        void reload(int day);

        void result(int requestCode, int resultCode);

        void loadMedicinesByDay(int day, boolean showIndicator);

        void deleteMedicineAlarm(MedicineAlarm medicineAlarm, Context context);

        void addNewMedicine();

    }
}
