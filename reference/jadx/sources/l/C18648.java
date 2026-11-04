package l;

/* JADX INFO: renamed from: l.ܿ᩹᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: P1SF */
/* JADX INFO: loaded from: classes5.dex */
public final class C18648 extends AbstractC3732 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C21632[] f60640;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC0749 f60641;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18648(AbstractC0749 abstractC0749, int i) {
        super(i, 0);
        this.f60641 = abstractC0749;
        int i2 = 0;
        this.f60640 = new C21632[1 << i];
        while (true) {
            C21632[] c21632Arr = this.f60640;
            if (i2 >= c21632Arr.length) {
                return;
            }
            c21632Arr[i2] = new C21632(this);
            i2++;
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m43412() {
        int i = 0;
        while (true) {
            C21632[] c21632Arr = this.f60640;
            if (i >= c21632Arr.length) {
                return;
            }
            AbstractC17076.m40213(c21632Arr[i].f77275);
            i++;
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m43413() {
        this.f60640[0].m49170();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m43411() {
        AbstractC0749 abstractC0749 = this.f60641;
        AbstractC25362 abstractC25362 = abstractC0749.f2729;
        this.f60640[m12140(abstractC25362.m56717(abstractC0749.f2727 + 1), abstractC25362.m56722() - abstractC0749.f2727)].m49170();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m43410(int i, int i2, int i3, int i4, C1495 c1495) {
        AbstractC0749 abstractC0749 = this.f60641;
        int iM20481 = 0;
        int iM20482 = C7461.m20481(abstractC0749.f66851[c1495.m5322()][abstractC0749.f66845 & i4], 0);
        int iM12140 = m12140(i3, i4);
        boolean zM5328 = c1495.m5328();
        int i5 = 256;
        C21632[] c21632Arr = this.f60640;
        if (zM5328) {
            C21632 c21632 = c21632Arr[iM12140];
            int i6 = i | 256;
            do {
                iM20481 += C7461.m20481(c21632.f77275[i6 >>> 8], (i6 >>> 7) & 1);
                i6 <<= 1;
            } while (i6 < 65536);
        } else {
            C21632 c21633 = c21632Arr[iM12140];
            int i7 = i | 256;
            do {
                i2 <<= 1;
                iM20481 += C7461.m20481(c21633.f77275[(i2 & i5) + i5 + (i7 >>> 8)], (i7 >>> 7) & 1);
                i7 <<= 1;
                i5 &= ~(i2 ^ i7);
            } while (i7 < 65536);
        }
        return iM20482 + iM20481;
    }
}
