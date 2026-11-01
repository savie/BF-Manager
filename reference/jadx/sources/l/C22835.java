package l;

import android.os.SystemClock;

/* JADX INFO: renamed from: l.᩺ۜ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: I5UN */
/* JADX INFO: loaded from: classes.dex */
public final class C22835 extends AbstractC6909 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C21423 f74291;

    public C22835(C21423 c21423) {
        this.f74291 = c21423;
    }

    @Override // l.AbstractC6909
    public final void onScrollStateChanged(C17492 c17492, int i) {
        C21423 c21423 = this.f74291;
        if (i != 0) {
            c21423.f69658 = true;
        } else {
            c21423.f69661 = SystemClock.uptimeMillis();
            c21423.f69658 = false;
        }
    }
}
