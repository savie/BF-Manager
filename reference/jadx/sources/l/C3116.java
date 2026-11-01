package l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۗ۠ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: DD2 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3116 extends AbstractC22498 implements InterfaceC6269, InterfaceC6206 {

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final C2741 f11747;

    public C3116(C6975 c6975) {
        super(c6975);
        this.f11747 = new C2741(c6975);
    }

    @Override // l.AbstractC22498
    /* JADX INFO: renamed from: ۙ */
    public final void mo5667(int i, Object obj) {
        C2741 c2741 = this.f11747;
        c2741.f10536 = i;
        ((Consumer) obj).accept(c2741);
    }

    @Override // java.util.Iterator
    public final Object next() {
        int iM50014 = m50014();
        C2741 c2741 = this.f11747;
        c2741.f10536 = iM50014;
        return c2741;
    }
}
