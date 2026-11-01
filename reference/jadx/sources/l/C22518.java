package l;

/* JADX INFO: renamed from: l.᩹᩶ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes.dex */
public final class C22518 implements Cloneable {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f73487;

    public C22518(byte[] bArr) {
        int i = (bArr[1] << 8) & 65280;
        this.f73487 = i;
        this.f73487 = i + (bArr[0] & 255);
    }

    public C22518() {
        this.f73487 = 38651;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof C22518)) {
            if (this.f73487 == ((C22518) obj).f73487) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m50032() {
        return this.f73487;
    }

    public final int hashCode() {
        return this.f73487;
    }
}
