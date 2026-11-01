package l;

/* JADX INFO: renamed from: l.᩹ۘ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: TATF */
/* JADX INFO: loaded from: classes.dex */
public final class C22043 {

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final C22043[] f71442 = new C22043[1001];

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f71443;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f71444;

    public C22043(int i, int i2) {
        this.f71443 = i;
        this.f71444 = i2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C22043 m48958(int i, int i2) {
        if (i != i2 || i < 0 || i > 1000) {
            return new C22043(i, i2);
        }
        C22043[] c22043Arr = f71442;
        if (c22043Arr[i] == null) {
            c22043Arr[i] = new C22043(i, i);
        }
        return c22043Arr[i];
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof C22043)) {
            C22043 c22043 = (C22043) obj;
            if (this.f71443 == c22043.f71443 && this.f71444 == c22043.f71444) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f71443 + 713) * 31) + this.f71444;
    }

    public final String toString() {
        return this.f71443 + ".." + this.f71444;
    }
}
