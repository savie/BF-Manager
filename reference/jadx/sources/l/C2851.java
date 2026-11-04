package l;

import android.view.View;

/* JADX INFO: renamed from: l.ۖᩳ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: V5QL */
/* JADX INFO: loaded from: classes2.dex */
public final class C2851 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C1360 f9420;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final InterfaceC9562 f9421;

    public C2851(InterfaceC9562 interfaceC9562) {
        this.f9421 = interfaceC9562;
        C1360 c1360 = new C1360();
        c1360.f4845 = 0;
        this.f9420 = c1360;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final View m9409(int i, int i2, int i3, int i4) {
        InterfaceC9562 interfaceC9562 = this.f9421;
        int iMo17899 = interfaceC9562.mo17899();
        int iMo17901 = interfaceC9562.mo17901();
        int i5 = i2 > i ? 1 : -1;
        View view = null;
        while (i != i2) {
            View childAt = interfaceC9562.getChildAt(i);
            int iMo17900 = interfaceC9562.mo17900(childAt);
            int iMo17902 = interfaceC9562.mo17902(childAt);
            C1360 c1360 = this.f9420;
            c1360.f4847 = iMo17899;
            c1360.f4849 = iMo17901;
            c1360.f4846 = iMo17900;
            c1360.f4848 = iMo17902;
            if (i3 != 0) {
                c1360.f4845 = i3;
                if (c1360.m5008()) {
                    return childAt;
                }
            }
            if (i4 != 0) {
                c1360.f4845 = i4;
                if (c1360.m5008()) {
                    view = childAt;
                }
            }
            i += i5;
        }
        return view;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m9410(View view) {
        InterfaceC9562 interfaceC9562 = this.f9421;
        int iMo17899 = interfaceC9562.mo17899();
        int iMo17901 = interfaceC9562.mo17901();
        int iMo17900 = interfaceC9562.mo17900(view);
        int iMo17902 = interfaceC9562.mo17902(view);
        C1360 c1360 = this.f9420;
        c1360.f4847 = iMo17899;
        c1360.f4849 = iMo17901;
        c1360.f4846 = iMo17900;
        c1360.f4848 = iMo17902;
        c1360.f4845 = 24579;
        return c1360.m5008();
    }
}
