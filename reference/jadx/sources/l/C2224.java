package l;

/* JADX INFO: renamed from: l.֫᩹ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: M664 */
/* JADX INFO: loaded from: classes3.dex */
public final class C2224 extends AbstractC16393 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f7288;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int f7289;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final AbstractC22664[] f7290;

    public C2224(int i, int i2, AbstractC22664[] abstractC22664Arr) {
        this.f7288 = i;
        this.f7289 = i2;
        this.f7290 = abstractC22664Arr;
    }

    @Override // l.AbstractC16393
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int mo7568() {
        return this.f7288;
    }

    @Override // l.AbstractC16393
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo7569(C3715 c3715) {
        super.mo7569(c3715);
        C9002 c9002 = c3715.f12754;
        int i = this.f7289;
        c9002.m24022(i);
        if (c3715.f12766) {
            System.out.print(" offset_delta=" + i);
        }
        int i2 = 0;
        while (true) {
            AbstractC22664[] abstractC22664Arr = this.f7290;
            if (i2 >= abstractC22664Arr.length) {
                return;
            }
            if (c3715.f12766) {
                System.out.print(" locals[" + i2 + "]=");
            }
            c3715.m12091(abstractC22664Arr[i2]);
            i2++;
        }
    }
}
