package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.۬ܽۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: K6TZ */
/* JADX INFO: loaded from: classes3.dex */
public final class C13229 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C8872 f43983;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C21695 f43984;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C23128 f43985;

    public C13229(C21695 c21695, C23128 c23128, boolean z) {
        Object objLast;
        C8872 c8872;
        C15346 c15346 = c23128.f75113;
        this.f43984 = c21695;
        this.f43985 = c23128;
        if (!z) {
            objLast = c15346.last();
        } else {
            objLast = c15346.get(0);
        }
        C1463 c1463 = (C1463) objLast;
        if (!z && !c1463.m5088()) {
            int iM35339 = c1463.f5961.m35339() + c1463.f5964;
            c8872 = new C8872(iM35339, iM35339);
        } else {
            c8872 = c1463.f5959;
        }
        this.f43983 = c8872;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C13229 m32713(C21695 c21695, boolean z) {
        C23128 c23128M18519;
        C6899 c6899 = c21695.f70379;
        if (z) {
            C15346 c15346 = c6899.f23227;
            c23128M18519 = !c15346.isEmpty() ? (C23128) c15346.last() : null;
        } else {
            c23128M18519 = c6899.m18519();
        }
        if (c23128M18519 == null) {
            return null;
        }
        return new C13229(c21695, c23128M18519, z);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m32715() {
        return !this.f43983.equals(this.f43984.f70377);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m32714() {
        Iterator it = this.f43985.f75113.iterator();
        int i = 0;
        while (true) {
            C4055 c4055 = (C4055) it;
            if (!c4055.hasNext()) {
                return false;
            }
            if (!((C1463) c4055.next()).m5088() && (i = i + 1) >= 64) {
                return true;
            }
        }
    }
}
