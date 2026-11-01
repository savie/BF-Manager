package l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.᩵֨ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: M1N0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C19138 extends AbstractC16316 implements InterfaceC6269, InterfaceC6206 {

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public C19844 f61814;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10672 f61815;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19138(C10672 c10672) {
        super(c10672);
        this.f61815 = c10672;
    }

    @Override // l.AbstractC16316
    /* JADX INFO: renamed from: ۙ */
    public final void mo19048(int i, Object obj) {
        C19844 c19844 = new C19844(this.f61815, i);
        this.f61814 = c19844;
        ((Consumer) obj).accept(c19844);
    }

    @Override // java.util.Iterator
    public final Object next() {
        C19844 c19844 = new C19844(this.f61815, m38482());
        this.f61814 = c19844;
        return c19844;
    }

    @Override // l.AbstractC16316, java.util.Iterator
    public final void remove() {
        super.remove();
        this.f61814.f63663 = -1;
    }
}
