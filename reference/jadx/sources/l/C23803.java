package l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.᩹᩶᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: WKX */
/* JADX INFO: loaded from: classes.dex */
public final class C23803 extends AbstractC21565 implements InterfaceC15224, InterfaceC19597 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C19327 f77104;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public C4411 f77105;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23803(C19327 c19327) {
        super(c19327);
        this.f77104 = c19327;
    }

    @Override // l.AbstractC21565
    /* JADX INFO: renamed from: ۙ */
    public final void mo2970(int i, Object obj) {
        C4411 c4411 = new C4411(this.f77104, i);
        this.f77105 = c4411;
        ((Consumer) obj).accept(c4411);
    }

    @Override // java.util.Iterator
    public final Object next() {
        C4411 c4411 = new C4411(this.f77104, m49040());
        this.f77105 = c4411;
        return c4411;
    }

    @Override // l.AbstractC21565, java.util.Iterator
    public final void remove() {
        super.remove();
        this.f77105.f15841 = -1;
    }
}
