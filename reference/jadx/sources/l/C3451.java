package l;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.app.job.JobWorkItem;
import android.content.ComponentName;
import android.content.ContextWrapper;
import android.content.Intent;

/* JADX INFO: renamed from: l.ۗ᩶, reason: contains not printable characters */
/* JADX INFO: compiled from: 268P */
/* JADX INFO: loaded from: classes2.dex */
public final class C3451 extends AbstractC4283 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final JobInfo f12696;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final JobScheduler f12697;

    public C3451(ContextWrapper contextWrapper, ComponentName componentName, int i) {
        super(componentName);
        m12088(i);
        this.f12696 = new JobInfo.Builder(i, componentName).setOverrideDeadline(0L).build();
        this.f12697 = (JobScheduler) contextWrapper.getApplicationContext().getSystemService("jobscheduler");
    }

    @Override // l.AbstractC4283
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo10161(Intent intent) {
        this.f12697.enqueue(this.f12696, new JobWorkItem(intent));
    }
}
