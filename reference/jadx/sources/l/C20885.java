package l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.᩵᩹᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 97L */
/* JADX INFO: loaded from: classes5.dex */
public final class C20885 extends AbstractC21631 implements InterfaceC15224, InterfaceC19597 {

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final C4477 f66840;

    public C20885(C19393 c19393) {
        super(c19393);
        this.f66840 = new C4477(c19393);
    }

    @Override // l.AbstractC21631
    /* JADX INFO: renamed from: ۙ */
    public final void mo3081(int i, Object obj) {
        C4477 c4477 = this.f66840;
        c4477.f16015 = i;
        ((Consumer) obj).accept(c4477);
    }

    @Override // java.util.Iterator
    public final Object next() {
        int iM49168 = m49168();
        C4477 c4477 = this.f66840;
        c4477.f16015 = iM49168;
        return c4477;
    }
}
