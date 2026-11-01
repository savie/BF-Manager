package l;

/* JADX INFO: renamed from: l.֨ۡ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: C12B */
/* JADX INFO: loaded from: classes2.dex */
public final class C1023 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f4794;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public long f4795;

    public C1023(C12107 c12107) {
        this.f4795 = c12107.getSize();
        this.f4794 = c12107.m30126();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C1023.class == obj.getClass()) {
            C1023 c1023 = (C1023) obj;
            if (this.f4795 == c1023.f4795 && this.f4794 == c1023.f4794) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f4795;
        return (((int) (j ^ (j >>> 32))) * 31) + this.f4794;
    }
}
