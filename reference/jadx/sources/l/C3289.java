package l;

import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: l.ۗ۠᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: HAYQ */
/* JADX INFO: loaded from: classes3.dex */
public final class C3289 extends AbstractC8466 implements InterfaceC23427 {

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final C15374 f10712;

    public C3289(C15374 c15374) {
        this.f10712 = c15374;
    }

    @Override // l.InterfaceC7721
    /* JADX INFO: renamed from: ᩷ */
    public final void mo1765(Throwable th) {
        this.f10712.m36827(m49905());
    }

    @Override // l.InterfaceC23427
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo10833(Throwable th) {
        C15374 c15374M49905 = m49905();
        if (th instanceof CancellationException) {
            return true;
        }
        return c15374M49905.m36827(th) && c15374M49905.mo19278();
    }
}
