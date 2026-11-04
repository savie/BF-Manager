package l;

import android.os.SystemClock;

/* JADX INFO: renamed from: l.ܿᩴۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 26HN */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC18523 implements Runnable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC9572 f60218;

    public RunnableC18523(ActivityC9572 activityC9572) {
        this.f60218 = activityC9572;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ActivityC9572 activityC9572 = this.f60218;
        if (activityC9572.f30986) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            for (int i = 0; i < activityC9572.f30976.getChildCount(); i++) {
                C1370 c1370 = (C1370) activityC9572.f30976.getChildViewHolder(activityC9572.f30976.getChildAt(i));
                C14113 c14113 = c1370.f4880;
                if (c14113 != null && c14113.m34264()) {
                    c1370.m5051(jElapsedRealtime);
                }
            }
            activityC9572.f30972.postDelayed(this, 100L);
        }
    }
}
