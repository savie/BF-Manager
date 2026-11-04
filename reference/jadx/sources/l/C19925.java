package l;

/* JADX INFO: renamed from: l.ᩴܺۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: X44P */
/* JADX INFO: loaded from: classes5.dex */
public final class C19925 implements Comparable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final InterfaceC10974 f64085;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final InterfaceC24329 f64086;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f64087;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f64087 - ((C19925) obj).f64087;
    }

    public C19925(InterfaceC24329 interfaceC24329, InterfaceC10974 interfaceC10974, int i) {
        this.f64086 = interfaceC24329;
        this.f64085 = interfaceC10974;
        this.f64087 = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C19925)) {
            return false;
        }
        C19925 c19925 = (C19925) obj;
        return this.f64086.equals(c19925.f64086) && this.f64085.equals(c19925.f64085) && this.f64087 == c19925.f64087;
    }

    public final int hashCode() {
        return C17359.hash(this.f64086, this.f64085, Integer.valueOf(this.f64087));
    }
}
