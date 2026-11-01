package l;

/* JADX INFO: renamed from: l.ܰۙۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: R9RN */
/* JADX INFO: loaded from: classes3.dex */
public final class C13583 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f44785;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f44786;

    public C13583(int i, int i2) {
        this.f44785 = i;
        this.f44786 = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C13583.class == obj.getClass()) {
            C13583 c13583 = (C13583) obj;
            if (this.f44785 == c13583.f44785 && this.f44786 == c13583.f44786) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f44785 * 31) + this.f44786;
    }
}
