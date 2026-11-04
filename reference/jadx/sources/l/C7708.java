package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.۟ۜۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q6DB */
/* JADX INFO: loaded from: classes4.dex */
public final class C7708 extends AbstractC16700 implements InterfaceC14892 {
    @Override // l.InterfaceC14892
    /* JADX INFO: renamed from: ۤ */
    public final boolean mo7323(C2551 c2551, InterfaceC18213 interfaceC18213) {
        return true;
    }

    @Override // l.InterfaceC14892
    /* JADX INFO: renamed from: ᩷ */
    public final void mo13866(C2551 c2551, InterfaceC18213 interfaceC18213) {
    }

    @Override // l.AbstractC16700, l.InterfaceC13673
    /* JADX INFO: renamed from: ۙ */
    public final void mo1737(C2551 c2551) {
        if (c2551.m8524()) {
            return;
        }
        C24590.m54904(c2551, this);
    }

    @Override // l.InterfaceC14892
    /* JADX INFO: renamed from: ۙ */
    public final void mo18704(C2551 c2551, InterfaceC23435 interfaceC23435) {
        Iterator it = interfaceC23435.mo1986().iterator();
        while (it.hasNext()) {
            ((C18959) it.next()).mo14761(new C5331(2, this));
        }
    }
}
