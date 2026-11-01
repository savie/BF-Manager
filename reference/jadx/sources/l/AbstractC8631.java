package l;

/* JADX INFO: renamed from: l.ۡۘۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: 01SB */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC8631 extends AbstractC12807 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f29782 = 0;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f29781 = 0;

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo19186();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m22426(short[] sArr, int i) {
        mo19186();
        short s = sArr[i];
        int i2 = (this.f29782 >>> 11) * s;
        if (Integer.compare(this.f29781 ^ Integer.MIN_VALUE, Integer.MIN_VALUE ^ i2) < 0) {
            this.f29782 = i2;
            sArr[i] = (short) (s + ((2048 - s) >>> 5));
            return 0;
        }
        this.f29782 -= i2;
        this.f29781 -= i2;
        sArr[i] = (short) (s - (s >>> 5));
        return 1;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int m22427(short[] sArr) {
        int iM22426 = 1;
        do {
            iM22426 = m22426(sArr, iM22426) | (iM22426 << 1);
        } while (iM22426 < sArr.length);
        return iM22426 - sArr.length;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m22425(int i) {
        int i2 = 0;
        do {
            mo19186();
            int i3 = this.f29782 >>> 1;
            this.f29782 = i3;
            int i4 = this.f29781;
            int i5 = (i4 - i3) >>> 31;
            this.f29781 = i4 - (i3 & (i5 - 1));
            i2 = (i2 << 1) | (1 - i5);
            i--;
        } while (i != 0);
        return i2;
    }
}
