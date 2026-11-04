package l;

/* JADX INFO: renamed from: l.ۧۡܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: AB81 */
/* JADX INFO: loaded from: classes3.dex */
public final class C11511 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC1817 f36226;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final AbstractC1817 f36227;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11511)) {
            return false;
        }
        C11511 c11511 = (C11511) obj;
        return this.f36227.equals(c11511.f36227) && this.f36226.equals(c11511.f36226);
    }

    public final int hashCode() {
        return this.f36226.hashCode() + (this.f36227.hashCode() * 31);
    }

    public C11511(AbstractC1817 abstractC1817, String str) {
        this.f36227 = abstractC1817;
        this.f36226 = abstractC1817.mo6295(str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m28967() {
        return this.f36227.mo6296() == EnumC5546.METHOD;
    }

    public final String toString() {
        return this.f36227.toString() + " -> " + this.f36226.f6169;
    }
}
