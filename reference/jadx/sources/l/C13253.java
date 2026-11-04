package l;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.app.job.JobWorkItem;
import android.content.ComponentName;
import android.content.ContextWrapper;
import android.content.Intent;

/* JADX INFO: renamed from: l.۫ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 268P */
/* JADX INFO: loaded from: classes4.dex */
public final class C13253 extends AbstractC5796 {

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final JobScheduler f42347;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final JobInfo f42348;

    public C13253(ContextWrapper contextWrapper, ComponentName componentName, int i) {
        super(componentName);
        m16911(i);
        this.f42348 = new JobInfo.Builder(i, componentName).setOverrideDeadline(0L).build();
        this.f42347 = (JobScheduler) contextWrapper.getApplicationContext().getSystemService("jobscheduler");
    }

    @Override // l.AbstractC5796
    /* JADX INFO: renamed from: ۙ */
    public final void mo16912(Intent intent) {
        this.f42347.enqueue(this.f42348, new JobWorkItem(intent));
    }
}
