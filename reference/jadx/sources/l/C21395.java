package l;

import android.view.View;

/* JADX INFO: renamed from: l.᩸ۛܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: V5QL */
/* JADX INFO: loaded from: classes4.dex */
public final class C21395 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C22807 f69569;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final InterfaceC15046 f69570;

    public C21395(InterfaceC15046 interfaceC15046) {
        this.f69570 = interfaceC15046;
        C22807 c22807 = new C22807();
        c22807.f74210 = 0;
        this.f69569 = c22807;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final View m47943(int i, int i2, int i3, int i4) {
        InterfaceC15046 interfaceC15046 = this.f69570;
        int iMo13304 = interfaceC15046.mo13304();
        int iMo13306 = interfaceC15046.mo13306();
        int i5 = i2 > i ? 1 : -1;
        View view = null;
        while (i != i2) {
            View childAt = interfaceC15046.getChildAt(i);
            int iMo13305 = interfaceC15046.mo13305(childAt);
            int iMo13307 = interfaceC15046.mo13307(childAt);
            C22807 c22807 = this.f69569;
            c22807.f74211 = iMo13304;
            c22807.f74209 = iMo13306;
            c22807.f74212 = iMo13305;
            c22807.f74213 = iMo13307;
            if (i3 != 0) {
                c22807.f74210 = i3;
                if (c22807.m50462()) {
                    return childAt;
                }
            }
            if (i4 != 0) {
                c22807.f74210 = i4;
                if (c22807.m50462()) {
                    view = childAt;
                }
            }
            i += i5;
        }
        return view;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m47944(View view) {
        InterfaceC15046 interfaceC15046 = this.f69570;
        int iMo13304 = interfaceC15046.mo13304();
        int iMo13306 = interfaceC15046.mo13306();
        int iMo13305 = interfaceC15046.mo13305(view);
        int iMo13307 = interfaceC15046.mo13307(view);
        C22807 c22807 = this.f69569;
        c22807.f74211 = iMo13304;
        c22807.f74209 = iMo13306;
        c22807.f74212 = iMo13305;
        c22807.f74213 = iMo13307;
        c22807.f74210 = 24579;
        return c22807.m50462();
    }
}
