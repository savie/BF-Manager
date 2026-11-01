package l;

import java.util.List;

/* JADX INFO: renamed from: l.۬֡֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 71XR */
/* JADX INFO: loaded from: classes4.dex */
public final class C12752 extends AbstractC4674 {
    @Override // l.AbstractC4674
    /* JADX INFO: renamed from: ۨ */
    public final void mo1962(C21422 c21422) {
        c21422.m47963("zip");
        C15345 c15345 = new C15345(c21422.m47965());
        List listM47979 = c21422.m47979();
        if (listM47979.size() == 1) {
            InterfaceC2557 interfaceC2557 = (InterfaceC2557) listM47979.get(0);
            if (interfaceC2557.isDirectory()) {
                c15345.m36733((C5696) interfaceC2557);
                return;
            } else {
                c15345.m36732((C5696) interfaceC2557);
                return;
            }
        }
        c15345.m36731(listM47979);
    }
}
