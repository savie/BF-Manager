package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ۚ֫ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 39IB */
/* JADX INFO: loaded from: classes3.dex */
public final class C5327 extends AbstractC8637 {
    @Override // l.AbstractC8637
    /* JADX INFO: renamed from: ۙ */
    public final int mo3832(AbstractC4691 abstractC4691) {
        return ((C1598) abstractC4691).f56232.length + 1;
    }

    @Override // l.AbstractC8637
    /* JADX INFO: renamed from: ۙ */
    public final void mo3833(AbstractC4691 abstractC4691, C1180 c1180) throws IOException {
        C1598 c1598 = (C1598) abstractC4691;
        c1180.write(c1598.f5497);
        c1180.write(c1598.f56232);
    }
}
