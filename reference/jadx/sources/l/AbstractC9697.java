package l;

/* JADX INFO: renamed from: l.ۡ᩹᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: 01SB */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC9697 extends AbstractC17076 {

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f31311 = 0;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f31310 = 0;

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo9706();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m25289(short[] sArr, int i) {
        mo9706();
        short s = sArr[i];
        int i2 = (this.f31311 >>> 11) * s;
        if (Integer.compare(this.f31310 ^ Integer.MIN_VALUE, Integer.MIN_VALUE ^ i2) < 0) {
            this.f31311 = i2;
            sArr[i] = (short) (s + ((2048 - s) >>> 5));
            return 0;
        }
        this.f31311 -= i2;
        this.f31310 -= i2;
        sArr[i] = (short) (s - (s >>> 5));
        return 1;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m25291(short[] sArr) {
        int iM25289 = 1;
        do {
            iM25289 = m25289(sArr, iM25289) | (iM25289 << 1);
        } while (iM25289 < sArr.length);
        return iM25289 - sArr.length;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m25290(int i) {
        int i2 = 0;
        do {
            mo9706();
            int i3 = this.f31311 >>> 1;
            this.f31311 = i3;
            int i4 = this.f31310;
            int i5 = (i4 - i3) >>> 31;
            this.f31310 = i4 - (i3 & (i5 - 1));
            i2 = (i2 << 1) | (1 - i5);
            i--;
        } while (i != 0);
        return i2;
    }
}
