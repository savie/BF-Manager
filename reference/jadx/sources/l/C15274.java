package l;

/* JADX INFO: renamed from: l.ܶܰܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: D8TG */
/* JADX INFO: loaded from: classes4.dex */
public final class C15274 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final Object f49778;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f49779;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final long f49780;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int f49781;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f49782;

    public C15274(Object obj) {
        this(-1L, obj);
    }

    public C15274(long j, Object obj) {
        this(obj, -1, -1, j, -1);
    }

    public C15274(int i, long j, Object obj) {
        this(obj, -1, -1, j, i);
    }

    public C15274(Object obj, int i, int i2, long j) {
        this(obj, i, i2, j, -1);
    }

    public C15274(Object obj, int i, int i2, long j, int i3) {
        this.f49778 = obj;
        this.f49779 = i;
        this.f49782 = i2;
        this.f49780 = j;
        this.f49781 = i3;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C15274 m36575(Object obj) {
        if (this.f49778.equals(obj)) {
            return this;
        }
        return new C15274(obj, this.f49779, this.f49782, this.f49780, this.f49781);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m36576() {
        return this.f49779 != -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15274)) {
            return false;
        }
        C15274 c15274 = (C15274) obj;
        return this.f49778.equals(c15274.f49778) && this.f49779 == c15274.f49779 && this.f49782 == c15274.f49782 && this.f49780 == c15274.f49780 && this.f49781 == c15274.f49781;
    }

    public final int hashCode() {
        return ((((((((this.f49778.hashCode() + 527) * 31) + this.f49779) * 31) + this.f49782) * 31) + ((int) this.f49780)) * 31) + this.f49781;
    }
}
