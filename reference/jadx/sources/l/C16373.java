package l;

/* JADX INFO: renamed from: l.ܽۗ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: 69LN */
/* JADX INFO: loaded from: classes4.dex */
public class C16373 implements Comparable {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f52691;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f52692;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Integer.compare(this.f52692, ((C16373) obj).f52692);
    }

    public C16373() {
    }

    public C16373(int i, int i2) {
        this.f52692 = i;
        this.f52691 = i2;
    }

    public final String toString() {
        return this.f52692 + " - " + this.f52691;
    }
}
