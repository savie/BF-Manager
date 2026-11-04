package l;

import android.os.SystemClock;

/* JADX INFO: renamed from: l.ܳܿ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: I5UN */
/* JADX INFO: loaded from: classes5.dex */
public final class C15511 extends AbstractC9980 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C5817 f50494;

    public C15511(C5817 c5817) {
        this.f50494 = c5817;
    }

    @Override // l.AbstractC9980
    public final void onScrollStateChanged(C25227 c25227, int i) {
        C5817 c5817 = this.f50494;
        if (i != 0) {
            c5817.f20011 = true;
        } else {
            c5817.f20012 = SystemClock.uptimeMillis();
            c5817.f20011 = false;
        }
    }
}
