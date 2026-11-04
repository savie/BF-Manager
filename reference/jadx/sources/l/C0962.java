package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.֨ۚܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: D9KC */
/* JADX INFO: loaded from: classes3.dex */
public final class C0962 extends AbstractC8637 {
    @Override // l.AbstractC8637
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int mo3832(AbstractC4691 abstractC4691) {
        C9164 c9164 = (C9164) abstractC4691;
        if (c9164.f49059 == null) {
            c9164.f49059 = c9164.f29744.toByteArray();
        }
        return c9164.f49059.length;
    }

    @Override // l.AbstractC8637
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo3833(AbstractC4691 abstractC4691, C1180 c1180) throws IOException {
        C9164 c9164 = (C9164) abstractC4691;
        if (c9164.f49059 == null) {
            c9164.f49059 = c9164.f29744.toByteArray();
        }
        c1180.write(c9164.f49059);
    }
}
