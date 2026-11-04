package l;

/* JADX INFO: renamed from: l.ۧ᩹ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: M664 */
/* JADX INFO: loaded from: classes4.dex */
public final class C11918 extends AbstractC16393 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f38402;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f38403;

    public C11918(int i, int i2) {
        this.f38402 = i;
        this.f38403 = i2;
    }

    @Override // l.AbstractC16393
    /* JADX INFO: renamed from: ۙ */
    public final int mo7568() {
        return this.f38402;
    }

    @Override // l.AbstractC16393
    /* JADX INFO: renamed from: ۙ */
    public final void mo7569(C3715 c3715) {
        super.mo7569(c3715);
        C9002 c9002 = c3715.f12754;
        int i = this.f38403;
        c9002.m24022(i);
        if (c3715.f12766) {
            System.out.print(" offset_delta=" + i);
        }
    }
}
