package l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۙ᩵ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: DD2 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4858 extends AbstractC22498 implements InterfaceC6269, InterfaceC6206 {

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6975 f17112;

    @Override // l.AbstractC22498
    /* JADX INFO: renamed from: ۙ */
    public final void mo5667(int i, Object obj) {
        ((Consumer) obj).accept(this.f17112.f23476[i]);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4858(C6975 c6975) {
        super(c6975);
        this.f17112 = c6975;
    }

    @Override // java.util.Iterator
    public final Object next() {
        return this.f17112.f23476[m50014()];
    }
}
