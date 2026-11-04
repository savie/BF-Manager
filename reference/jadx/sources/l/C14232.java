package l;

/* JADX INFO: renamed from: l.ܰ֡ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: GBHS */
/* JADX INFO: loaded from: classes4.dex */
public final class C14232 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C3046 f44961;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public InterfaceC22239 f44962;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f44963;

    public /* synthetic */ C14232(int i) {
        this();
    }

    public C14232() {
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m34549(int i, InterfaceC22239 interfaceC22239, C3046 c3046) {
        this.f44963 = i;
        this.f44962 = interfaceC22239;
        this.f44961 = c3046;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C20946 m34548() {
        return new C20946(this.f44963, this.f44962, this.f44961);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C20946) {
            return ((C20946) obj).m47884(this.f44963, this.f44962, this.f44961);
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f44963;
        InterfaceC22239 interfaceC22239 = this.f44962;
        C3046 c3046 = this.f44961;
        int i2 = C20946.f67008;
        return ((interfaceC22239.hashCode() + ((c3046 != null ? c3046.hashCode() : 0) * 31)) * 31) + i;
    }
}
