package l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.֡᩶᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: WKX */
/* JADX INFO: loaded from: classes3.dex */
public final class C0682 extends AbstractC21565 implements InterfaceC15224, InterfaceC19597 {

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C19327 f2578;

    @Override // l.AbstractC21565
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo2970(int i, Object obj) {
        ((Consumer) obj).accept(this.f2578.f62434[i]);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0682(C19327 c19327) {
        super(c19327);
        this.f2578 = c19327;
    }

    @Override // java.util.Iterator
    public final Object next() {
        return this.f2578.f62434[m49040()];
    }
}
