package l;

/* JADX INFO: renamed from: l.ܽ᩹ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: M664 */
/* JADX INFO: loaded from: classes5.dex */
public final class C17885 extends AbstractC16393 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f58611;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final AbstractC22664 f58612;

    public C17885(int i, AbstractC22664 abstractC22664) {
        this.f58611 = i;
        this.f58612 = abstractC22664;
    }

    @Override // l.AbstractC16393
    /* JADX INFO: renamed from: ۙ */
    public final int mo7568() {
        int i = this.f58611;
        if (i < 64) {
            return i + 64;
        }
        return 247;
    }

    @Override // l.AbstractC16393
    /* JADX INFO: renamed from: ۙ */
    public final void mo7569(C3715 c3715) {
        super.mo7569(c3715);
        if (mo7568() == 247) {
            C9002 c9002 = c3715.f12754;
            int i = this.f58611;
            c9002.m24022(i);
            if (c3715.f12766) {
                System.out.print(" offset_delta=" + i);
            }
        }
        if (c3715.f12766) {
            System.out.print(" stack[0]=");
        }
        c3715.m12091(this.f58612);
    }
}
