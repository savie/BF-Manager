package l;

/* JADX INFO: renamed from: l.ۛ᩵֨, reason: contains not printable characters */
/* JADX INFO: compiled from: Z9YI */
/* JADX INFO: loaded from: classes2.dex */
public final class C6254 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final int f21209;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final String f21210;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f21211;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int f21212;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final String f21213;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String f21214;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final String f21215;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C6254 m17321(int i, AbstractC12068 abstractC12068) {
        if (abstractC12068 instanceof C1315) {
            return new C6254(i, (C1315) abstractC12068);
        }
        throw new RuntimeException();
    }

    public C6254(int i, C1315 c1315) {
        this.f21209 = i;
        this.f21214 = c1315.f5606;
        this.f21212 = c1315.f5602;
        this.f21211 = c1315.f5603;
        this.f21215 = c1315.f5604;
        this.f21210 = c1315.f5605;
        this.f21213 = c1315.f40395;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C6254.class != obj.getClass()) {
            return false;
        }
        C6254 c6254 = (C6254) obj;
        if (this.f21209 == c6254.f21209 && this.f21212 == c6254.f21212 && this.f21214.equals(c6254.f21214) && this.f21211.equals(c6254.f21211) && this.f21215.equals(c6254.f21215)) {
            return this.f21210.equals(c6254.f21210);
        }
        return false;
    }

    public final int hashCode() {
        return this.f21210.hashCode() + C13958.m33812(C13958.m33812((C13958.m33812(this.f21209 * 31, 31, this.f21214) + this.f21212) * 31, 31, this.f21211), 31, this.f21215);
    }
}
