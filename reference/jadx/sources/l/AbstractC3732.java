package l;

/* JADX INFO: renamed from: l.ۗ᩹᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: R1T1 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3732 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f12815;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f12816;

    public AbstractC3732(int i, int i2) {
        this.f12815 = i;
        this.f12816 = (1 << i2) - 1;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m12140(int i, int i2) {
        int i3 = this.f12815;
        return (i >> (8 - i3)) + ((i2 & this.f12816) << i3);
    }
}
