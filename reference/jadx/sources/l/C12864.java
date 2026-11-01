package l;

/* JADX INFO: renamed from: l.۬ۘۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: M1T7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C12864 extends AbstractC2279 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C3690 f42780;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C0868[] f42781;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12864(C3690 c3690, int i, int i2) {
        super(i, i2);
        this.f42780 = c3690;
        this.f42781 = new C0868[1 << (i + i2)];
        int i3 = 0;
        while (true) {
            C0868[] c0868Arr = this.f42781;
            if (i3 >= c0868Arr.length) {
                return;
            }
            c0868Arr[i3] = new C0868(this);
            i3++;
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m31906() {
        int i = 0;
        while (true) {
            C0868[] c0868Arr = this.f42781;
            if (i >= c0868Arr.length) {
                return;
            }
            AbstractC12807.m31803(c0868Arr[i].f38554);
            i++;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m31905() {
        C3690 c3690 = this.f42780;
        C0868 c0868 = this.f42781[m6988(c3690.f13466.m5998(0), c3690.f13466.m5997())];
        short[] sArr = c0868.f38554;
        C3690 c3691 = c0868.f3525.f42780;
        int iM22426 = 1;
        if (c3691.f17786.m44136()) {
            do {
                iM22426 = (iM22426 << 1) | c3691.f13465.m22426(sArr, iM22426);
            } while (iM22426 < 256);
        } else {
            int iM5998 = c3691.f13466.m5998(c3691.f17788[0]);
            int i = 256;
            int i2 = 1;
            do {
                iM5998 <<= 1;
                int i3 = iM5998 & i;
                int iM22427 = c3691.f13465.m22426(sArr, i + i3 + i2);
                i2 = (i2 << 1) | iM22427;
                i &= (~i3) ^ (0 - iM22427);
            } while (i2 < 256);
            iM22426 = i2;
        }
        c3691.f13466.m6000((byte) iM22426);
        c3691.f17786.m44131();
    }
}
