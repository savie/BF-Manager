package l;

import java.util.TreeSet;

/* JADX INFO: renamed from: l.֨ۘۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q74C */
/* JADX INFO: loaded from: classes3.dex */
public final class C0910 implements InterfaceC16571 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public long f3410;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final TreeSet f3411 = new TreeSet(new C9858());

    @Override // l.InterfaceC19555
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo3679(C8367 c8367, C3147 c3147) {
        TreeSet treeSet = this.f3411;
        treeSet.add(c3147);
        this.f3410 += c3147.f10206;
        while (this.f3410 > 209715200 && !treeSet.isEmpty()) {
            c8367.m22529((C3147) treeSet.first());
        }
    }

    @Override // l.InterfaceC19555
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo3677(C3147 c3147) {
        this.f3411.remove(c3147);
        this.f3410 -= c3147.f10206;
    }

    @Override // l.InterfaceC19555
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo3680(C8367 c8367, C3147 c3147, C3147 c3148) {
        mo3677(c3147);
        mo3679(c8367, c3148);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m3678(C8367 c8367, long j) {
        if (j != -1) {
            while (this.f3410 + j > 209715200) {
                TreeSet treeSet = this.f3411;
                if (treeSet.isEmpty()) {
                    return;
                } else {
                    c8367.m22529((C3147) treeSet.first());
                }
            }
        }
    }
}
