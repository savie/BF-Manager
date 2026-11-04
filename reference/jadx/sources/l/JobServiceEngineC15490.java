package l;

import android.app.job.JobParameters;
import android.app.job.JobServiceEngine;
import android.app.job.JobWorkItem;
import android.os.IBinder;

/* JADX INFO: renamed from: l.ܳܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 268P */
/* JADX INFO: loaded from: classes4.dex */
public final class JobServiceEngineC15490 extends JobServiceEngine {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object f50415;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final AbstractServiceC2067 f50416;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public JobParameters f50417;

    public JobServiceEngineC15490(AbstractServiceC2067 abstractServiceC2067) {
        super(abstractServiceC2067);
        this.f50415 = new Object();
        this.f50416 = abstractServiceC2067;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final IBinder m37055() {
        return getBinder();
    }

    @Override // android.app.job.JobServiceEngine
    public final boolean onStartJob(JobParameters jobParameters) {
        this.f50417 = jobParameters;
        this.f50416.m7143(false);
        return true;
    }

    @Override // android.app.job.JobServiceEngine
    public final boolean onStopJob(JobParameters jobParameters) {
        AsyncTaskC5050 asyncTaskC5050 = this.f50416.f6882;
        if (asyncTaskC5050 != null) {
            asyncTaskC5050.cancel(false);
        }
        synchronized (this.f50415) {
            this.f50417 = null;
        }
        return true;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C19966 m37056() {
        synchronized (this.f50415) {
            JobParameters jobParameters = this.f50417;
            if (jobParameters == null) {
                return null;
            }
            JobWorkItem jobWorkItemDequeueWork = jobParameters.dequeueWork();
            if (jobWorkItemDequeueWork == null) {
                return null;
            }
            jobWorkItemDequeueWork.getIntent().setExtrasClassLoader(this.f50416.getClassLoader());
            return new C19966(this, jobWorkItemDequeueWork);
        }
    }
}
