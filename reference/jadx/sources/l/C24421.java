package l;

/* JADX INFO: renamed from: l.᩺ܽ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 69LN */
/* JADX INFO: loaded from: classes.dex */
public class C24421 implements Comparable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f79288;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f79289;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Integer.compare(this.f79289, ((C24421) obj).f79289);
    }

    public C24421() {
    }

    public C24421(int i, int i2) {
        this.f79289 = i;
        this.f79288 = i2;
    }

    public final String toString() {
        return this.f79289 + " - " + this.f79288;
    }
}
