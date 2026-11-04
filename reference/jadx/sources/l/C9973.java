package l;

/* JADX INFO: renamed from: l.ۢ۟۫, reason: contains not printable characters */
/* JADX INFO: compiled from: Z9YI */
/* JADX INFO: loaded from: classes3.dex */
public final class C9973 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f32068;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final String f32069;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final int f32070;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final String f32071;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int f32072;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String f32073;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final String f32074;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C9973 m25816(int i, AbstractC0148 abstractC0148) {
        if (abstractC0148 instanceof C12957) {
            return new C9973(i, (C12957) abstractC0148);
        }
        throw new RuntimeException();
    }

    public C9973(int i, C12957 c12957) {
        this.f32070 = i;
        this.f32073 = c12957.f41529;
        this.f32072 = c12957.f41530;
        this.f32068 = c12957.f41526;
        this.f32071 = c12957.f41528;
        this.f32074 = c12957.f41527;
        this.f32069 = c12957.f1128;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C9973.class != obj.getClass()) {
            return false;
        }
        C9973 c9973 = (C9973) obj;
        if (this.f32070 == c9973.f32070 && this.f32072 == c9973.f32072 && this.f32073.equals(c9973.f32073) && this.f32068.equals(c9973.f32068) && this.f32071.equals(c9973.f32071)) {
            return this.f32074.equals(c9973.f32074);
        }
        return false;
    }

    public final int hashCode() {
        return this.f32074.hashCode() + C12351.m30817(C12351.m30817((C12351.m30817(this.f32070 * 31, 31, this.f32073) + this.f32072) * 31, 31, this.f32068), 31, this.f32071);
    }
}
