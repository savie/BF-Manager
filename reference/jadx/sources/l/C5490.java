package l;

/* JADX INFO: renamed from: l.ۚܿۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: H8UA */
/* JADX INFO: loaded from: classes2.dex */
public final class C5490 {

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final C5490 f18884 = new C5490(0, false);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f18885;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean f18886;

    public C5490(int i, boolean z) {
        this.f18885 = i;
        this.f18886 = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C5490.class != obj.getClass()) {
            return false;
        }
        C5490 c5490 = (C5490) obj;
        return this.f18885 == c5490.f18885 && this.f18886 == c5490.f18886;
    }

    public final int hashCode() {
        return (this.f18885 << 1) + (this.f18886 ? 1 : 0);
    }
}
