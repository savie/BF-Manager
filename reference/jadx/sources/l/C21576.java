package l;

import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: l.᩸۫۠, reason: contains not printable characters */
/* JADX INFO: compiled from: HAYQ */
/* JADX INFO: loaded from: classes5.dex */
public final class C21576 extends AbstractC14666 implements InterfaceC15227 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C2339 f70020;

    @Override // l.InterfaceC15456
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo12440((Throwable) obj);
        return C7321.f24318;
    }

    public C21576(C2339 c2339) {
        this.f70020 = c2339;
    }

    @Override // l.AbstractC19460
    /* JADX INFO: renamed from: ܰ */
    public final void mo12440(Throwable th) {
        this.f70020.m7118(m10026());
    }

    @Override // l.InterfaceC15227
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo32009(Throwable th) {
        C2339 c2339M10026 = m10026();
        if (th instanceof CancellationException) {
            return true;
        }
        return c2339M10026.m7118(th) && c2339M10026.mo6332();
    }
}
