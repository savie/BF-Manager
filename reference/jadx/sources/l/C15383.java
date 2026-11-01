package l;

/* JADX INFO: renamed from: l.ܶܿ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: C1US */
/* JADX INFO: loaded from: classes4.dex */
public final class C15383 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public long f50075;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public long f50076;

    public C15383(long j, long j2) {
        this.f50076 = j;
        this.f50075 = j2;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final long m36821() {
        return this.f50076;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long m36820() {
        return this.f50075;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C15383.class == obj.getClass()) {
            C15383 c15383 = (C15383) obj;
            if (this.f50076 == c15383.f50076 && this.f50075 == c15383.f50075) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f50076;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        long j2 = this.f50075;
        return i + ((int) (j2 ^ (j2 >>> 32)));
    }
}
