package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ܶۚᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 31MV */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC15028 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int f48998;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C2824 f48999;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int f49000;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C16936 f49001;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final InterfaceC13409 f49002;

    /* JADX INFO: renamed from: ۙ */
    public abstract C16231 mo17800(int i);

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo17801(int i, int i2, int i3, int i4);

    /* JADX INFO: renamed from: ܰ */
    public abstract C16231 mo17802(int i);

    public AbstractC15028(int i, int i2, InterfaceC13409 interfaceC13409, C16936 c16936) {
        this.f48998 = i;
        this.f49000 = i2;
        this.f49002 = interfaceC13409;
        this.f49001 = c16936;
        this.f48999 = new C2824(i, i2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC13409 m36014() {
        Iterator it = this.f49002.mo11889().iterator();
        int i = 0;
        int i2 = 0;
        while (true) {
            boolean zHasNext = it.hasNext();
            C2824 c2824 = this.f48999;
            if (zHasNext) {
                C20464 c20464 = (C20464) it.next();
                int i3 = c20464.f66400;
                int i4 = c20464.f66401;
                int i5 = i3 - i4;
                int i6 = 0;
                while (i6 < i5) {
                    C16231 c16231Mo17800 = mo17800(i4 + i6);
                    C16231 c16231Mo17802 = mo17802(c20464.f66399 + i6);
                    int i7 = c16231Mo17800.f52359;
                    int i8 = c16231Mo17802.f52359;
                    int i9 = c16231Mo17800.f52360;
                    int i10 = c16231Mo17802.f52360;
                    mo17801(i, i7, i2, i8);
                    c2824.m15544(i7, i8, i9, i10);
                    i6++;
                    i = i9;
                    i2 = i10;
                }
            } else {
                mo17801(i, this.f48998, i2, this.f49000);
                return C1413.m4944(c2824.m8577());
            }
        }
    }
}
