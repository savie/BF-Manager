package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.ܰᩴܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 439X */
/* JADX INFO: loaded from: classes3.dex */
public final class C14009 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final byte[] f46030;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f46031;

    public C14009(byte[] bArr) {
        int length = bArr.length;
        if (length < 0) {
            throw new IllegalArgumentException("end < start");
        }
        if (length > bArr.length) {
            throw new IllegalArgumentException("end > bytes.length");
        }
        this.f46030 = bArr;
        this.f46031 = length;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m33864() {
        return this.f46031;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C14009 m33866(int i, int i2) {
        m33862(i, i2);
        return new C14009(Arrays.copyOfRange(this.f46030, i, i2));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m33865(int i) {
        m33862(i, i + 1);
        return this.f46030[i];
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int m33863(int i) {
        m33862(i, i + 2);
        return m33858(i + 1) | (this.f46030[i] << 8);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int m33870(int i) {
        m33862(i, i + 4);
        return m33858(i + 3) | (this.f46030[i] << 24) | (m33858(i + 1) << 16) | (m33858(i + 2) << 8);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final long m33869(int i) {
        m33862(i, i + 8);
        byte[] bArr = this.f46030;
        int iM33858 = (bArr[i] << 24) | (m33858(i + 1) << 16) | (m33858(i + 2) << 8) | m33858(i + 3);
        return (((long) iM33858) << 32) | (((long) (m33858(i + 7) | (bArr[i + 4] << 24) | (m33858(i + 5) << 16) | (m33858(i + 6) << 8))) & 4294967295L);
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int m33868(int i) {
        m33862(i, i + 1);
        return m33858(i);
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int m33871(int i) {
        m33862(i, i + 2);
        return m33858(i + 1) | (m33858(i) << 8);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m33867(int i, byte[] bArr) {
        int length = bArr.length - i;
        int i2 = this.f46031;
        if (length < i2) {
            throw new IndexOutOfBoundsException("(out.length - offset) < size()");
        }
        System.arraycopy(this.f46030, 0, bArr, i, i2);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private void m33862(int i, int i2) {
        int i3 = this.f46031;
        if (i < 0 || i2 < i || i2 > i3) {
            StringBuilder sbM2791 = C0589.m2791("bad range: ", i, "..", "; actual size ", i2);
            sbM2791.append(i3);
            throw new IllegalArgumentException(sbM2791.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public int m33858(int i) {
        return this.f46030[i] & 255;
    }
}
