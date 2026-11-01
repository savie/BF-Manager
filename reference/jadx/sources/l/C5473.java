package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ۚܽ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: NAWS */
/* JADX INFO: loaded from: classes3.dex */
public final class C5473 implements InterfaceC22407 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C15352 f18844;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final AbstractC11348 f18845;

    /* JADX WARN: Multi-variable type inference failed */
    public C5473(C15352 c15352, InterfaceC15456 interfaceC15456) {
        this.f18844 = c15352;
        this.f18845 = (AbstractC11348) interfaceC15456;
    }

    @Override // l.InterfaceC22407
    public final Iterator iterator() {
        return new C2650(this);
    }
}
