package l;

import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ᩳ᩷᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: U6AJ */
/* JADX INFO: loaded from: classes5.dex */
public final class C18307 extends C14075 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public boolean f58396;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final ArrayList f58397;

    @Override // l.C14075, l.AbstractC7724
    /* JADX INFO: renamed from: ۚ */
    public final void mo9290() {
    }

    public C18307(C10547 c10547, int i, InterfaceC15208 interfaceC15208) {
        super(c10547, i, interfaceC15208);
        int iM26685 = c10547.m26685(i);
        this.f58397 = new ArrayList();
        if (iM26685 >= 0) {
            for (InterfaceC2568 interfaceC2568 : interfaceC15208.mo14955()) {
                this.f58397.add(new C23247(interfaceC2568.getKey(), c10547.m26683().m23459(new C8430(c10547.f36110, interfaceC2568.mo8019() + iM26685, "sswitch_"))));
            }
            return;
        }
        this.f58396 = true;
        for (InterfaceC2568 interfaceC2569 : interfaceC15208.mo14955()) {
            this.f58397.add(new C15486(interfaceC2569.getKey(), interfaceC2569.mo8019()));
        }
    }

    @Override // l.C14075, l.AbstractC7724
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo1773(C12283 c12283) throws IOException {
        if (this.f58396) {
            c12283 = new C7330(c12283);
        }
        boolean z = this.f46226.f36110.f66203;
        c12283.getClass();
        c12283.write(".sparse-switch\n", 0, 15);
        c12283.m30527();
        for (AbstractC21835 abstractC21835 : this.f58397) {
            C0667.m2995(c12283, abstractC21835.m48605());
            c12283.write(" -> ", 0, 4);
            abstractC21835.mo37073(c12283);
            if (z) {
                m34043(c12283, abstractC21835.m48605());
            }
            c12283.write(10);
        }
        c12283.m30526();
        c12283.write(".end sparse-switch", 0, 18);
        return true;
    }
}
