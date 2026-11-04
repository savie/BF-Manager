package l;

/* JADX INFO: renamed from: l.ܺ᩹ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: M664 */
/* JADX INFO: loaded from: classes5.dex */
public final class C17139 extends AbstractC16393 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f55890;

    public C17139(int i) {
        this.f55890 = i;
    }

    @Override // l.AbstractC16393
    /* JADX INFO: renamed from: ۙ */
    public final int mo7568() {
        int i = this.f55890;
        if (i < 64) {
            return i;
        }
        return 251;
    }

    @Override // l.AbstractC16393
    /* JADX INFO: renamed from: ۙ */
    public final void mo7569(C3715 c3715) {
        super.mo7569(c3715);
        if (mo7568() == 251) {
            C9002 c9002 = c3715.f12754;
            int i = this.f55890;
            c9002.m24022(i);
            if (c3715.f12766) {
                System.out.print(" offset_delta=" + i);
            }
        }
    }
}
