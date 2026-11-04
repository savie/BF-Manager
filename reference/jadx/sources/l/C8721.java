package l;

/* JADX INFO: renamed from: l.۠ܶۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: HAT6 */
/* JADX INFO: loaded from: classes4.dex */
public final class C8721 extends AbstractC7230 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean f28391;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int f28392;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f28393;

    public C8721(int i, int i2, boolean z) {
        this.f28392 = i;
        this.f28393 = i2;
        this.f28391 = z;
    }

    @Override // l.AbstractC7230
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo4584(AbstractC9488 abstractC9488, C2777 c2777) {
        if (!this.f28391) {
            c2777 = null;
        }
        return abstractC9488.mo6650(c2777, this.f28392, this.f28393);
    }

    public final int hashCode() {
        return C7103.m19444(C7103.m19447(C7103.m19447(C7103.m19447(0, this.f28392), this.f28393), this.f28391 ? 1 : 0), 3);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C8721)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        C8721 c8721 = (C8721) obj;
        return this.f28392 == c8721.f28392 && this.f28393 == c8721.f28393 && this.f28391 == c8721.f28391;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{");
        sb.append(this.f28392);
        sb.append(":");
        return C12669.m31437(this.f28393, "}?", sb);
    }
}
