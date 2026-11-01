package l;

/* JADX INFO: renamed from: l.᩹۠ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: AB81 */
/* JADX INFO: loaded from: classes.dex */
public final class C22165 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC5231 f72502;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final AbstractC5231 f72503;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C22165)) {
            return false;
        }
        C22165 c22165 = (C22165) obj;
        return this.f72503.equals(c22165.f72503) && this.f72502.equals(c22165.f72502);
    }

    public final int hashCode() {
        return this.f72502.hashCode() + (this.f72503.hashCode() * 31);
    }

    public C22165(AbstractC5231 abstractC5231, String str) {
        this.f72503 = abstractC5231;
        this.f72502 = abstractC5231.mo14424(str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m49176() {
        return this.f72503.mo14423() == EnumC2408.METHOD;
    }

    public final String toString() {
        return this.f72503.toString() + " -> " + this.f72502.f18142;
    }
}
