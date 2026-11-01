package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ܶۛ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: D9KC */
/* JADX INFO: loaded from: classes4.dex */
public final class C15051 extends AbstractC18909 {
    @Override // l.AbstractC18909
    /* JADX INFO: renamed from: ۙ */
    public final int mo10037(AbstractC9032 abstractC9032) {
        C21400 c21400 = (C21400) abstractC9032;
        if (c21400.f63981 == null) {
            c21400.f63981 = c21400.f69578.toByteArray();
        }
        return c21400.f63981.length;
    }

    @Override // l.AbstractC18909
    /* JADX INFO: renamed from: ۙ */
    public final void mo10038(AbstractC9032 abstractC9032, C15382 c15382) throws IOException {
        C21400 c21400 = (C21400) abstractC9032;
        if (c21400.f63981 == null) {
            c21400.f63981 = c21400.f69578.toByteArray();
        }
        c15382.write(c21400.f63981);
    }
}
