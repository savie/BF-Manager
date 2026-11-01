package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ܽۛ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 39IB */
/* JADX INFO: loaded from: classes4.dex */
public final class C16462 extends AbstractC18909 {
    @Override // l.AbstractC18909
    /* JADX INFO: renamed from: ۙ */
    public final int mo10037(AbstractC9032 abstractC9032) {
        return ((C12229) abstractC9032).f76110.length + 1;
    }

    @Override // l.AbstractC18909
    /* JADX INFO: renamed from: ۙ */
    public final void mo10038(AbstractC9032 abstractC9032, C15382 c15382) throws IOException {
        C12229 c12229 = (C12229) abstractC9032;
        c15382.write(c12229.f40860);
        c15382.write(c12229.f76110);
    }
}
