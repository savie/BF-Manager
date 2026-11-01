package l;

import java.lang.reflect.Array;
import java.util.Arrays;

/* JADX INFO: renamed from: l.᩶۟᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 2267 */
/* JADX INFO: loaded from: classes4.dex */
public final class C20032 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final byte[][] f64142;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int f64143;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f64144;

    public C20032(int i, int i2) {
        this.f64142 = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, i2, i);
        this.f64143 = i;
        this.f64144 = i2;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int m45362() {
        return this.f64144;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int m45357() {
        return this.f64143;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final byte m45358(int i, int i2) {
        return this.f64142[i2][i];
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final byte[][] m45363() {
        return this.f64142;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m45360(int i, int i2, int i3) {
        this.f64142[i2][i] = (byte) i3;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m45361(int i, int i2, boolean z) {
        this.f64142[i2][i] = z ? (byte) 1 : (byte) 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m45359() {
        for (byte[] bArr : this.f64142) {
            Arrays.fill(bArr, (byte) -1);
        }
    }

    public final String toString() {
        int i = this.f64143;
        int i2 = this.f64144;
        StringBuilder sb = new StringBuilder((i * 2 * i2) + 2);
        for (int i3 = 0; i3 < i2; i3++) {
            byte[] bArr = this.f64142[i3];
            for (int i4 = 0; i4 < i; i4++) {
                byte b = bArr[i4];
                if (b == 0) {
                    sb.append(" 0");
                } else if (b == 1) {
                    sb.append(" 1");
                } else {
                    sb.append(EnumC19730.f63352);
                }
            }
            sb.append('\n');
        }
        return sb.toString();
    }
}
