package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.᩸֨ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 439X */
/* JADX INFO: loaded from: classes.dex */
public final class C22460 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final byte[] f72688;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f72689;

    public C22460(byte[] bArr) {
        int length = bArr.length;
        if (length < 0) {
            throw new IllegalArgumentException("end < start");
        }
        if (length > bArr.length) {
            throw new IllegalArgumentException("end > bytes.length");
        }
        this.f72688 = bArr;
        this.f72689 = length;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m50636() {
        return this.f72689;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C22460 m50638(int i, int i2) {
        m50635(i, i2);
        return new C22460(Arrays.copyOfRange(this.f72688, i, i2));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m50637(int i) {
        m50635(i, i + 1);
        return this.f72688[i];
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int m50644(int i) {
        m50635(i, i + 2);
        return m50633(i + 1) | (this.f72688[i] << 8);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m50643(int i) {
        m50635(i, i + 4);
        return m50633(i + 3) | (this.f72688[i] << 24) | (m50633(i + 1) << 16) | (m50633(i + 2) << 8);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final long m50640(int i) {
        m50635(i, i + 8);
        byte[] bArr = this.f72688;
        int iM50633 = (bArr[i] << 24) | (m50633(i + 1) << 16) | (m50633(i + 2) << 8) | m50633(i + 3);
        return (((long) iM50633) << 32) | (((long) (m50633(i + 7) | (bArr[i + 4] << 24) | (m50633(i + 5) << 16) | (m50633(i + 6) << 8))) & 4294967295L);
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int m50642(int i) {
        m50635(i, i + 1);
        return m50633(i);
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int m50641(int i) {
        m50635(i, i + 2);
        return m50633(i + 1) | (m50633(i) << 8);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m50639(int i, byte[] bArr) {
        int length = bArr.length - i;
        int i2 = this.f72689;
        if (length < i2) {
            throw new IndexOutOfBoundsException("(out.length - offset) < size()");
        }
        System.arraycopy(this.f72688, 0, bArr, i, i2);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m50635(int i, int i2) {
        int i3 = this.f72689;
        if (i < 0 || i2 < i || i2 > i3) {
            StringBuilder sbM5126 = C1402.m5126("bad range: ", i, "..", "; actual size ", i2);
            sbM5126.append(i3);
            throw new IllegalArgumentException(sbM5126.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int m50633(int i) {
        return this.f72688[i] & 255;
    }
}
