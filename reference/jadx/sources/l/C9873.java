package l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۢۘ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: M1N0 */
/* JADX INFO: loaded from: classes4.dex */
public final class C9873 extends AbstractC22113 implements InterfaceC15224, InterfaceC19597 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C15399 f31771;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public C13602 f31772;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9873(C15399 c15399) {
        super(c15399);
        this.f31771 = c15399;
    }

    @Override // l.AbstractC22113
    /* JADX INFO: renamed from: ۙ */
    public final void mo8158(int i, Object obj) {
        C13602 c13602 = new C13602(this.f31771, i);
        this.f31772 = c13602;
        ((Consumer) obj).accept(c13602);
    }

    @Override // java.util.Iterator
    public final Object next() {
        C13602 c13602 = new C13602(this.f31771, m50066());
        this.f31772 = c13602;
        return c13602;
    }

    @Override // l.AbstractC22113, java.util.Iterator
    public final void remove() {
        super.remove();
        this.f31772.f43199 = -1;
    }
}
