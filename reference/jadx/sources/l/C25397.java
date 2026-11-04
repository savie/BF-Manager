package l;

import com.google.android.material.motion.MotionUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.᩻᩻ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 27BS */
/* JADX INFO: loaded from: classes.dex */
public final class C25397 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public long f81976;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final List f81977 = C1402.m5127();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m56757() {
        Iterator it = new ArrayList(this.f81977).iterator();
        while (it.hasNext()) {
            ((RunnableC13462) it.next()).m33110();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m56758(RunnableC13462 runnableC13462) {
        this.f81977.remove(runnableC13462);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m56759(RunnableC13462 runnableC13462) {
        this.f81976++;
        Thread thread = new Thread(runnableC13462);
        thread.setDaemon(true);
        thread.setName("NanoHttpd Request Processor (#" + this.f81976 + MotionUtils.EASING_TYPE_FORMAT_END);
        this.f81977.add(runnableC13462);
        thread.start();
    }
}
