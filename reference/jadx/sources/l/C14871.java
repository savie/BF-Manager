package l;

/* JADX INFO: renamed from: l.ܰ᩷᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: L8S9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C14871 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f48597;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean f48598;

    public C14871(int i, boolean z) {
        this.f48597 = i;
        this.f48598 = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C14871.class != obj.getClass()) {
            return false;
        }
        C14871 c14871 = (C14871) obj;
        return this.f48597 == c14871.f48597 && this.f48598 == c14871.f48598;
    }

    public final int hashCode() {
        return (this.f48597 * 31) + (this.f48598 ? 1 : 0);
    }
}
