package l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۙ۠ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: H1MW */
/* JADX INFO: loaded from: classes3.dex */
public final class C4527 extends AbstractC22167 implements InterfaceC6269, InterfaceC6206 {

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6644 f16116;

    @Override // l.AbstractC22167
    /* JADX INFO: renamed from: ۙ */
    public final void mo6482(int i, Object obj) {
        ((Consumer) obj).accept(this.f16116.f22442[i]);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4527(C6644 c6644) {
        super(c6644);
        this.f16116 = c6644;
    }

    @Override // java.util.Iterator
    public final Object next() {
        return this.f16116.f22442[m49177()];
    }
}
