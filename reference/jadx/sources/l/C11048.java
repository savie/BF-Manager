package l;

/* JADX INFO: renamed from: l.ۤᩳܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: C12B */
/* JADX INFO: loaded from: classes3.dex */
public final class C11048 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f34869;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public long f34870;

    public C11048(C8002 c8002) {
        this.f34870 = c8002.getSize();
        this.f34869 = c8002.m21825();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C11048.class == obj.getClass()) {
            C11048 c11048 = (C11048) obj;
            if (this.f34870 == c11048.f34870 && this.f34869 == c11048.f34869) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f34870;
        return (((int) (j ^ (j >>> 32))) * 31) + this.f34869;
    }
}
