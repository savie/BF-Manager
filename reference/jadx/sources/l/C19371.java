package l;

import android.view.WindowInsets;

/* JADX INFO: renamed from: l.᩵ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: M4Z7 */
/* JADX INFO: loaded from: classes5.dex */
public class C19371 extends C8082 {

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public C13954 f62432;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C13954 f62433;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public C13954 f62434;

    @Override // l.C18665, l.C10199
    /* JADX INFO: renamed from: ۙ */
    public void mo25976(C13954 c13954) {
    }

    public C19371(C15844 c15844, WindowInsets windowInsets) {
        super(c15844, windowInsets);
        this.f62434 = null;
        this.f62433 = null;
        this.f62432 = null;
    }

    @Override // l.C10199
    /* JADX INFO: renamed from: ֨ */
    public C13954 mo25973() {
        if (this.f62434 == null) {
            this.f62434 = C13954.m33794(this.f57445.getSystemGestureInsets());
        }
        return this.f62434;
    }

    @Override // l.C10199
    /* JADX INFO: renamed from: ۚ */
    public C13954 mo25979() {
        if (this.f62433 == null) {
            this.f62433 = C13954.m33794(this.f57445.getMandatorySystemGestureInsets());
        }
        return this.f62433;
    }

    @Override // l.C10199
    /* JADX INFO: renamed from: ۘ */
    public C13954 mo25974() {
        if (this.f62432 == null) {
            this.f62432 = C13954.m33794(this.f57445.getTappableElementInsets());
        }
        return this.f62432;
    }

    @Override // l.C17959, l.C10199
    /* JADX INFO: renamed from: ۙ */
    public C15844 mo25975(int i, int i2, int i3, int i4) {
        return C15844.m37669(null, this.f57445.inset(i, i2, i3, i4));
    }
}
