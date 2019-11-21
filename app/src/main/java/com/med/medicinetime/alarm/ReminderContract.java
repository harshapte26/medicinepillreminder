package com.med.medicinetime.alarm;

import com.med.medicinetime.BasePresenter;
import com.med.medicinetime.BaseView;
import com.med.medicinetime.data.source.History;
import com.med.medicinetime.data.source.MedicineAlarm;



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
