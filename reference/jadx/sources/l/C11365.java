package l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۧۘ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: K9H */
/* JADX INFO: loaded from: classes4.dex */
public final class C11365 extends AbstractC3162 implements InterfaceC15224, InterfaceC19597 {

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final C15840 f35778;

    public C11365(C24046 c24046) {
        super(c24046);
        this.f35778 = new C15840(c24046);
    }

    @Override // l.AbstractC3162
    /* JADX INFO: renamed from: ۙ */
    public final void mo10343(int i, Object obj) {
        C15840 c15840 = this.f35778;
        c15840.f51511 = i;
        ((Consumer) obj).accept(c15840);
    }

    @Override // java.util.Iterator
    public final Object next() {
        int iM10342 = m10342();
        C15840 c15840 = this.f35778;
        c15840.f51511 = iM10342;
        return c15840;
    }
}
