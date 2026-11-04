package l;

import android.graphics.Typeface;

/* JADX INFO: renamed from: l.ܿۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: CB27 */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC18233 implements Runnable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C17004 f59523;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Typeface f59524;

    public RunnableC18233(C17004 c17004, Typeface typeface) {
        this.f59523 = c17004;
        this.f59524 = typeface;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f59523.m40075(this.f59524);
    }
}
