package l;

import java.util.List;

/* JADX INFO: renamed from: l.ۨᩴ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: 2B6A */
/* JADX INFO: loaded from: classes4.dex */
public final class C12561 extends AbstractC9843 {
    @Override // l.AbstractC9843
    /* JADX INFO: renamed from: ۤ */
    public final void mo2016(C12915 c12915) {
        c12915.m31970("archive");
        C7429 c7429 = new C7429(c12915.m31983());
        List listM31982 = c12915.m31982();
        if (listM31982.size() == 1) {
            InterfaceC2386 interfaceC2386 = (InterfaceC2386) listM31982.get(0);
            if (interfaceC2386.isDirectory()) {
                c7429.m20345((C10411) interfaceC2386);
                return;
            } else {
                c7429.m20344((C10411) interfaceC2386);
                return;
            }
        }
        c7429.m20343(listM31982);
    }
}
