package l;

/* JADX INFO: renamed from: l.᩵֫ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: U7MS */
/* JADX INFO: loaded from: classes4.dex */
public final class C19147 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int f61845;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final double f61846;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final String f61847;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String f61848;

    public C19147(String str, double d) {
        this.f61848 = str;
        this.f61845 = 2;
        this.f61846 = d;
        this.f61847 = null;
    }

    public C19147(int i, String str, String str2) {
        boolean z = true;
        if (i == 1 && !str2.startsWith("0x") && !str2.startsWith("0X")) {
            z = false;
        }
        C2023.m6510(z);
        this.f61848 = str;
        this.f61845 = i;
        this.f61847 = str2;
        this.f61846 = 0.0d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19147)) {
            return false;
        }
        C19147 c19147 = (C19147) obj;
        return this.f61845 == c19147.f61845 && Double.compare(this.f61846, c19147.f61846) == 0 && C13638.equals(this.f61848, c19147.f61848) && C13638.equals(this.f61847, c19147.f61847);
    }

    public final int hashCode() {
        return C13638.hash(this.f61848, Integer.valueOf(this.f61845), Double.valueOf(this.f61846), this.f61847);
    }
}
