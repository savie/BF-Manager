package l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.֫۠ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: DD2 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1705 extends AbstractC22498 implements InterfaceC6269, InterfaceC6206 {

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public C2741 f6733;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6975 f6734;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1705(C6975 c6975) {
        super(c6975);
        this.f6734 = c6975;
    }

    @Override // l.AbstractC22498
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo5667(int i, Object obj) {
        C2741 c2741 = new C2741(this.f6734, i);
        this.f6733 = c2741;
        ((Consumer) obj).accept(c2741);
    }

    @Override // java.util.Iterator
    public final Object next() {
        C2741 c2741 = new C2741(this.f6734, m50014());
        this.f6733 = c2741;
        return c2741;
    }

    @Override // l.AbstractC22498, java.util.Iterator
    public final void remove() {
        super.remove();
        this.f6733.f10536 = -1;
    }
}
