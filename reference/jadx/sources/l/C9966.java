package l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۤ֨ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: M1N0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C9966 extends AbstractC16316 implements InterfaceC6269, InterfaceC6206 {

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final C19844 f34071;

    public C9966(C10672 c10672) {
        super(c10672);
        this.f34071 = new C19844(c10672);
    }

    @Override // l.AbstractC16316
    /* JADX INFO: renamed from: ۙ */
    public final void mo19048(int i, Object obj) {
        C19844 c19844 = this.f34071;
        c19844.f63663 = i;
        ((Consumer) obj).accept(c19844);
    }

    @Override // java.util.Iterator
    public final Object next() {
        int iM38482 = m38482();
        C19844 c19844 = this.f34071;
        c19844.f63663 = iM38482;
        return c19844;
    }
}
