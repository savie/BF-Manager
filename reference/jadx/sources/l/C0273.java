package l;

/* JADX INFO: renamed from: l.֡۟ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: H8UA */
/* JADX INFO: loaded from: classes2.dex */
public final class C0273 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final C0273 f1569 = new C0273(0, false);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f1570;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean f1571;

    public C0273(int i, boolean z) {
        this.f1570 = i;
        this.f1571 = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0273.class != obj.getClass()) {
            return false;
        }
        C0273 c0273 = (C0273) obj;
        return this.f1570 == c0273.f1570 && this.f1571 == c0273.f1571;
    }

    public final int hashCode() {
        return (this.f1570 << 1) + (this.f1571 ? 1 : 0);
    }
}
