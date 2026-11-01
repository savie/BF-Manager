package l;

/* JADX INFO: renamed from: l.ۡ۠ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 98OO */
/* JADX INFO: loaded from: classes3.dex */
public final class C8750 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final Object f30071;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C13689 f30072;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final Object f30073;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f30074;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int f30075;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final long f30076;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final long f30077;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f30078;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int f30079;

    public C8750(Object obj, int i, C13689 c13689, Object obj2, int i2, long j, long j2, int i3, int i4) {
        this.f30073 = obj;
        this.f30075 = i;
        this.f30072 = c13689;
        this.f30071 = obj2;
        this.f30079 = i2;
        this.f30077 = j;
        this.f30076 = j2;
        this.f30074 = i3;
        this.f30078 = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C8750.class == obj.getClass()) {
            C8750 c8750 = (C8750) obj;
            if (this.f30075 == c8750.f30075 && this.f30079 == c8750.f30079 && this.f30077 == c8750.f30077 && this.f30076 == c8750.f30076 && this.f30074 == c8750.f30074 && this.f30078 == c8750.f30078 && C13638.equals(this.f30072, c8750.f30072) && C13638.equals(this.f30073, c8750.f30073) && C13638.equals(this.f30071, c8750.f30071)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return C13638.hash(this.f30073, Integer.valueOf(this.f30075), this.f30072, this.f30071, Integer.valueOf(this.f30079), Long.valueOf(this.f30077), Long.valueOf(this.f30076), Integer.valueOf(this.f30074), Integer.valueOf(this.f30078));
    }

    public final String toString() {
        String str = "mediaItem=" + this.f30075 + ", period=" + this.f30079 + ", pos=" + this.f30077;
        int i = this.f30074;
        if (i == -1) {
            return str;
        }
        StringBuilder sbM8976 = C3012.m8976(str, ", contentPos=");
        sbM8976.append(this.f30076);
        sbM8976.append(", adGroup=");
        sbM8976.append(i);
        sbM8976.append(", ad=");
        sbM8976.append(this.f30078);
        return sbM8976.toString();
    }

    static {
        C9023.m23358(0, 1, 2, 3, 4);
        C17983.m41806(5);
        C17983.m41806(6);
    }
}
