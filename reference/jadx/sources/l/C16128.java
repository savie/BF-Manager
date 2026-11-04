package l;

/* JADX INFO: renamed from: l.ܶܰۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: 36HO */
/* JADX INFO: loaded from: classes5.dex */
public final class C16128 implements InterfaceC11653 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f52410;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final InterfaceC16874 f52411;

    public C16128(InterfaceC16874 interfaceC16874, int i) {
        C17359.requireNonNull(interfaceC16874);
        this.f52411 = interfaceC16874;
        this.f52410 = i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m38286() {
        return this.f52410;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final InterfaceC16874 m38287() {
        return this.f52411;
    }

    @Override // l.InterfaceC11653
    /* JADX INFO: renamed from: ۘ */
    public final EnumC1959 mo8493() {
        return EnumC1959.DECLARATION;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16128)) {
            return false;
        }
        return this.f52411.equals(((C16128) obj).f52411);
    }

    public final int hashCode() {
        return this.f52411.hashCode();
    }

    public final String toString() {
        return "NodeDeclareRef{" + this.f52411 + '}';
    }
}
