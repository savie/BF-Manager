package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ᩳۛܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 31MV */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC18883 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C6730 f61294;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C15087 f61295;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int f61296;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final InterfaceC21646 f61297;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f61298;

    /* JADX INFO: renamed from: ۙ */
    public abstract C10612 mo1718(int i);

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo1719(int i, int i2, int i3, int i4);

    /* JADX INFO: renamed from: ᩷ */
    public abstract C10612 mo1720(int i);

    public AbstractC18883(int i, int i2, InterfaceC21646 interfaceC21646, C15087 c15087) {
        this.f61298 = i;
        this.f61296 = i2;
        this.f61297 = interfaceC21646;
        this.f61295 = c15087;
        this.f61294 = new C6730(i, i2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC21646 m43793() {
        Iterator it = this.f61297.mo3131().iterator();
        int i = 0;
        int i2 = 0;
        while (true) {
            boolean zHasNext = it.hasNext();
            C6730 c6730 = this.f61294;
            if (zHasNext) {
                C22547 c22547 = (C22547) it.next();
                int i3 = c22547.f72891;
                int i4 = c22547.f72892;
                int i5 = i3 - i4;
                int i6 = 0;
                while (i6 < i5) {
                    C10612 c10612Mo1718 = mo1718(i4 + i6);
                    C10612 c10612Mo1720 = mo1720(c22547.f72894 + i6);
                    int i7 = c10612Mo1718.f33696;
                    int i8 = c10612Mo1720.f33696;
                    int i9 = c10612Mo1718.f33697;
                    int i10 = c10612Mo1720.f33697;
                    mo1719(i, i7, i2, i8);
                    c6730.m54965(i7, i8, i9, i10);
                    i6++;
                    i = i9;
                    i2 = i10;
                }
            } else {
                mo1719(i, this.f61298, i2, this.f61296);
                return C14932.m35915(c6730.m18810());
            }
        }
    }
}
