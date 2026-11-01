package l;

import android.app.job.JobParameters;
import android.app.job.JobWorkItem;
import android.content.Intent;

/* JADX INFO: renamed from: l.֫᩶, reason: contains not printable characters */
/* JADX INFO: compiled from: 268P */
/* JADX INFO: loaded from: classes2.dex */
public final class C2040 implements InterfaceC14742 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final JobWorkItem f7600;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ JobServiceEngineC9803 f7601;

    public C2040(JobServiceEngineC9803 jobServiceEngineC9803, JobWorkItem jobWorkItem) {
        this.f7601 = jobServiceEngineC9803;
        this.f7600 = jobWorkItem;
    }

    @Override // l.InterfaceC14742
    public final Intent getIntent() {
        return this.f7600.getIntent();
    }

    @Override // l.InterfaceC14742
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo6535() {
        synchronized (this.f7601.f33535) {
            JobParameters jobParameters = this.f7601.f33537;
            if (jobParameters != null) {
                jobParameters.completeWork(this.f7600);
            }
        }
    }
}
