package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.᩸ܺܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: I9EA */
/* JADX INFO: loaded from: classes2.dex */
public final class C22918 extends C24652 {
    @Override // l.C24652
    /* JADX INFO: renamed from: ᩷ */
    public final void mo4684(C7453 c7453) throws C2013 {
        c7453.m56021(2);
        int iM56017 = c7453.m56017();
        int iM56002 = c7453.m56002();
        if (iM56017 > 0 && iM56002 > 0) {
            ArrayList arrayList = new ArrayList();
            c7453.m56027(((C18684) this.f16383).mo4190() + iM56017);
            while (true) {
                int iM56029 = c7453.m56029();
                C3835 c3835 = new C3835();
                c3835.m12374(c7453);
                arrayList.add(c3835);
                if (c3835.m12373() == 0) {
                    break;
                } else {
                    c7453.m56027(c3835.m12373() + iM56029);
                }
            }
        }
        c7453.m56027(((C18684) this.f16383).mo4190() + iM56017 + iM56002);
    }
}
