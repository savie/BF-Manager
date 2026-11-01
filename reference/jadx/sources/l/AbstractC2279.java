package l;

/* JADX INFO: renamed from: l.ۖۘۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: R1T1 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2279 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f8137;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f8138;

    public AbstractC2279(int i, int i2) {
        this.f8137 = i;
        this.f8138 = (1 << i2) - 1;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m6988(int i, int i2) {
        int i3 = this.f8137;
        return (i >> (8 - i3)) + ((i2 & this.f8138) << i3);
    }
}
