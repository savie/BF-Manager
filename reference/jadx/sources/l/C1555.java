package l;

/* JADX INFO: renamed from: l.֫ۗ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: 59KW */
/* JADX INFO: loaded from: classes2.dex */
public final class C1555 implements Comparable {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f6285;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f6286;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C1555 c1555 = (C1555) obj;
        return -Integer.compare(this.f6285 - this.f6286, c1555.f6285 - c1555.f6286);
    }

    public C1555(int i, int i2) {
        this.f6286 = i;
        this.f6285 = i2;
    }
}
