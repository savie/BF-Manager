package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۧ᩻ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: T9JB */
/* JADX INFO: loaded from: classes3.dex */
public final class C11971 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public ArrayList f38539 = new ArrayList();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m30013(C18684 c18684, C7453 c7453) {
        c7453.m56021(2);
        byte bM56020 = c7453.m56020();
        c7453.m56021(1);
        int iM56002 = c7453.m56002();
        if (bM56020 > 0) {
            for (int i = 0; i < bM56020; i++) {
                c7453.m56002();
                c7453.m56021(4);
                m30011(c18684, c7453);
            }
            return;
        }
        if (iM56002 > 0) {
            m30011(c18684, c7453);
        } else {
            if (iM56002 != 0 || c7453.m56013() <= 0) {
                return;
            }
            c7453.m56021(1);
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m30011(C18684 c18684, C7453 c7453) {
        long jM43472 = c18684.m43472();
        long value = EnumC20243.STATUS_BUFFER_TOO_SMALL.getValue();
        ArrayList arrayList = this.f38539;
        if (jM43472 == value) {
            C13463 c13463 = new C13463();
            c7453.m56012();
            arrayList.add(c13463);
        } else if (jM43472 == EnumC20243.STATUS_STOPPED_ON_SYMLINK.getValue()) {
            C2277 c2277 = new C2277();
            C2277.m7719(c2277, c7453);
            arrayList.add(c2277);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList m30012() {
        return this.f38539;
    }
}
