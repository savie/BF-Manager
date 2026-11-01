package l;

import java.util.List;

/* JADX INFO: renamed from: l.ܽ᩷֨, reason: contains not printable characters */
/* JADX INFO: compiled from: O8DV */
/* JADX INFO: loaded from: classes4.dex */
public final class C16880 extends AbstractC4674 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C13913 f53982;

    @Override // l.AbstractC4674
    /* JADX INFO: renamed from: ۨ */
    public final void mo1962(C21422 c21422) {
        c21422.m47963("tar");
        List listM47979 = c21422.m47979();
        this.f53982 = new C13913(c21422.m47965(), listM47979);
        if (listM47979.size() == 1) {
            InterfaceC2557 interfaceC2557 = (InterfaceC2557) listM47979.get(0);
            if (interfaceC2557.isDirectory()) {
                this.f53982.m33755(interfaceC2557);
                return;
            } else {
                this.f53982.m33754(interfaceC2557);
                return;
            }
        }
        this.f53982.m33753(c21422.m47961());
    }
}
