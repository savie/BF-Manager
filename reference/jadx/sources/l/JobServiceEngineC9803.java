package l;

import android.app.job.JobParameters;
import android.app.job.JobServiceEngine;
import android.app.job.JobWorkItem;
import android.os.IBinder;

/* JADX INFO: renamed from: l.ۢ᩶, reason: contains not printable characters */
/* JADX INFO: compiled from: 268P */
/* JADX INFO: loaded from: classes3.dex */
public final class JobServiceEngineC9803 extends JobServiceEngine {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object f33535;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final AbstractServiceC13457 f33536;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public JobParameters f33537;

    public JobServiceEngineC9803(AbstractServiceC13457 abstractServiceC13457) {
        super(abstractServiceC13457);
        this.f33535 = new Object();
        this.f33536 = abstractServiceC13457;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final IBinder m24908() {
        return getBinder();
    }

    @Override // android.app.job.JobServiceEngine
    public final boolean onStartJob(JobParameters jobParameters) {
        this.f33537 = jobParameters;
        this.f33536.m32943(false);
        return true;
    }

    @Override // android.app.job.JobServiceEngine
    public final boolean onStopJob(JobParameters jobParameters) {
        AsyncTaskC6274 asyncTaskC6274 = this.f33536.f44510;
        if (asyncTaskC6274 != null) {
            asyncTaskC6274.cancel(false);
        }
        synchronized (this.f33535) {
            this.f33537 = null;
        }
        return true;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C2040 m24909() {
        synchronized (this.f33535) {
            JobParameters jobParameters = this.f33537;
            if (jobParameters == null) {
                return null;
            }
            JobWorkItem jobWorkItemDequeueWork = jobParameters.dequeueWork();
            if (jobWorkItemDequeueWork == null) {
                return null;
            }
            jobWorkItemDequeueWork.getIntent().setExtrasClassLoader(this.f33536.getClassLoader());
            return new C2040(this, jobWorkItemDequeueWork);
        }
    }
}
