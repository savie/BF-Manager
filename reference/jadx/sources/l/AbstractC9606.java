package l;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.ۢ۬ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: 61SM */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC9606 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final int f32359;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int f32360;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final byte[] f32362;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int f32363;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f32367;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int f32368;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public int f32364 = -1;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public int f32361 = -1;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public boolean f32365 = false;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public int f32369 = 0;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public int f32366 = 0;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public abstract void mo24483(int i);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public abstract void mo24491(C17720 c17720);

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public abstract C4396 mo24496();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m24482(int i, int i2, int[] iArr) {
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
    public static AbstractC9606 m24481(int i, int i2, int i3, int i4, int i5, int i6, C17720 c17720) {
        if (i5 == 4) {
            return new C23717(i, i2, i3, i4, i6, c17720);
        }
        if (i5 == 20) {
            return new C11017(i, i2, i3, i4, i6, c17720);
        }
        throw new IllegalArgumentException();
    }

    public AbstractC9606(int i, int i2, int i3, int i4, C17720 c17720) {
        int i5 = i2 + i;
        int i6 = i3 + 273;
        int iMin = i5 + i6 + Math.min((i / 2) + 262144, 536870912);
        this.f32367 = iMin;
        this.f32362 = c17720.mo25183(iMin);
        this.f32363 = i5;
        this.f32360 = i6;
        this.f32368 = 273;
        this.f32359 = i4;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m24489(int i, int i2, byte[] bArr) {
        int i3 = this.f32364;
        int i4 = this.f32367;
        int i5 = this.f32360;
        int i6 = i4 - i5;
        byte[] bArr2 = this.f32362;
        if (i3 >= i6) {
            int i7 = ((i3 + 1) - this.f32363) & (-16);
            System.arraycopy(bArr2, i7, bArr2, 0, this.f32369 - i7);
            this.f32364 -= i7;
            this.f32361 -= i7;
            this.f32369 -= i7;
        }
        int i8 = this.f32369;
        int i9 = i4 - i8;
        if (i2 > i9) {
            i2 = i9;
        }
        System.arraycopy(bArr, i, bArr2, i8, i2);
        int i10 = this.f32369 + i2;
        this.f32369 = i10;
        if (i10 >= i5) {
            this.f32361 = i10 - i5;
        }
        m24480();
        return i2;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    private void m24480() {
        int i;
        int i2 = this.f32366;
        if (i2 <= 0 || (i = this.f32364) >= this.f32361) {
            return;
        }
        this.f32364 = i - i2;
        this.f32366 = 0;
        mo24483(i2);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final boolean m24484() {
        return this.f32364 != -1;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final void m24498() {
        this.f32361 = this.f32369 - 1;
        m24480();
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m24492() {
        this.f32361 = this.f32369 - 1;
        this.f32365 = true;
        m24480();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m24497(int i) {
        return this.f32364 - i < this.f32361;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m24490(OutputStream outputStream, int i, int i2) throws IOException {
        outputStream.write(this.f32362, (this.f32364 + 1) - i, i2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m24485() {
        return this.f32369 - this.f32364;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int m24493() {
        return this.f32364;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m24486(int i) {
        return this.f32362[this.f32364 - i] & 255;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m24487(int i, int i2) {
        return this.f32362[(this.f32364 + i) - i2] & 255;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int m24495(int i, int i2) {
        return C3254.m9734(this.f32362, this.f32364, i + 1, 0, i2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m24488(int i, int i2, int i3) {
        return C3254.m9734(this.f32362, this.f32364 + i, i2 + 1, 0, i3);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int m24494(int i) {
        int i2 = this.f32364 + 1;
        this.f32364 = i2;
        int i3 = this.f32369 - i2;
        if (i3 >= i || (i3 >= 4 && this.f32365)) {
            return i3;
        }
        this.f32366++;
        return 0;
    }
}
