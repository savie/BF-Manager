package l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.۬᩵ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: DD2 */
/* JADX INFO: loaded from: classes4.dex */
public final class C13326 extends AbstractC22498 implements InterfaceC6269, InterfaceC6206 {

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6975 f44235;

    @Override // l.AbstractC22498
    /* JADX INFO: renamed from: ۙ */
    public final void mo5667(int i, Object obj) {
        ((Consumer) obj).accept(this.f44235.f23471[i]);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13326(C6975 c6975) {
        super(c6975);
        this.f44235 = c6975;
    }

    @Override // java.util.Iterator
    public final Object next() {
        return this.f44235.f23471[m50014()];
    }
}
