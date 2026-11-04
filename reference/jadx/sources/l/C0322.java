package l;

import java.util.List;

/* JADX INFO: renamed from: l.֡ۡ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: O8DV */
/* JADX INFO: loaded from: classes3.dex */
public final class C0322 extends AbstractC9843 {

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public C22501 f1758;

    @Override // l.AbstractC9843
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void mo2016(C12915 c12915) {
        c12915.m31970("tar");
        List listM31982 = c12915.m31982();
        this.f1758 = new C22501(c12915.m31983(), listM31982);
        if (listM31982.size() == 1) {
            InterfaceC2386 interfaceC2386 = (InterfaceC2386) listM31982.get(0);
            if (interfaceC2386.isDirectory()) {
                this.f1758.m50742(interfaceC2386);
                return;
            } else {
                this.f1758.m50741(interfaceC2386);
                return;
            }
        }
        this.f1758.m50740(c12915.m31967());
    }
}
