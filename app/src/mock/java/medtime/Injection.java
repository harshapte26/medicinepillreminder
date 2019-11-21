package medtime;

import android.content.Context;
import android.support.annotation.NonNull;

import com.med.medicinetime.data.source.MedicineRepository;
import com.med.medicinetime.data.source.local.MedicinesLocalDataSource;



public class Injection {

    public static MedicineRepository provideMedicineRepository(@NonNull Context context) {
        return MedicineRepository.getInstance(MedicinesLocalDataSource.getInstance(context));
    }
}
