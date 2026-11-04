package l;

import android.app.job.JobParameters;
import android.app.job.JobWorkItem;
import android.content.Intent;

/* JADX INFO: renamed from: l.ᩴܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 268P */
/* JADX INFO: loaded from: classes5.dex */
public final class C19966 implements InterfaceC22950 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final JobWorkItem f64172;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ JobServiceEngineC15490 f64173;

    public C19966(JobServiceEngineC15490 jobServiceEngineC15490, JobWorkItem jobWorkItem) {
        this.f64173 = jobServiceEngineC15490;
        this.f64172 = jobWorkItem;
    }

    @Override // l.InterfaceC22950
    public final Intent getIntent() {
        return this.f64172.getIntent();
    }

    @Override // l.InterfaceC22950
    /* JADX INFO: renamed from: ۙ */
    public final void mo27881() {
        synchronized (this.f64173.f50415) {
            JobParameters jobParameters = this.f64173.f50417;
            if (jobParameters != null) {
                jobParameters.completeWork(this.f64172);
            }
        }
    }
}
