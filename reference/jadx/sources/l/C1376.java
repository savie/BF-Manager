package l;

/* JADX INFO: renamed from: l.֨ᩴܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: D70T */
/* JADX INFO: loaded from: classes2.dex */
public final class C1376 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f4907;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final InterfaceC22808 f4908;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C10127 f4909;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f4910;

    public C1376(C8636 c8636) {
        this.f4908 = c8636.f28220;
        this.f4910 = c8636.f28222;
        this.f4907 = c8636.f28219;
        this.f4909 = c8636.f28221;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1376) {
            C1376 c1376 = (C1376) obj;
            if (this.f4908 == c1376.f4908 && this.f4910 == c1376.f4910 && this.f4907 == c1376.f4907 && this.f4909 == c1376.f4909) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f4909) + (((((System.identityHashCode(this.f4908) * 31) + this.f4910) * 31) + this.f4907) * 31);
    }
}
