package l;

/* JADX INFO: renamed from: l.ۘ۠ۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: 16GJ */
/* JADX INFO: loaded from: classes3.dex */
public final class C4022 extends AbstractC16700 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C6990 f13730;

    @Override // l.AbstractC16700, l.InterfaceC13673
    /* JADX INFO: renamed from: ۙ */
    public final void mo8439(C1610 c1610) {
        this.f13730 = c1610.m5683();
    }

    @Override // l.AbstractC16700, l.InterfaceC13673
    /* JADX INFO: renamed from: ۙ */
    public final void mo1737(C2551 c2551) {
        if (c2551.m8524()) {
            return;
        }
        for (C18959 c18959 : c2551.m8506()) {
            if (c18959 instanceof AbstractC15251) {
                AbstractC15251 abstractC15251 = (AbstractC15251) c18959;
                InterfaceC21197 interfaceC21197M19302 = this.f13730.m19302(abstractC15251.mo18926());
                if (interfaceC21197M19302 != null) {
                    abstractC15251.mo17864(interfaceC21197M19302);
                }
            }
        }
    }
}
