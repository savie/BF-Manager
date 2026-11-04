package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ܺܿۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: E1HX */
/* JADX INFO: loaded from: classes5.dex */
public final class C16988 implements InterfaceC9772 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Appendable f55520;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C7381 f55521;

    public C16988(Appendable appendable, C7381 c7381) {
        this.f55520 = appendable;
        this.f55521 = c7381;
        c7381.m20282();
    }

    @Override // l.InterfaceC9772
    /* JADX INFO: renamed from: ᩷ */
    public final void mo25484(AbstractC17734 abstractC17734, int i) {
        try {
            abstractC17734.mo5150(this.f55520, i, this.f55521);
        } catch (IOException e) {
            throw new C12601(e);
        }
    }

    @Override // l.InterfaceC9772
    /* JADX INFO: renamed from: ۙ */
    public final void mo25483(AbstractC17734 abstractC17734, int i) {
        if (abstractC17734.mo5151().equals("#text")) {
            return;
        }
        try {
            abstractC17734.mo5152(this.f55520, i, this.f55521);
        } catch (IOException e) {
            throw new C12601(e);
        }
    }
}
