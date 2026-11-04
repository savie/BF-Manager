package l;

/* JADX INFO: renamed from: l.ۢܽ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 59KW */
/* JADX INFO: loaded from: classes3.dex */
public final class C10248 implements Comparable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f32735;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f32736;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C10248 c10248 = (C10248) obj;
        return -Integer.compare(this.f32735 - this.f32736, c10248.f32735 - c10248.f32736);
    }

    public C10248(int i, int i2) {
        this.f32736 = i;
        this.f32735 = i2;
    }
}
