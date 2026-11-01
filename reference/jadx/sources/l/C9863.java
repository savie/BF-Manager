package l;

/* JADX INFO: renamed from: l.ۢ᩸᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: B9Q3 */
/* JADX INFO: loaded from: classes3.dex */
public final class C9863 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C2806 f33705;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f33706;

    public C9863(C2806 c2806, int i) {
        this.f33705 = c2806;
        this.f33706 = i;
    }

    public final int hashCode() {
        return (this.f33705.hashCode() * 65535) + this.f33706;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C9863)) {
            return false;
        }
        C9863 c9863 = (C9863) obj;
        return this.f33705 == c9863.f33705 && this.f33706 == c9863.f33706;
    }
}
