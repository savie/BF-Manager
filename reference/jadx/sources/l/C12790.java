package l;

/* JADX INFO: renamed from: l.۬֨᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 0B0D */
/* JADX INFO: loaded from: classes4.dex */
public final class C12790 implements InterfaceC20592 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Class f42612;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC7186 f42613;

    public C12790(Class cls, AbstractC7186 abstractC7186) {
        this.f42612 = cls;
        this.f42613 = abstractC7186;
    }

    @Override // l.InterfaceC20592
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC7186 mo5183(C6044 c6044, C11730 c11730) {
        if (c11730.m29316() == this.f42612) {
            return this.f42613;
        }
        return null;
    }

    public final String toString() {
        return "Factory[type=" + this.f42612.getName() + ",adapter=" + this.f42613 + "]";
    }
}
