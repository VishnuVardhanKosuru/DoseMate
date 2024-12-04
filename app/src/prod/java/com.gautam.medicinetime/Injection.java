package com.vishwajeeth.dosemate;

import android.content.Context;
import androidx.annotation.NonNull;


import com.vishwajeeth.dosemate.data.source.MedicineRepository;
import com.vishwajeeth.dosemate.data.source.local.MedicinesLocalDataSource;


/**
 * Created by vishwajeeth on 13/05/17.
 */

public class Injection {

    public static MedicineRepository provideMedicineRepository(@NonNull Context context) {
        return MedicineRepository.getInstance(MedicinesLocalDataSource.getInstance(context));
    }
}