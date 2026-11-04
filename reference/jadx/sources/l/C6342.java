package l;

/* JADX INFO: renamed from: l.ۛۤ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes3.dex */
public final class C6342 implements Cloneable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f21468;

    public C6342(byte[] bArr) {
        int i = (bArr[1] << 8) & 65280;
        this.f21468 = i;
        this.f21468 = i + (bArr[0] & 255);
    }

    public C6342() {
        this.f21468 = 38651;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof C6342)) {
            if (this.f21468 == ((C6342) obj).f21468) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m18069() {
        return this.f21468;
    }

    public final int hashCode() {
        return this.f21468;
    }
}
