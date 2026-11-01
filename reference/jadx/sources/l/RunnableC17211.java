package l;

/* JADX INFO: renamed from: l.ܿ۟᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: 86WH */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC17211 implements Runnable {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C23562 f54857;

    public RunnableC17211(C23562 c23562) {
        this.f54857 = c23562;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C23562 c23562 = this.f54857;
        if (c23562.f76314 && c23562.f76291) {
            long jNanoTime = System.nanoTime();
            c23562.f76310.m13630(c23562.f76311 == 0 ? 0.016666668f : (jNanoTime - c23562.f76311) * 1.0E-9f);
            c23562.f76311 = jNanoTime;
            c23562.m51931(c23562.f76310.f17199, c23562.f76310.f17193);
            if (c23562.f76310.m13632()) {
                c23562.f76308.postOnAnimation(this);
            } else {
                c23562.m51956();
            }
        }
    }
}
