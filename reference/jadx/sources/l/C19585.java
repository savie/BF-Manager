package l;

import java.lang.reflect.Array;
import java.util.Arrays;

/* JADX INFO: renamed from: l.ᩴۙܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 2267 */
/* JADX INFO: loaded from: classes5.dex */
public final class C19585 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final byte[][] f63159;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int f63160;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f63161;

    public C19585(int i, int i2) {
        this.f63159 = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, i2, i);
        this.f63160 = i;
        this.f63161 = i2;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int m45185() {
        return this.f63161;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int m45187() {
        return this.f63160;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final byte m45181(int i, int i2) {
        return this.f63159[i2][i];
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final byte[][] m45186() {
        return this.f63159;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m45183(int i, int i2, int i3) {
        this.f63159[i2][i] = (byte) i3;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m45184(int i, int i2, boolean z) {
        this.f63159[i2][i] = z ? (byte) 1 : (byte) 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m45182() {
        for (byte[] bArr : this.f63159) {
            Arrays.fill(bArr, (byte) -1);
        }
    }

    public final String toString() {
        int i = this.f63160;
        int i2 = this.f63161;
        StringBuilder sb = new StringBuilder((i * 2 * i2) + 2);
        for (int i3 = 0; i3 < i2; i3++) {
            byte[] bArr = this.f63159[i3];
            for (int i4 = 0; i4 < i; i4++) {
                byte b = bArr[i4];
                if (b == 0) {
                    sb.append(" 0");
                } else if (b == 1) {
                    sb.append(" 1");
                } else {
                    sb.append(EnumC7687.f25319);
                }
            }
            sb.append('\n');
        }
        return sb.toString();
    }
}
