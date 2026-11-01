package l;

import java.util.List;

/* JADX INFO: renamed from: l.ۤ᩻᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 2B6A */
/* JADX INFO: loaded from: classes3.dex */
public final class C10632 extends AbstractC4674 {
    @Override // l.AbstractC4674
    /* JADX INFO: renamed from: ۨ */
    public final void mo1962(C21422 c21422) {
        c21422.m47963("archive");
        C3201 c3201 = new C3201(c21422.m47965());
        List listM47979 = c21422.m47979();
        if (listM47979.size() == 1) {
            InterfaceC2557 interfaceC2557 = (InterfaceC2557) listM47979.get(0);
            if (interfaceC2557.isDirectory()) {
                c3201.m9621((C10964) interfaceC2557);
                return;
            } else {
                c3201.m9620((C10964) interfaceC2557);
                return;
            }
        }
        c3201.m9619(listM47979);
    }
}
