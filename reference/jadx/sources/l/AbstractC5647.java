package l;

/* JADX INFO: renamed from: l.ۚ᩹ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 01M8 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5647 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int f19308;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int f19310;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f19309 = 0;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f19311 = 0;

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo8576(int i, int i2, int i3, int i4);

    public AbstractC5647(int i, int i2) {
        this.f19310 = i;
        this.f19308 = i2;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int m15543() {
        return this.f19309;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int m15542() {
        return this.f19311;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int m15538() {
        return this.f19310;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int m15541() {
        return this.f19308;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m15540(int i, int i2, int i3) {
        m15544(i, i2, i + i3, i3 + i2);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m15544(int i, int i2, int i3, int i4) {
        if (i == i3 && i2 == i4) {
            return;
        }
        int i5 = this.f19309;
        if (i5 != i || this.f19311 != i2) {
            mo8576(i5, this.f19311, i, i2);
        }
        this.f19309 = i3;
        this.f19311 = i4;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m15539() {
        int i = this.f19309;
        int i2 = this.f19308;
        int i3 = this.f19310;
        if (i3 == i && i2 == this.f19311) {
            return;
        }
        mo8576(i, this.f19311, i3, i2);
        this.f19309 = i3;
        this.f19311 = i2;
    }
}
