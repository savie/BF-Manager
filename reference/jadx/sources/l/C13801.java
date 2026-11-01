package l;

/* JADX INFO: renamed from: l.ܰۨܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: L8S9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C13801 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f45554;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean f45555;

    public C13801(int i, boolean z) {
        this.f45554 = i;
        this.f45555 = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C13801.class != obj.getClass()) {
            return false;
        }
        C13801 c13801 = (C13801) obj;
        return this.f45554 == c13801.f45554 && this.f45555 == c13801.f45555;
    }

    public final int hashCode() {
        return (this.f45554 * 31) + (this.f45555 ? 1 : 0);
    }
}
