package l;

/* JADX INFO: renamed from: l.᩻᩹ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: M664 */
/* JADX INFO: loaded from: classes.dex */
public final class C25345 extends AbstractC16393 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC22664[] f81821;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final AbstractC22664[] f81822;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f81823;

    @Override // l.AbstractC16393
    /* JADX INFO: renamed from: ۙ */
    public final int mo7568() {
        return 255;
    }

    public C25345(int i, AbstractC22664[] abstractC22664Arr, AbstractC22664[] abstractC22664Arr2) {
        this.f81823 = i;
        this.f81821 = abstractC22664Arr;
        this.f81822 = abstractC22664Arr2;
    }

    @Override // l.AbstractC16393
    /* JADX INFO: renamed from: ۙ */
    public final void mo7569(C3715 c3715) {
        super.mo7569(c3715);
        C9002 c9002 = c3715.f12754;
        int i = this.f81823;
        c9002.m24022(i);
        AbstractC22664[] abstractC22664Arr = this.f81821;
        c9002.m24022(abstractC22664Arr.length);
        if (c3715.f12766) {
            System.out.print(" offset_delta=" + i);
            System.out.print(" nlocals=" + abstractC22664Arr.length);
        }
        for (int i2 = 0; i2 < abstractC22664Arr.length; i2++) {
            if (c3715.f12766) {
                System.out.print(" locals[" + i2 + "]=");
            }
            c3715.m12091(abstractC22664Arr[i2]);
        }
        AbstractC22664[] abstractC22664Arr2 = this.f81822;
        c9002.m24022(abstractC22664Arr2.length);
        if (c3715.f12766) {
            System.out.print(" nstack=" + abstractC22664Arr2.length);
        }
        for (int i3 = 0; i3 < abstractC22664Arr2.length; i3++) {
            if (c3715.f12766) {
                System.out.print(" stack[" + i3 + "]=");
            }
            c3715.m12091(abstractC22664Arr2[i3]);
        }
    }
}
