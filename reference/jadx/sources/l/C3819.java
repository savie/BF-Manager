package l;

/* JADX INFO: renamed from: l.ۘ۠ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: X4TD */
/* JADX INFO: loaded from: classes2.dex */
public final class C3819 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f14161;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f14162;

    public C3819(int i, int i2) {
        this.f14161 = i;
        this.f14162 = i2;
    }

    public final String toString() {
        return this.f14161 + ":" + this.f14162;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3819)) {
            return false;
        }
        C3819 c3819 = (C3819) obj;
        return this.f14161 == c3819.f14161 && this.f14162 == c3819.f14162;
    }

    public final int hashCode() {
        return (this.f14161 * 31) + this.f14162;
    }
}
