package l;

import com.google.android.material.motion.MotionUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.֨᩹᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 27BS */
/* JADX INFO: loaded from: classes2.dex */
public final class C1417 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public long f5856;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final List f5857 = C11445.m28558();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m4956() {
        Iterator it = new ArrayList(this.f5857).iterator();
        while (it.hasNext()) {
            ((RunnableC12002) it.next()).m29893();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m4957(RunnableC12002 runnableC12002) {
        this.f5857.remove(runnableC12002);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m4958(RunnableC12002 runnableC12002) {
        this.f5856++;
        Thread thread = new Thread(runnableC12002);
        thread.setDaemon(true);
        thread.setName("NanoHttpd Request Processor (#" + this.f5856 + MotionUtils.EASING_TYPE_FORMAT_END);
        this.f5857.add(runnableC12002);
        thread.start();
    }
}
