package l;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.᩻᩹᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: 61SM */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC25362 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final byte[] f81884;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final int f81888;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int f81889;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int f81890;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f81891;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f81892;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f81887 = -1;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f81883 = -1;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public boolean f81886 = false;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f81893 = 0;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f81885 = 0;

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo17391(C0573 c0573);

    /* JADX INFO: renamed from: ᩷ */
    public abstract C17902 mo17392();

    /* JADX INFO: renamed from: ᩸ */
    public abstract void mo17393(int i);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m56714(int i, int i2, int[] iArr) {
        for (int i3 = 0; i3 < i; i3++) {
            int i4 = iArr[i3];
            if (i4 <= i2) {
                iArr[i3] = 0;
            } else {
                iArr[i3] = i4 - i2;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC25362 m56713(int i, int i2, int i3, int i4, int i5, int i6, C0573 c0573) {
        if (i5 == 4) {
            return new C5970(i, i2, i3, i4, i6, c0573);
        }
        if (i5 == 20) {
            return new C13427(i, i2, i3, i4, i6, c0573);
        }
        throw new IllegalArgumentException();
    }

    public AbstractC25362(int i, int i2, int i3, int i4, C0573 c0573) {
        int i5 = i2 + i;
        int i6 = i3 + 273;
        int iMin = i5 + i6 + Math.min((i / 2) + 262144, 536870912);
        this.f81891 = iMin;
        this.f81884 = c0573.mo2594(iMin);
        this.f81890 = i5;
        this.f81892 = i6;
        this.f81889 = 273;
        this.f81888 = i4;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m56720(int i, int i2, byte[] bArr) {
        int i3 = this.f81887;
        int i4 = this.f81891;
        int i5 = this.f81892;
        int i6 = i4 - i5;
        byte[] bArr2 = this.f81884;
        if (i3 >= i6) {
            int i7 = ((i3 + 1) - this.f81890) & (-16);
            System.arraycopy(bArr2, i7, bArr2, 0, this.f81893 - i7);
            this.f81887 -= i7;
            this.f81883 -= i7;
            this.f81893 -= i7;
        }
        int i8 = this.f81893;
        int i9 = i4 - i8;
        if (i2 > i9) {
            i2 = i9;
        }
        System.arraycopy(bArr, i, bArr2, i8, i2);
        int i10 = this.f81893 + i2;
        this.f81893 = i10;
        if (i10 >= i5) {
            this.f81883 = i10 - i5;
        }
        m56715();
        return i2;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    private void m56715() {
        int i;
        int i2 = this.f81885;
        if (i2 <= 0 || (i = this.f81887) >= this.f81883) {
            return;
        }
        this.f81887 = i - i2;
        this.f81885 = 0;
        mo17393(i2);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean m56728() {
        return this.f81887 != -1;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m56724() {
        this.f81883 = this.f81893 - 1;
        m56715();
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m56725() {
        this.f81883 = this.f81893 - 1;
        this.f81886 = true;
        m56715();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m56727(int i) {
        return this.f81887 - i < this.f81883;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m56721(OutputStream outputStream, int i, int i2) throws IOException {
        outputStream.write(this.f81884, (this.f81887 + 1) - i, i2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m56716() {
        return this.f81893 - this.f81887;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int m56722() {
        return this.f81887;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m56717(int i) {
        return this.f81884[this.f81887 - i] & 255;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m56718(int i, int i2) {
        return this.f81884[(this.f81887 + i) - i2] & 255;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m56726(int i, int i2) {
        return C17156.m40309(this.f81884, this.f81887, i + 1, 0, i2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m56719(int i, int i2, int i3) {
        return C17156.m40309(this.f81884, this.f81887 + i, i2 + 1, 0, i3);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int m56723(int i) {
        int i2 = this.f81887 + 1;
        this.f81887 = i2;
        int i3 = this.f81893 - i2;
        if (i3 >= i || (i3 >= 4 && this.f81886)) {
            return i3;
        }
        this.f81885++;
        return 0;
    }
}
