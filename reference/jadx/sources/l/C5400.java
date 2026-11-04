package l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۚۘ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: K9H */
/* JADX INFO: loaded from: classes3.dex */
public final class C5400 extends AbstractC3162 implements InterfaceC15224, InterfaceC19597 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C24046 f18893;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public C15840 f18894;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5400(C24046 c24046) {
        super(c24046);
        this.f18893 = c24046;
    }

    @Override // l.AbstractC3162
    /* JADX INFO: renamed from: ۙ */
    public final void mo10343(int i, Object obj) {
        C15840 c15840 = new C15840(this.f18893, i);
        this.f18894 = c15840;
        ((Consumer) obj).accept(c15840);
    }

    @Override // java.util.Iterator
    public final Object next() {
        C15840 c15840 = new C15840(this.f18893, m10342());
        this.f18894 = c15840;
        return c15840;
    }

    @Override // l.AbstractC3162, java.util.Iterator
    public final void remove() {
        super.remove();
        this.f18894.f51511 = -1;
    }
}
