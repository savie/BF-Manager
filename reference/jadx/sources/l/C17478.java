package l;

/* JADX INFO: renamed from: l.ܽۡܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: X4TD */
/* JADX INFO: loaded from: classes4.dex */
public final class C17478 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f56817;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f56818;

    public C17478(int i, int i2) {
        this.f56817 = i;
        this.f56818 = i2;
    }

    public final String toString() {
        return this.f56817 + ":" + this.f56818;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17478)) {
            return false;
        }
        C17478 c17478 = (C17478) obj;
        return this.f56817 == c17478.f56817 && this.f56818 == c17478.f56818;
    }

    public final int hashCode() {
        return (this.f56817 * 31) + this.f56818;
    }
}
