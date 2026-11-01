package l;

/* JADX INFO: renamed from: l.᩻ᩴۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 78PS */
/* JADX INFO: loaded from: classes.dex */
public final class C23876 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final float f77161;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long f77162;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final long f77163;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final long f77164;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final float f77165;

    static {
        new C11176().m28113();
        C17983.m41806(0);
        C17983.m41806(1);
        C17983.m41806(2);
        C17983.m41806(3);
        C17983.m41806(4);
    }

    public C23876(C11176 c11176) {
        long j = c11176.f37863;
        long j2 = c11176.f37864;
        long j3 = c11176.f37862;
        float f = c11176.f37861;
        float f2 = c11176.f37865;
        this.f77163 = j;
        this.f77164 = j2;
        this.f77162 = j3;
        this.f77161 = f;
        this.f77165 = f2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C11176 m52613() {
        return new C11176(this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C23876)) {
            return false;
        }
        C23876 c23876 = (C23876) obj;
        return this.f77163 == c23876.f77163 && this.f77164 == c23876.f77164 && this.f77162 == c23876.f77162 && this.f77161 == c23876.f77161 && this.f77165 == c23876.f77165;
    }

    public final int hashCode() {
        long j = this.f77163;
        long j2 = this.f77164;
        int i = ((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.f77162;
        int i2 = (i + ((int) (j3 ^ (j3 >>> 32)))) * 31;
        float f = this.f77161;
        int iFloatToIntBits = (i2 + (f != 0.0f ? Float.floatToIntBits(f) : 0)) * 31;
        float f2 = this.f77165;
        return iFloatToIntBits + (f2 != 0.0f ? Float.floatToIntBits(f2) : 0);
    }
}
