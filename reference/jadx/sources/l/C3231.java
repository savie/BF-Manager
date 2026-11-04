package l;

import android.view.WindowInsets;

/* JADX INFO: renamed from: l.ۗۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: M4Z7 */
/* JADX INFO: loaded from: classes3.dex */
public class C3231 extends C23369 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public C13275 f10532;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public C13275 f10533;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C13275 f10534;

    @Override // l.C15909, l.C12180
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo10577(C13275 c13275) {
    }

    public C3231(C3977 c3977, WindowInsets windowInsets) {
        super(c3977, windowInsets);
        this.f10534 = null;
        this.f10533 = null;
        this.f10532 = null;
    }

    @Override // l.C12180
    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C13275 mo10578() {
        if (this.f10534 == null) {
            this.f10534 = C13275.m32820(this.f56581.getSystemGestureInsets());
        }
        return this.f10534;
    }

    @Override // l.C12180
    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public C13275 mo10579() {
        if (this.f10533 == null) {
            this.f10533 = C13275.m32820(this.f56581.getMandatorySystemGestureInsets());
        }
        return this.f10533;
    }

    @Override // l.C12180
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C13275 mo10575() {
        if (this.f10532 == null) {
            this.f10532 = C13275.m32820(this.f56581.getTappableElementInsets());
        }
        return this.f10532;
    }

    @Override // l.C17401, l.C12180
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C3977 mo10576(int i, int i2, int i3, int i4) {
        return C3977.m12812(null, this.f56581.inset(i, i2, i3, i4));
    }
}
