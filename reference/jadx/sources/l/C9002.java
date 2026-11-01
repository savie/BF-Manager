package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ۡܽ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: NAWS */
/* JADX INFO: loaded from: classes3.dex */
public final class C9002 implements InterfaceC22407 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC22407 f30792;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final AbstractC11348 f30793;

    /* JADX WARN: Multi-variable type inference failed */
    public C9002(InterfaceC22407 interfaceC22407, InterfaceC15456 interfaceC15456) {
        this.f30792 = interfaceC22407;
        this.f30793 = (AbstractC11348) interfaceC15456;
    }

    @Override // l.InterfaceC22407
    public final Iterator iterator() {
        return new C19585(this);
    }
}
