package l;

import java.util.List;

/* JADX INFO: renamed from: l.ܶۜ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: 71XR */
/* JADX INFO: loaded from: classes5.dex */
public final class C15918 extends AbstractC9843 {
    @Override // l.AbstractC9843
    /* JADX INFO: renamed from: ۤ */
    public final void mo2016(C12915 c12915) {
        c12915.m31970("zip");
        C3436 c3436 = new C3436(c12915.m31983());
        List listM31982 = c12915.m31982();
        if (listM31982.size() == 1) {
            InterfaceC2386 interfaceC2386 = (InterfaceC2386) listM31982.get(0);
            if (interfaceC2386.isDirectory()) {
                c3436.m11205((C2494) interfaceC2386);
                return;
            } else {
                c3436.m11204((C2494) interfaceC2386);
                return;
            }
        }
        c3436.m11203(listM31982);
    }
}
