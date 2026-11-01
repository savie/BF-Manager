package l;

/* JADX INFO: renamed from: l.֨ܰ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: D70T */
/* JADX INFO: loaded from: classes2.dex */
public final class C1167 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int f5224;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f5225;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final InterfaceC18745 f5226;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C5070 f5227;

    public C1167(C3658 c3658) {
        this.f5226 = c3658.f13401;
        this.f5224 = c3658.f13399;
        this.f5225 = c3658.f13400;
        this.f5227 = c3658.f13402;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1167) {
            C1167 c1167 = (C1167) obj;
            if (this.f5226 == c1167.f5226 && this.f5224 == c1167.f5224 && this.f5225 == c1167.f5225 && this.f5227 == c1167.f5227) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f5227) + (((((System.identityHashCode(this.f5226) * 31) + this.f5224) * 31) + this.f5225) * 31);
    }
}
