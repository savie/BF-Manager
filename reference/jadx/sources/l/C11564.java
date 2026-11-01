package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ۨ۟᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: S7S9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C11564 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int f38897;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C13681 f38899;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final byte[] f38903;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int[] f38904;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final C21441 f38896 = new C21441();

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f38901 = 0;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean[] f38900 = new boolean[256];

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public int f38902 = -1;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public int f38898 = 0;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m28862(int i, int i2) {
        int i3 = this.f38901;
        boolean[] zArr = this.f38900;
        zArr[i] = true;
        this.f38896.m48023(i, i2);
        byte b = (byte) i;
        byte[] bArr = this.f38903;
        if (i2 == 1) {
            bArr[i3] = b;
            this.f38901 = i3 + 1;
            return;
        }
        if (i2 == 2) {
            bArr[i3] = b;
            bArr[i3 + 1] = b;
            this.f38901 = i3 + 2;
        } else {
            if (i2 == 3) {
                bArr[i3] = b;
                bArr[i3 + 1] = b;
                bArr[i3 + 2] = b;
                this.f38901 = i3 + 3;
                return;
            }
            int i4 = i2 - 4;
            zArr[i4] = true;
            bArr[i3] = b;
            bArr[i3 + 1] = b;
            bArr[i3 + 2] = b;
            bArr[i3 + 3] = b;
            bArr[i3 + 4] = (byte) i4;
            this.f38901 = i3 + 5;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m28864(int i) {
        if (this.f38901 > this.f38897) {
            return false;
        }
        int i2 = this.f38902;
        int i3 = this.f38898;
        if (i3 == 0) {
            this.f38902 = i;
            this.f38898 = 1;
        } else if (i2 != i) {
            m28862(i2 & 255, i3);
            this.f38902 = i;
            this.f38898 = 1;
        } else if (i3 == 254) {
            m28862(i2 & 255, 255);
            this.f38898 = 0;
        } else {
            this.f38898 = i3 + 1;
        }
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m28863() throws IOException {
        boolean[] zArr;
        int i = this.f38898;
        if (i > 0) {
            m28862(this.f38902 & 255, i);
        }
        int i2 = this.f38901;
        byte[] bArr = this.f38903;
        bArr[i2] = bArr[0];
        int[] iArr = this.f38904;
        int iM49136 = new C22147(bArr, i2, iArr).m49136();
        C13681 c13681 = this.f38899;
        c13681.m33384(24, 3227993);
        c13681.m33384(24, 2511705);
        int iM48021 = this.f38896.m48021();
        c13681.m33384(16, (iM48021 >>> 16) & 65535);
        c13681.m33384(16, iM48021 & 65535);
        c13681.m33385(false);
        c13681.m33384(24, iM49136);
        boolean[] zArr2 = new boolean[16];
        int i3 = 0;
        while (true) {
            zArr = this.f38900;
            if (i3 >= 16) {
                break;
            }
            int i4 = i3 << 4;
            int i5 = 0;
            while (i5 < 16) {
                if (zArr[i4]) {
                    zArr2[i3] = true;
                }
                i5++;
                i4++;
            }
            i3++;
        }
        for (int i6 = 0; i6 < 16; i6++) {
            c13681.m33385(zArr2[i6]);
        }
        for (int i7 = 0; i7 < 16; i7++) {
            if (zArr2[i7]) {
                int i8 = i7 * 16;
                int i9 = 0;
                while (i9 < 16) {
                    c13681.m33385(zArr[i8]);
                    i9++;
                    i8++;
                }
            }
        }
        C22853 c22853 = new C22853(iArr, this.f38901, zArr);
        c22853.m50595();
        new C3801(this.f38899, c22853.m50597(), c22853.m50594(), c22853.m50598(), c22853.m50596()).m11090();
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean m28865() {
        return this.f38901 == 0 && this.f38898 == 0;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int m28866() {
        return this.f38896.m48021();
    }

    public C11564(C13681 c13681, int i) {
        this.f38899 = c13681;
        int i2 = i + 1;
        this.f38903 = new byte[i2];
        this.f38904 = new int[i2];
        this.f38897 = i - 6;
    }
}
