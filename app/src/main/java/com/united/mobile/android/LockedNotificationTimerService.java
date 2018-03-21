package com.united.mobile.android;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;

/**
 * Created by txiao on 12/14/16.
 */

public class LockedNotificationTimerService extends JobService {
    @Override
    public boolean onStartJob(JobParameters params) {
        Util.logicForNotificationTimer(this);
        Intent service = new Intent(getApplicationContext(), LockedNotificationTimerService.class);
        getApplicationContext().startService(service);
        return true;
    }

    @Override
    public boolean onStopJob(JobParameters params) {
        return true;
    }
}