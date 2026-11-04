package l;

/* JADX INFO: renamed from: l.ۘ᩹ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: TATF */
/* JADX INFO: loaded from: classes2.dex */
public final class C4467 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final C4467[] f15983 = new C4467[1001];

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f15984;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f15985;

    public C4467(int i, int i2) {
        this.f15984 = i;
        this.f15985 = i2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C4467 m14163(int i, int i2) {
        if (i != i2 || i < 0 || i > 1000) {
            return new C4467(i, i2);
        }
        C4467[] c4467Arr = f15983;
        if (c4467Arr[i] == null) {
            c4467Arr[i] = new C4467(i, i);
        }
        return c4467Arr[i];
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof C4467)) {
            C4467 c4467 = (C4467) obj;
            if (this.f15984 == c4467.f15984 && this.f15985 == c4467.f15985) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f15984 + 713) * 31) + this.f15985;
    }

    public final String toString() {
        return this.f15984 + ".." + this.f15985;
    }
}
