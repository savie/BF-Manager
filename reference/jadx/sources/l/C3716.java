package l;

/* JADX INFO: renamed from: l.ۗ᩹ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 78PS */
/* JADX INFO: loaded from: classes2.dex */
public final class C3716 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long f12770;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final long f12771;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final long f12772;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final float f12773;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final float f12774;

    static {
        new C23854().m53199();
        C7116.m19499(0);
        C7116.m19499(1);
        C7116.m19499(2);
        C7116.m19499(3);
        C7116.m19499(4);
    }

    public C3716(C23854 c23854) {
        long j = c23854.f77237;
        long j2 = c23854.f77236;
        long j3 = c23854.f77235;
        float f = c23854.f77239;
        float f2 = c23854.f77238;
        this.f12772 = j;
        this.f12771 = j2;
        this.f12770 = j3;
        this.f12774 = f;
        this.f12773 = f2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C23854 m12097() {
        return new C23854(this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3716)) {
            return false;
        }
        C3716 c3716 = (C3716) obj;
        return this.f12772 == c3716.f12772 && this.f12771 == c3716.f12771 && this.f12770 == c3716.f12770 && this.f12774 == c3716.f12774 && this.f12773 == c3716.f12773;
    }

    public final int hashCode() {
        long j = this.f12772;
        long j2 = this.f12771;
        int i = ((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.f12770;
        int i2 = (i + ((int) (j3 ^ (j3 >>> 32)))) * 31;
        float f = this.f12774;
        int iFloatToIntBits = (i2 + (f != 0.0f ? Float.floatToIntBits(f) : 0)) * 31;
        float f2 = this.f12773;
        return iFloatToIntBits + (f2 != 0.0f ? Float.floatToIntBits(f2) : 0);
    }
}
